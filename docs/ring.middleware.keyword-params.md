# ring.middleware.keyword-params


```
Middleware that converts parameter keys in the request to keywords.

```

## keyword-params-request
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request]
[request options]
```
```
Converts string keys in :params map to keywords. See: wrap-keyword-params.

```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/keyword_params.clj#L29)
## wrap-keyword-params
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
```
Middleware that converts the any string keys in the :params map to keywords.
Only keys that can be turned into valid keywords are converted.

This middleware does not alter the maps under :*-params keys. These are left
as strings.

Accepts the following options:

:parse-namespaces? - if true, parse the parameters into namespaced keywords
                     (defaults to false)
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/keyword_params.clj#L37)