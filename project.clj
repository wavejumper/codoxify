(defproject wavejumper/codox "1.0.0"
  :description "Generate Clojure docs for docsify"
  :url "https://github.com/wavejumper/codox"

  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies
  [[org.clojure/clojure "1.10.1"]]

  :codox {:writer       codoxify.writer/write-docs
          :source-paths ["src"]
          :source-uri   "https://github.com/foo/bar/blob/{version}/{filepath}#L{line}"}

  :plugins
  [[lein-codox "0.10.7"]])
