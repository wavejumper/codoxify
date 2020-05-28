# codoxify

Uses [codox](https://github.com/weavejester/codox) to build Clojure documentation for [docsify](https://github.com/docsifyjs/docsify)

## Usage

Follow the installation instructions and usage for [codox](https://github.com/weavejester/codox)

Add `codoxify` as a dependency to your `project.clj`:

```clojure
:profiles {:codox {:dependencies [[codox "1.0.0"]]
                   :plugins [[lein-codox "0.10.7"]]}}
```

Without any extra configuration, this will compile your documentation to `target/docs`

```
npx docsify serve ./target/docs
```

## Example

An example of the [ring](https://github.com/ring-clojure/ring) project generated with codoxify can be found [here]()