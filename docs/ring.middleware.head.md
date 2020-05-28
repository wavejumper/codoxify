# ring.middleware.head


Middleware to simplify replying to HEAD requests.

A response to a HEAD request should be identical to a GET request, with the
exception that a response to a HEAD request should have an empty body.

## head-request
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request]
```
Turns a HEAD request into a GET.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/head.clj#L7)
## head-response
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[response request]
```
Returns a nil body if original request was a HEAD.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/head.clj#L15)
## wrap-head
**Type:** var

**Added:** 1.1


**Arguments:**
```clojure
[handler]
```
Middleware that turns any HEAD request into a GET, and then sets the response
body to nil.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/head.clj#L23)