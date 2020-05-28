# codoxify

Use [codox](https://github.com/weavejester/codox) to build Clojure documentation for [docsify](https://github.com/docsifyjs/docsify)

## Usage

Follow the installation instructions and usage for [codox](https://github.com/weavejester/codox)

Add `codoxify` as a dependency to your `project.clj`:

```clojure
:profiles {:codox {:dependencies [[wavejumper/codoxify "1.0.0"]]
                   :plugins      [[lein-codox "0.10.7"]]
                   :codox        {:writer codoxify.writer/write-docs}}}
```

Without any extra configuration, this will compile your documentation to `target/docs`

```
npx init ./target/docs
npx docsify serve ./target/docs
lein with-profiles +codox codox
```

## Example

An example of the [ring](https://github.com/ring-clojure/ring) project generated with codoxify can be found [here](https://tscrowley.dev/codoxify/)
