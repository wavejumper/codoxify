# ring.middleware.session


```
Middleware for maintaining browser sessions using cookies.

Sessions are stored using types that adhere to the
ring.middleware.session.store/SessionStore protocol.
Ring comes with two stores included:

  ring.middleware.session.memory/memory-store
  ring.middleware.session.cookie/cookie-store
```

## session-request
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request]
[request options]
```
```
Reads current HTTP session map and adds it to :session key of the request.
See: wrap-session.
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/session.clj#L32)
## session-response
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[response request]
[response request options]
```
```
Updates session based on :session key in response. See: wrap-session.

```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/session.clj#L66)
## wrap-session
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
```
Reads in the current HTTP session map, and adds it to the :session key on
the request. If a :session key is added to the response by the handler, the
session is updated with the new value. If the value is nil, the session is
deleted.

Accepts the following options:

:store        - An implementation of the SessionStore protocol in the
                ring.middleware.session.store namespace. This determines how
                the session is stored. Defaults to in-memory storage using
                ring.middleware.session.store/memory-store.

:root         - The root path of the session. Any path above this will not be
                able to see this session. Equivalent to setting the cookie's
                path attribute. Defaults to "/".

:cookie-name  - The name of the cookie that holds the session key. Defaults to
                "ring-session".

:cookie-attrs - A map of attributes to associate with the session cookie.
                Defaults to {:http-only true}. This may be overridden on a
                per-response basis by adding :session-cookie-attrs to the
                response.
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/session.clj#L77)