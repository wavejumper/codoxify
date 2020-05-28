# ring.util.io


Utility functions for handling I/O.


## close!
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[stream]
```
Ensure a stream is closed, swallowing any exceptions.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/io.clj#L40)
## last-modified-date
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[file]
```
Returns the last modified date for a file, rounded down to the nearest
second.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/io.clj#L49)
## piped-input-stream
**Type:** var

**Added:** 1.1


**Arguments:**
```clojure
[func]
```
Create an input stream from a function that takes an output stream as its
argument. The function will be executed in a separate thread. The stream
will be automatically closed after the function finishes.

For example:

  (piped-input-stream
    (fn [ostream]
      (spit ostream "Hello")))

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/io.clj#L11)
## string-input-stream
**Type:** var

**Added:** 1.1


**Arguments:**
```clojure
[s]
[s encoding]
```
Returns a ByteArrayInputStream for the given String.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/io.clj#L32)