(ns codoxify.writer
  (:require [clojure.string :as str]
            [clojure.java.io :as io])
  (:import (java.io File)))

(defn- strip-prefix [s prefix]
  (if s (str/replace s (re-pattern (str "(?i)^" prefix)) "")))

(defn write-lines [coll]
  (str/join "\n" coll))

(defn- sorted-public-vars [namespace]
  (sort-by (comp str/lower-case :name) (:publics namespace)))

(defn license-section
  [{:keys [name url]}]
  (when-let [license-name (-> name (strip-prefix "the "))]
    (write-lines ["## License"
                  (if url
                    (format "Released under the [%s](%s) license" license-name url)
                    (format "Released under the %s license" license-name))])))

(defn description-section
  [description]
  (when description
    (write-lines ["## Description"
                  description])))

(defn- package [project]
  (if-let [p (:package project)]
    (if (= (namespace p) (name p))
      (symbol (name p))
      p)))

(defn package-section
  [package version]
  (when package
    (write-lines ["## Installation"
                  "To install, add the following dependency to your project or build file:"
                  "##### Lein"
                  "```clojure"
                  (format "[%s %s]" package (pr-str version))
                  "```"
                  "##### Deps"
                  "```clojure"
                  (format "%s {:mvn/version %s}" package (pr-str version))
                  "```"])))

(defn- doc-filename [doc]
  (str (:name doc) ".html"))

(defn topics-section
  [documents]
  (when (seq documents)
    (write-lines (into ["## Topics"]
                       (map (fn [doc]
                              ["* [%s](%s)" (:title doc) (doc-filename doc)])
                            documents)))))

(defn namespace-section [ns]
  (write-lines [(format "### [%s](%s)" (:name ns) (str "/" (:name ns)))
                (when (:doc ns)
                  (write-lines ["" (:doc ns) ""]))
                (str "Public variables and functions: "
                     (str/join " " (map (fn [v]
                                          (format "[%s](%s)" (:name v) (str "/" (:name ns) "?id=" (:name v))))
                                        (sorted-public-vars ns))))]))

(defn namespaces-section
  [namespaces]
  (let [namespaces (sort-by :name namespaces)]
    (write-lines (into ["## Namespaces"]
                       (map namespace-section)
                       namespaces))))

(defn generate-index-md
  [project]
  (write-lines
   [(format "# %s %s {docsify-ignore-all}" (:name project) (:version project))
    (description-section (:description project))
    (license-section (:license project))
    (package-section (package project) (:version project))
    (topics-section (:documents project))
    (namespaces-section (:namespaces project))]))

(defn generate-sidebar-md
  [project]
  (write-lines (into ["* [Overview](/)"]
                     (map (fn [ns]
                            (format "* [%s](%s)" (:name ns) (str "/" (:name ns)))))
                     (sort-by :name (:namespaces project)))))

(defn arglists [args]
  (when (seq args)
    (write-lines ["**Arguments:**"
                  "```clojure"
                  (write-lines args)
                  "```"])))

(defmulti render-var (fn [ctx var] (:type var)))

(defn escape-name [name]
  (str/replace name #"\*" "\\\\*"))

(defn- get-source-uri [source-uris path]
  (some (fn [[re f]] (if (re-find re path) f)) source-uris))

(defn- uri-basename [path]
  (second (re-find #"/([^/]+?)$" path)))

(defn uri-path [path]
  (str/replace (str path) File/separator "/"))

(defn- force-replace [^String s match replacement]
  (if (.contains s match)
    (str/replace s match (force replacement))
    s))

(defn- var-source-uri
  [{:keys [source-uri version git-commit]}
   {:keys [path file line]}]
  (let [path (uri-path path)
        uri  (if (map? source-uri) (get-source-uri source-uri path) source-uri)]
    (-> uri
        (str/replace   "{filepath}"   path)
        (str/replace   "{classpath}"  (uri-path file))
        (str/replace   "{basename}"   (uri-basename path))
        (str/replace   "{line}"       (str line))
        (str/replace   "{version}"    (str version))
        (force-replace "{git-commit}" git-commit))))

(defn view-source [ctx v]
  (format "[View source](%s)" (var-source-uri ctx v)))

(defmethod render-var :default
  [{:keys [nested?] :as ctx} v]
  (let [indentation (if nested? "###" "##")]
    [(if (:deprecated v)
       (format "%s ~%s~" indentation (escape-name (:name v)))
       (format "%s %s" indentation (escape-name (:name v))))
     (format "**Type:** %s\n" (name (:type v)))
     (when (:added v)
       (format "**Added:** %s\n" (:added v)))
     (when (:dynamic v)
       "**Dynamic:** true\n")
     (arglists (:arglists v))
     (:doc v)
     ""
     (when-not nested?
       (view-source ctx v))]))

(defmethod render-var :protocol
  [ctx v]
  (-> (into [(if (:deprecated v)
               (format "## ~%s~" (:name v))
               (format "## %s" (:name v)))
             "**Type:** protocol"
             (:doc v)]
            (mapcat (partial render-var (assoc ctx :nested? true)))
            (:members v))
      (conj (format "[View source](%s)" "#"))))

(defn generate-ns-md
  [project ns]
  (write-lines (into [(format "# %s" (:name ns))
                      (when (:added ns)
                        (format "**Added:** %s\n" (:added ns)))
                      (when (:doc ns)
                        (write-lines ["" (:doc ns) ""]))]
                     (mapcat (partial render-var project))
                     (sorted-public-vars ns))))

(defn- make-parent-dir!
  [file]
  (try
    (-> file io/file .getParentFile .mkdirs)
    (catch Throwable _)))

(defn write!
  [output-dir file s]
  (let [file (io/file output-dir file)]
    (make-parent-dir! file)
    (spit file s)))

(defn write-namespaces!
  [output-dir project]
  (doseq [ns (:namespaces project)]
    (let [file (io/file output-dir (str (:name ns) ".md"))]
      (make-parent-dir! file)
      (spit file (generate-ns-md project ns)))))

(defn write-docs
  [{:keys [output-path] :as project}]
  (make-parent-dir! output-path)
  (doto output-path
    (write! "_sidebar.md" (generate-sidebar-md project))
    (write! "README.md" (generate-index-md project))
    (write-namespaces! project)))