# ring.middleware.session.memory


A session storage engine that stores session data in memory.


## memory-store
**Type:** var



**Arguments:**
```clojure
[]
[session-atom]
```
Creates an in-memory session storage engine. Accepts an atom as an optional
argument; if supplied, the atom is used to hold the session data.

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/session/memory.clj#L20)