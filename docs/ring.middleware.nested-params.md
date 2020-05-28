# ring.middleware.nested-params


```
Middleware to convert a single-depth map of parameters to a nested map.

```

## nested-params-request
**Type:** var

**Added:** 1.2


**Arguments:**
```clojure
[request]
[request options]
```
```
Converts a request with a flat map of parameters to a nested map.
See: wrap-nested-params.
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/nested_params.clj#L58)
## parse-nested-keys
**Type:** var



**Arguments:**
```clojure
[param-name]
```
```
Parse a parameter name into a list of keys using a 'C'-like index
notation.

For example:

  "foo[bar][][baz]"
  => ["foo" "bar" "" "baz"]
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/nested_params.clj#L5)
## wrap-nested-params
**Type:** var



**Arguments:**
```clojure
[handler]
[handler options]
```
```
Middleware to converts a flat map of parameters into a nested map.
Accepts the following options:

:key-parser - the function to use to parse the parameter names into a list
              of keys. Keys that are empty strings are treated as elements in
              a vector, non-empty keys are treated as elements in a map.
              Defaults to the parse-nested-keys function.

For example:

  {"foo[bar]" "baz"}
  => {"foo" {"bar" "baz"}}

  {"foo[]" "bar"}
  => {"foo" ["bar"]}
```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/middleware/nested_params.clj#L68)