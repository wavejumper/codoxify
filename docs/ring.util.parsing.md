# ring.util.parsing


```
Regular expressions for parsing HTTP.

For internal use.
```

## find-content-type-charset
**Type:** var

**Added:** 1.8.1


**Arguments:**
```clojure
[s]
```
```
Return the charset of a given a content-type string.

```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/parsing.clj#L26)
## re-charset
**Type:** var

**Added:** 1.6



```
Pattern for pulling the charset out of the content-type header

```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/parsing.clj#L21)
## re-quoted
**Type:** var

**Added:** 1.3



```
HTTP quoted-string: <"> *<any TEXT except "> <">. See RFC2068.

```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/parsing.clj#L11)
## re-token
**Type:** var

**Added:** 1.3



```
HTTP token: 1*<any CHAR except CTLs or tspecials>. See RFC2068

```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/parsing.clj#L6)
## re-value
**Type:** var

**Added:** 1.3



```
HTTP value: token | quoted-string. See RFC2109

```

[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-core/src/ring/util/parsing.clj#L16)