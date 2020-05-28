# ring.middleware.flash


Middleware that adds session-based flash store that persists only to the
next request in the same session.

## flash-request
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request]
```
Adds :flash key to request from :_flash in session.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/flash.clj#L5)
## flash-response
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[response request]
```
If response has a :flash key, saves it in :_flash of session for next
request.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/flash.clj#L14)
## wrap-flash
**Type:** var



**Arguments:**
```clojure
[handler]
```
If a :flash key is set on the response by the handler, a :flash key with
the same value will be set on the next request that shares the same session.
This is useful for small messages that persist across redirects.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/flash.clj#L31)