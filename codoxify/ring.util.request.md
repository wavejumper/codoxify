# ring.util.request

Functions for augmenting and pulling information from request maps.


## body-string
**Type:** multimethod

**Added:** 1.2


**Arguments:**
```clojure
[request]
```
Return the request body as a string.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/request.clj#L45)
## character-encoding
**Type:** var

**Added:** 1.3


**Arguments:**
```clojure
[request]
```
Return the character encoding for the request, or nil if it is not set.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/request.clj#L31)
## content-length
**Type:** var

**Added:** 1.3


**Arguments:**
```clojure
[request]
```
Return the content-length of the request, or nil no content-length is set.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/request.clj#L24)
## content-type
**Type:** var

**Added:** 1.3


**Arguments:**
```clojure
[request]
```
Return the content-type of the request, or nil if no content-type is set.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/request.clj#L16)
## in-context?
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request context]
```
Returns true if the URI of the request is a subpath of the supplied context.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/request.clj#L71)
## path-info
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request]
```
Returns the relative path of the request.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/request.clj#L64)
## request-url
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request]
```
Return the full URL of the request.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/request.clj#L5)
## set-context
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request context]
```
Associate a context and path-info with the  request. The request URI must be
a subpath of the supplied context.
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/request.clj#L77)
## urlencoded-form?
**Type:** var

**Added:** 1.3


**Arguments:**
```clojure
[request]
```
True if a request contains a urlencoded form in the body.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/request.clj#L38)