# ring.middleware.cookies


Middleware for parsing and generating cookies.


## CookieDateTime
**Type:** protocol

### rfc822-format
**Type:** var



**Arguments:**
```clojure
[this]
```



[View source](#)
## CookieInterval
**Type:** protocol

### ->seconds
**Type:** var



**Arguments:**
```clojure
[this]
```



[View source](#)
## cookies-request
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request]
[request options]
```
Parses cookies in the request map. See: wrap-cookies.


[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/cookies.clj#L153)
## cookies-response
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[response]
[response options]
```
For responses with :cookies, adds Set-Cookie header and returns response
without :cookies. See: wrap-cookies.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/cookies.clj#L164)
## wrap-cookies
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
Parses the cookies in the request map, then assocs the resulting map
to the :cookies key on the request.

Accepts the following options:

:decoder - a function to decode the cookie value. Expects a function that
           takes a string and returns a string. Defaults to URL-decoding.

:encoder - a function to encode the cookie name and value. Expects a
           function that takes a name/value map and returns a string.
           Defaults to URL-encoding.

Each cookie is represented as a map, with its value being held in the
:value key. A cookie may optionally contain a :path, :domain or :port
attribute.

To set cookies, add a map to the :cookies key on the response. The values
of the cookie map can either be strings, or maps containing the following
keys:

:value     - the new value of the cookie
:path      - the subpath the cookie is valid for
:domain    - the domain the cookie is valid for
:max-age   - the maximum age in seconds of the cookie
:expires   - a date string at which the cookie will expire
:secure    - set to true if the cookie requires HTTPS, prevent HTTP access
:http-only - set to true if the cookie is valid for HTTP and HTTPS only
             (ie. prevent JavaScript access)
:same-site - set to :strict or :lax to set SameSite attribute of the cookie

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/cookies.clj#L176)