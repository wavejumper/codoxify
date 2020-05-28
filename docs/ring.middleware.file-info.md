# ring.middleware.file-info


Middleware to add Last-Modified and Content-Type headers to file responses.

This middleware is deprecated. Prefer the ring.middleware.content-type and
ring.middleware.not-modified middleware instead.

## ~file-info-response~
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[response request]
[response request mime-types]
```
Adds headers to response as described in wrap-file-info.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/file_info.clj#L34)
## ~wrap-file-info~
**Type:** var



**Arguments:**
```clojure
[handler]
[handler mime-types]
```
Wrap a handler such that responses with a file for a body will have
corresponding Content-Type, Content-Length, and Last Modified headers added if
they can be determined from the file.

If the request specifies a If-Modified-Since header that matches the last
modification date of the file, a 304 Not Modified response is returned.
If two arguments are given, the second is taken to be a map of file extensions
to content types that will supplement the default, built-in map.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/file_info.clj#L58)