# ring.middleware.multipart-params.byte-array

A multipart storage engine for storing uploads as in-memory byte arrays.


## byte-array-store
**Type:** var



**Arguments:**
```clojure
[]
```
Returns a function that stores multipart file parameters as an array of
bytes. The multipart parameters will be stored as maps with the following
keys:

:filename     - the name of the uploaded file
:content-type - the content type of the uploaded file
:bytes        - an array of bytes containing the uploaded content
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/multipart_params/byte_array.clj#L6)