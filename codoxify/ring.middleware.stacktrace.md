# ring.middleware.stacktrace

Middleware that catches exceptions thrown by the handler, and reports the
error and stacktrace via a webpage and STDERR log.

This middleware is for debugging purposes, and should be limited to
development environments.

## wrap-stacktrace
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
Wrap a handler such that exceptions are caught, a corresponding stacktrace is
logged to *err*, and a HTML representation of the stacktrace is returned as a
response.

Accepts the following option:

:color? - if true, apply ANSI colors to terminal stacktrace (default false)
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-devel/src/ring/middleware/stacktrace.clj#L107)
## wrap-stacktrace-log
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
Wrap a handler such that exceptions are logged to *err* and then rethrown.
Accepts the following options:

:color? - if true, apply ANSI colors to stacktrace (default false)
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-devel/src/ring/middleware/stacktrace.clj#L14)
## wrap-stacktrace-web
**Type:** var



**Arguments:**
```clojure
[handler]
```
Wrap a handler such that exceptions are caught and a response containing
a HTML representation of the exception and stacktrace is returned.
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-devel/src/ring/middleware/stacktrace.clj#L91)