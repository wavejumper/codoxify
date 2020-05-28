# ring.middleware.file


```
Middleware to serve files from a directory.

Most of the time you should prefer ring.middleware.resource instead, as this
middleware will not work with files in jar or war files.
```

## file-request
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request root-path]
[request root-path options]
```
```
If request matches a static file, returns it in a response. Otherwise
returns nil. See: wrap-file.
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/file.clj#L19)
## wrap-file
**Type:** var



**Arguments:**
```clojure
[handler root-path]
[handler root-path options]
```
```
Wrap an handler such that the directory at the given root-path is checked for
a static file with which to respond to the request, proxying the request to
the wrapped handler if such a file does not exist.

Accepts the following options:

:index-files?    - look for index.* files in directories, defaults to true
:allow-symlinks? - serve files through symbolic links, defaults to false
:prefer-handler? - prioritize handler response over files, defaults to false
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/file.clj#L59)