(defproject wavejumper/tonal "3.6.5-4"
  :description "Codox writer for docsify"
  :url "https://github.com/wavejumper/tonal-clj"

  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies
  [[org.clojure/clojure "1.10.1"]]

  :codox {:writer       codoxify.writer/write-docs
          :source-paths ["src"]
          :source-uri   "https://github.com/foo/bar/blob/{version}/{filepath}#L{line}"}

  :plugins
  [[lein-codox "0.10.7"]])
