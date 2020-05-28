# ring.util.time

Functions for dealing with time and dates in HTTP requests.


## format-date
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[date]
```
Format a date as RFC1123 format.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/time.clj#L33)
## parse-date
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[http-date]
```
Attempt to parse a HTTP date. Returns nil if unsuccessful.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/time.clj#L24)