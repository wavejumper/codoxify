# ring.middleware.session.cookie


```
A session storage engine that stores session data in encrypted cookies.

```

## cookie-store
**Type:** var



**Arguments:**
```clojure
[]
[options]
```
```
Creates an encrypted cookie storage engine. Accepts the following options:

:key - The secret key to encrypt the session cookie. Must be a byte array of
       exactly 16 bytes. If no key is provided then a random key will be
       generated. Note that in that case a server restart will invalidate all
       existing session cookies.

:readers - A map of data readers used to read the serialized edn from the
           cookie. For writing, ensure that each data type has a key in the
           clojure.core/print-method or clojure.core/print-dup multimethods.
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/session/cookie.clj#L110)