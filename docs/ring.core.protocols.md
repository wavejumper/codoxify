# ring.core.protocols
**Added:** 1.6


```
Protocols necessary for Ring.

```

## StreamableResponseBody
**Type:** protocol

### write-body-to-stream
**Type:** var



**Arguments:**
```clojure
[body response output-stream]
```
```
Write a value representing a response body to an output stream. The stream
will be closed after the value had been written.
```


[View source](#)