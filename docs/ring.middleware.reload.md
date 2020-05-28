# ring.middleware.reload

Middleware that reloads modified namespaces on each request.

This middleware should be limited to use in development environments.

## wrap-reload
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
Reload namespaces of modified files before the request is passed to the
supplied handler.

Accepts the following options:

:dirs                   - A list of directories that contain the source files.
                          Defaults to ["src"].
:reload-compile-errors? - If true, keep attempting to reload namespaces
                          that have compile errors.  Defaults to true.
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-devel/src/ring/middleware/reload.clj#L21)