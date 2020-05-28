# ring.middleware.lint

Middleware that checks Ring requests and responses for correctness.


## wrap-lint
**Type:** var



**Arguments:**
```clojure
[handler]
```
Wrap a handler to validate incoming requests and outgoing responses
according to the current Ring specification. An exception is raised if either
the request or response is invalid.
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-devel/src/ring/middleware/lint.clj#L91)