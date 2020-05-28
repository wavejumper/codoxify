# ring.middleware.not-modified


```
Middleware that returns a 304 Not Modified response for responses with
Last-Modified headers.
```

## not-modified-response
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[response request]
```
```
Returns 304 or original response based on response and request.
See: wrap-not-modified.
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/not_modified.clj#L38)
## wrap-not-modified
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[handler]
```
```
Middleware that returns a 304 Not Modified from the wrapped handler if the
handler response has an ETag or Last-Modified header, and the request has a
If-None-Match or If-Modified-Since header that matches the response.
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/not_modified.clj#L53)