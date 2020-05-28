# ring.middleware.content-type

Middleware for automatically adding a content type to response maps.


## content-type-response
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[response request]
[response request options]
```
Adds a content-type header to response. See: wrap-content-type.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/content_type.clj#L6)
## wrap-content-type
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
Middleware that adds a content-type header to the response if one is not
set by the handler. Uses the ring.util.mime-type/ext-mime-type function to
guess the content-type from the file extension in the URI. If no
content-type can be found, it defaults to 'application/octet-stream'.

Accepts the following options:

:mime-types - a map of filename extensions to mime-types that will be
              used in addition to the ones defined in
              ring.util.mime-type/default-mime-types
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/content_type.clj#L18)