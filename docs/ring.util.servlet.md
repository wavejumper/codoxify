# ring.util.servlet


Compatibility functions for turning a ring handler into a Java servlet.


## build-request-map
**Type:** var



**Arguments:**
```clojure
[request]
```
Create the request map from the HttpServletRequest object.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-servlet/src/ring/util/servlet.clj#L37)
## defservice
**Type:** macro



**Arguments:**
```clojure
[handler]
[prefix handler]
[prefix handler options]
```
Defines a service method with an optional prefix suitable for being used by
genclass to compile a HttpServlet class.

For example:

  (defservice my-handler)
  (defservice "my-prefix-" my-handler)

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-servlet/src/ring/util/servlet.clj#L149)
## make-service-method
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
Turns a handler into a function that takes the same arguments and has the
same return value as the service method in the HttpServlet class.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-servlet/src/ring/util/servlet.clj#L129)
## merge-servlet-keys
**Type:** var



**Arguments:**
```clojure
[request-map servlet request response]
```
Associate servlet-specific keys with the request map for use with legacy
systems.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-servlet/src/ring/util/servlet.clj#L55)
## servlet
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
Create a servlet from a Ring handler.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-servlet/src/ring/util/servlet.clj#L139)
## update-servlet-response
**Type:** var



**Arguments:**
```clojure
[response response-map]
[response context response-map]
```
Update the HttpServletResponse using a response map. Takes an optional
AsyncContext.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-servlet/src/ring/util/servlet.clj#L91)