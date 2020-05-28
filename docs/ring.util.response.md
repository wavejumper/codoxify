# ring.util.response


Functions for generating and augmenting response maps.


## bad-request
**Type:** var

**Added:** 1.7


**Arguments:**
```clojure
[body]
```
Returns a 400 'bad request' response.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L47)
## charset
**Type:** var

**Added:** 1.1


**Arguments:**
```clojure
[resp charset]
```
Returns an updated Ring response with the supplied charset added to the
Content-Type header.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L211)
## content-type
**Type:** var



**Arguments:**
```clojure
[resp content-type]
```
Returns an updated Ring response with the a Content-Type header corresponding
to the given content-type.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L180)
## created
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[url]
[url body]
```
Returns a Ring response for a HTTP 201 created response.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L38)
## file-response
**Type:** var



**Arguments:**
```clojure
[filepath]
[filepath options]
```
Returns a Ring response to serve a static file, or nil if an appropriate
file does not exist.
Options:
  :root            - take the filepath relative to this root path
  :index-files?    - look for index.* files in directories (defaults to true)
  :allow-symlinks? - allow symlinks that lead to paths outside the root path
                     (defaults to false)

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L148)
## find-header
**Type:** var

**Added:** 1.4


**Arguments:**
```clojure
[resp header-name]
```
Looks up a header in a Ring response (or request) case insensitively,
returning the header map entry, or nil if not present.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L186)
## get-charset
**Type:** var

**Added:** 1.6


**Arguments:**
```clojure
[resp]
```
Gets the character encoding of a Ring response.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L222)
## get-header
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[resp header-name]
```
Looks up a header in a Ring response (or request) case insensitively,
returning the value of the header, or nil if not present.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L195)
## header
**Type:** var



**Arguments:**
```clojure
[resp name value]
```
Returns an updated Ring response with the specified header added.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L80)
## not-found
**Type:** var

**Added:** 1.1


**Arguments:**
```clojure
[body]
```
Returns a 404 'not found' response.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L55)
## redirect
**Type:** var



**Arguments:**
```clojure
[url]
[url status]
```
Returns a Ring response for an HTTP 302 redirect. Status may be 
a key in redirect-status-codes or a numeric code. Defaults to 302

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L20)
## ~redirect-after-post~
**Type:** var



**Arguments:**
```clojure
[url]
```
Returns a Ring response for an HTTP 303 redirect. Deprecated in favor
of using redirect with a :see-other status.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L29)
## redirect-status-codes
**Type:** var

**Added:** 1.4



Map a keyword to a redirect status code.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L12)
## resource-data
**Type:** multimethod

**Added:** 1.4


**Arguments:**
```clojure
[url]
```
Returns data about the resource specified by url, or nil if an
appropriate resource does not exist.

The return value is a map with optional values for:
:content        - the content of the URL, suitable for use as the :body
                  of a ring response
:content-length - the length of the :content, nil if not available
:last-modified  - the Date the :content was last modified, nil if not
                  available

This dispatches on the protocol of the URL as a keyword, and
implementations are provided for :file and :jar. If you are on a
platform where (Class/getResource) returns URLs with a different
protocol, you will need to provide an implementation for that
protocol.

This function is used internally by url-response.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L244)
## resource-response
**Type:** var



**Arguments:**
```clojure
[path]
[path options]
```
Returns a Ring response to serve a packaged resource, or nil if the
resource does not exist.
Options:
  :root            - take the resource relative to this root
  :loader          - resolve the resource in this class loader
  :allow-symlinks? - allow symlinks that lead to paths outside the root
                     classpath directories (defaults to false)

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L324)
## response
**Type:** var



**Arguments:**
```clojure
[body]
```
Returns a skeletal Ring response with the given body, status of 200, and no
headers.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L63)
## response?
**Type:** var

**Added:** 1.1


**Arguments:**
```clojure
[resp]
```
True if the supplied value is a valid response map.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L236)
## set-cookie
**Type:** var

**Added:** 1.1


**Arguments:**
```clojure
[resp name value & [opts]]
```
Sets a cookie on the response. Requires the handler to be wrapped in the
wrap-cookies middleware.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L229)
## status
**Type:** var



**Arguments:**
```clojure
[status]
[resp status]
```
Returns an updated Ring response with the given status.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L71)
## update-header
**Type:** var

**Added:** 1.4


**Arguments:**
```clojure
[resp header-name f & args]
```
Looks up a header in a Ring response (or request) case insensitively,
then updates the header with the supplied function and arguments in the
manner of update-in.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L202)
## url-response
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[url]
```
Return a response for the supplied URL.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/response.clj#L300)