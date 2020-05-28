# ring.handler.dump

A handler that displays the received request map.

This is useful for debugging new adapters.

## handle-dump
**Type:** var



**Arguments:**
```clojure
[request]
[request respond raise]
```
Returns a HTML response that shows the information in the request map.
Also prints the request map to STDOUT.
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-devel/src/ring/handler/dump.clj#L49)