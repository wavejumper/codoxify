# codoxify

Use [codox](https://github.com/weavejester/codox) to build Clojure documentation for [docsify](https://github.com/docsifyjs/docsify)

## Usage

Follow the installation instructions and usage for [codox](https://github.com/weavejester/codox)

Add `codoxify` as a dependency to your `project.clj`:

```clojure
:profiles {:codox {:dependencies [[wavejumper/codoxify "1.0.2"]]
                   :plugins      [[lein-codox "0.10.7"]]
                   :codox        {:writer codoxify.writer/write-docs}}}
```

Without any extra configuration, this will compile your documentation to `target/docs`

```
npx init ./target/docs
npx docsify serve ./target/docs
lein with-profiles +codox codox
```

### docsify configuration

edit `./target/docs/index.html` and configure docsify as such:

```javascript
    window.$docsify = {
      loadSidebar: true,
      subMaxLevel: 3, // important
      loadNavbar: true,
      alias: {
        'sidebar.md': '/_sidebar.md' //important
      }
    }
```

## Example

An example of the [ring](https://github.com/ring-clojure/ring) project generated with codoxify can be found [here](https://tscrowley.dev/codoxify/)
