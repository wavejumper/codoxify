# ring.util.mime-type

Utility functions for determining the mime-types files.


## default-mime-types
**Type:** var




A map of file extensions to mime-types.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/mime_type.clj#L5)
## ext-mime-type
**Type:** var



**Arguments:**
```clojure
[filename]
[filename mime-types]
```
Get the mimetype from the filename extension. Takes an optional map of
extensions to mimetypes that overrides values in the default-mime-types map.
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/mime_type.clj#L105)