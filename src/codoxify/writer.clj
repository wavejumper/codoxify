(ns codoxify.writer
  (:require [clojure.string :as str]))

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
  (write-lines [(format "### [%s](%s)" (:name ns) "#")
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

(defn write-index
  [_ project]
  (let [md (write-lines
            [(format "# %s %s {docsify-ignore-all}" (:name project) (:version project))
             (description-section (:description project))
             (license-section (:license project))
             (package-section (package project) (:version project))
             (topics-section (:documents project))
             (namespaces-section (:namespaces project))

             ])]
    md))

(defn ^:deprecated multi-arity
  "*** This is a docstring ***"
  ([a])
  ([a b]))

(defn write-sidebar
  [project]
  (write-lines (into ["* [Overview](/)"]
                     (map (fn [ns]
                            (format "* [%s](%s)" (:name ns) (str "/" (:name ns)))))
                     (sort-by :name (:namespaces project)))))

(defprotocol MyProtocol
  (foo [this]))

(defn arglists [args]
  (when (seq args)
    (write-lines
     (for [arg args]
       (str "`" arg "`\n")))))

(defmulti render-var (fn [ctx var] (:type var)))

(defmethod render-var :default
  [{:keys [nested?]} v]
  (let [indentation (if nested? "###" "##")]
    [(if (:deprecated v)
       (format "%s ~%s~" indentation (:name v))
       (format "%s %s" indentation (:name v)))
     (:doc v)
     (arglists (:arglists v))
     (when-not nested?
       (format "[View source](%s)" "#"))]))

(defmethod render-var :protocol
  [_ v]
  (into [(if (:deprecated v)
           (format "## ~%s~" (:name v))
           (format "## %s" (:name v)))
         (:doc v)
         (format "[View source](%s)" "#")]
        (mapcat (partial render-var {:nested? true}))
        (:members v)))

(defn write-ns [ns]
  (write-lines (into [(format "# %s" (:name ns))
                      (when (:doc ns)
                        (write-lines ["" (:doc ns) ""]))]
                     (mapcat (partial render-var nil))
                     (sorted-public-vars ns))))

(defn write-docs
  [{:keys [output-path] :as project}]
  (spit "project.edn" (pr-str project))
  (spit "docs/_sidebar.md" (write-sidebar project))
  (spit "docs/README.md" (write-index nil project))
  (doseq [ns (:namespaces project)]
    (spit (str "docs/" (:name ns) ".md")
          (write-ns ns)
          ))
  (println (write-index nil project)))