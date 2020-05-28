# ring.middleware.multipart-params.temp-file


A multipart storage engine for storing uploads in temporary files.


## temp-file-store
**Type:** var



**Arguments:**
```clojure
[]
[options]
```
Returns a function that stores multipart file parameters as temporary files.
Accepts the following options:

:expires-in - delete temporary files older than this many seconds
              (defaults to 3600 - 1 hour)

The multipart parameters will be stored as maps with the following keys:

:filename     - the name of the uploaded file
:content-type - the content type of the upload file
:tempfile     - a File object that points to the temporary file containing
                the uploaded data
:size         - the size in bytes of the uploaded data

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/multipart_params/temp_file.clj#L46)