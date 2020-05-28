# ring.middleware.params


Middleware to parse url-encoded parameters from the query string and request
body.

## assoc-form-params
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request encoding]
```
Parse and assoc parameters from the request body with the request.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/params.clj#L21)
## assoc-query-params
**Type:** var

**Added:** 1.3


**Arguments:**
```clojure
[request encoding]
```
Parse and assoc parameters from the query string with the request.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/params.clj#L11)
## params-request
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request]
[request options]
```
Adds parameters from the query string and the request body to the request
map. See: wrap-params.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/params.clj#L31)
## wrap-params
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
Middleware to parse urlencoded parameters from the query string and form
body (if the request is a url-encoded form). Adds the following keys to
the request map:

:query-params - a map of parameters from the query string
:form-params  - a map of parameters from the body
:params       - a merged map of all types of parameter

Accepts the following options:      

:encoding - encoding to use for url-decoding. If not specified, uses
            the request character encoding, or "UTF-8" if no request
            character encoding is set.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/params.clj#L48)