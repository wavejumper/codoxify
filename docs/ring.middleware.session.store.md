# ring.middleware.session.store


```
Contains the protocol used to define all Ring session storage engines.

```

## SessionStore
**Type:** protocol

### delete-session
**Type:** var



**Arguments:**
```clojure
[store key]
```
```
Delete a session map from the store, and returns the session key. If the
returned key is nil, the session cookie will be removed.
```


### read-session
**Type:** var



**Arguments:**
```clojure
[store key]
```
```
Read a session map from the store. If the key is not found, nil
is returned.
```


### write-session
**Type:** var



**Arguments:**
```clojure
[store key data]
```
```
Write a session map to the store. Returns the (possibly changed) key under
which the data was stored. If the key is nil, the session is considered
to be new, and a fresh key should be generated.
```


[View source](#)