# ring.middleware.resource

Middleware for serving static resources.


## resource-request
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request root-path]
[request root-path options]
```
If request matches a static resource, returns it in a response map.
Otherwise returns nil. See wrap-resource for the available options.
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/resource.clj#L9)
## wrap-resource
**Type:** var



**Arguments:**
```clojure
[handler root-path]
[handler root-path options]
```
Middleware that first checks to see whether the request map matches a static
resource. If it does, the resource is returned in a response map, otherwise
the request map is passed onto the handler. The root-path argument will be
added to the beginning of the resource path.

Accepts the following options:

:loader          - resolve the resource using this class loader
:allow-symlinks? - allow symlinks that lead to paths outside the root
                   classpath directories (defaults to false)
:prefer-handler? - prioritize handler response over resources (defaults to
                   false)
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/resource.clj#L48)