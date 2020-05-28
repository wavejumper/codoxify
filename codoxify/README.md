# Ring 1.8.1 {docsify-ignore-all}
## Description
A Clojure web applications library.
## License
Released under the [MIT License](http://opensource.org/licenses/MIT) license
## Installation
To install, add the following dependency to your project or build file:
##### Lein
```clojure
[ring "1.8.1"]
```
##### Deps
```clojure
ring {:mvn/version "1.8.1"}
```

## Namespaces
### [ring.adapter.jetty](#)

A Ring adapter that uses the Jetty 9 embedded web server.

Adapters are used to convert Ring handlers into running web servers.

Public variables and functions: [run-jetty](/ring.adapter.jetty?id=run-jetty)
### [ring.core.protocols](#)

Protocols necessary for Ring.


Public variables and functions: [StreamableResponseBody](/ring.core.protocols?id=StreamableResponseBody)
### [ring.handler.dump](#)

A handler that displays the received request map.

This is useful for debugging new adapters.

Public variables and functions: [handle-dump](/ring.handler.dump?id=handle-dump)
### [ring.middleware.content-type](#)

Middleware for automatically adding a content type to response maps.


Public variables and functions: [content-type-response](/ring.middleware.content-type?id=content-type-response) [wrap-content-type](/ring.middleware.content-type?id=wrap-content-type)
### [ring.middleware.cookies](#)

Middleware for parsing and generating cookies.


Public variables and functions: [CookieDateTime](/ring.middleware.cookies?id=CookieDateTime) [CookieInterval](/ring.middleware.cookies?id=CookieInterval) [cookies-request](/ring.middleware.cookies?id=cookies-request) [cookies-response](/ring.middleware.cookies?id=cookies-response) [wrap-cookies](/ring.middleware.cookies?id=wrap-cookies)
### [ring.middleware.file](#)

Middleware to serve files from a directory.

Most of the time you should prefer ring.middleware.resource instead, as this
middleware will not work with files in jar or war files.

Public variables and functions: [file-request](/ring.middleware.file?id=file-request) [wrap-file](/ring.middleware.file?id=wrap-file)
### [ring.middleware.file-info](#)

Middleware to add Last-Modified and Content-Type headers to file responses.

This middleware is deprecated. Prefer the ring.middleware.content-type and
ring.middleware.not-modified middleware instead.

Public variables and functions: [file-info-response](/ring.middleware.file-info?id=file-info-response) [wrap-file-info](/ring.middleware.file-info?id=wrap-file-info)
### [ring.middleware.flash](#)

Middleware that adds session-based flash store that persists only to the
next request in the same session.

Public variables and functions: [flash-request](/ring.middleware.flash?id=flash-request) [flash-response](/ring.middleware.flash?id=flash-response) [wrap-flash](/ring.middleware.flash?id=wrap-flash)
### [ring.middleware.head](#)

Middleware to simplify replying to HEAD requests.

A response to a HEAD request should be identical to a GET request, with the
exception that a response to a HEAD request should have an empty body.

Public variables and functions: [head-request](/ring.middleware.head?id=head-request) [head-response](/ring.middleware.head?id=head-response) [wrap-head](/ring.middleware.head?id=wrap-head)
### [ring.middleware.keyword-params](#)

Middleware that converts parameter keys in the request to keywords.


Public variables and functions: [keyword-params-request](/ring.middleware.keyword-params?id=keyword-params-request) [wrap-keyword-params](/ring.middleware.keyword-params?id=wrap-keyword-params)
### [ring.middleware.lint](#)

Middleware that checks Ring requests and responses for correctness.


Public variables and functions: [wrap-lint](/ring.middleware.lint?id=wrap-lint)
### [ring.middleware.multipart-params](#)

Middleware that parses multipart request bodies into parameters.

This middleware is necessary to handle file uploads from web browsers.

Ring comes with two different multipart storage engines included:

  ring.middleware.multipart-params.byte-array/byte-array-store
  ring.middleware.multipart-params.temp-file/temp-file-store

Public variables and functions: [multipart-params-request](/ring.middleware.multipart-params?id=multipart-params-request) [wrap-multipart-params](/ring.middleware.multipart-params?id=wrap-multipart-params)
### [ring.middleware.multipart-params.byte-array](#)

A multipart storage engine for storing uploads as in-memory byte arrays.


Public variables and functions: [byte-array-store](/ring.middleware.multipart-params.byte-array?id=byte-array-store)
### [ring.middleware.multipart-params.temp-file](#)

A multipart storage engine for storing uploads in temporary files.


Public variables and functions: [temp-file-store](/ring.middleware.multipart-params.temp-file?id=temp-file-store)
### [ring.middleware.nested-params](#)

Middleware to convert a single-depth map of parameters to a nested map.


Public variables and functions: [nested-params-request](/ring.middleware.nested-params?id=nested-params-request) [parse-nested-keys](/ring.middleware.nested-params?id=parse-nested-keys) [wrap-nested-params](/ring.middleware.nested-params?id=wrap-nested-params)
### [ring.middleware.not-modified](#)

Middleware that returns a 304 Not Modified response for responses with
Last-Modified headers.

Public variables and functions: [not-modified-response](/ring.middleware.not-modified?id=not-modified-response) [wrap-not-modified](/ring.middleware.not-modified?id=wrap-not-modified)
### [ring.middleware.params](#)

Middleware to parse url-encoded parameters from the query string and request
body.

Public variables and functions: [assoc-form-params](/ring.middleware.params?id=assoc-form-params) [assoc-query-params](/ring.middleware.params?id=assoc-query-params) [params-request](/ring.middleware.params?id=params-request) [wrap-params](/ring.middleware.params?id=wrap-params)
### [ring.middleware.reload](#)

Middleware that reloads modified namespaces on each request.

This middleware should be limited to use in development environments.

Public variables and functions: [wrap-reload](/ring.middleware.reload?id=wrap-reload)
### [ring.middleware.resource](#)

Middleware for serving static resources.


Public variables and functions: [resource-request](/ring.middleware.resource?id=resource-request) [wrap-resource](/ring.middleware.resource?id=wrap-resource)
### [ring.middleware.session](#)

Middleware for maintaining browser sessions using cookies.

Sessions are stored using types that adhere to the
ring.middleware.session.store/SessionStore protocol.
Ring comes with two stores included:

  ring.middleware.session.memory/memory-store
  ring.middleware.session.cookie/cookie-store

Public variables and functions: [session-request](/ring.middleware.session?id=session-request) [session-response](/ring.middleware.session?id=session-response) [wrap-session](/ring.middleware.session?id=wrap-session)
### [ring.middleware.session.cookie](#)

A session storage engine that stores session data in encrypted cookies.


Public variables and functions: [cookie-store](/ring.middleware.session.cookie?id=cookie-store)
### [ring.middleware.session.memory](#)

A session storage engine that stores session data in memory.


Public variables and functions: [memory-store](/ring.middleware.session.memory?id=memory-store)
### [ring.middleware.session.store](#)

Contains the protocol used to define all Ring session storage engines.


Public variables and functions: [SessionStore](/ring.middleware.session.store?id=SessionStore)
### [ring.middleware.stacktrace](#)

Middleware that catches exceptions thrown by the handler, and reports the
error and stacktrace via a webpage and STDERR log.

This middleware is for debugging purposes, and should be limited to
development environments.

Public variables and functions: [wrap-stacktrace](/ring.middleware.stacktrace?id=wrap-stacktrace) [wrap-stacktrace-log](/ring.middleware.stacktrace?id=wrap-stacktrace-log) [wrap-stacktrace-web](/ring.middleware.stacktrace?id=wrap-stacktrace-web)
### [ring.util.io](#)

Utility functions for handling I/O.


Public variables and functions: [close!](/ring.util.io?id=close!) [last-modified-date](/ring.util.io?id=last-modified-date) [piped-input-stream](/ring.util.io?id=piped-input-stream) [string-input-stream](/ring.util.io?id=string-input-stream)
### [ring.util.mime-type](#)

Utility functions for determining the mime-types files.


Public variables and functions: [default-mime-types](/ring.util.mime-type?id=default-mime-types) [ext-mime-type](/ring.util.mime-type?id=ext-mime-type)
### [ring.util.parsing](#)

Regular expressions for parsing HTTP.

For internal use.

Public variables and functions: [find-content-type-charset](/ring.util.parsing?id=find-content-type-charset) [re-charset](/ring.util.parsing?id=re-charset) [re-quoted](/ring.util.parsing?id=re-quoted) [re-token](/ring.util.parsing?id=re-token) [re-value](/ring.util.parsing?id=re-value)
### [ring.util.request](#)

Functions for augmenting and pulling information from request maps.


Public variables and functions: [body-string](/ring.util.request?id=body-string) [character-encoding](/ring.util.request?id=character-encoding) [content-length](/ring.util.request?id=content-length) [content-type](/ring.util.request?id=content-type) [in-context?](/ring.util.request?id=in-context?) [path-info](/ring.util.request?id=path-info) [request-url](/ring.util.request?id=request-url) [set-context](/ring.util.request?id=set-context) [urlencoded-form?](/ring.util.request?id=urlencoded-form?)
### [ring.util.response](#)

Functions for generating and augmenting response maps.


Public variables and functions: [bad-request](/ring.util.response?id=bad-request) [charset](/ring.util.response?id=charset) [content-type](/ring.util.response?id=content-type) [created](/ring.util.response?id=created) [file-response](/ring.util.response?id=file-response) [find-header](/ring.util.response?id=find-header) [get-charset](/ring.util.response?id=get-charset) [get-header](/ring.util.response?id=get-header) [header](/ring.util.response?id=header) [not-found](/ring.util.response?id=not-found) [redirect](/ring.util.response?id=redirect) [redirect-after-post](/ring.util.response?id=redirect-after-post) [redirect-status-codes](/ring.util.response?id=redirect-status-codes) [resource-data](/ring.util.response?id=resource-data) [resource-response](/ring.util.response?id=resource-response) [response](/ring.util.response?id=response) [response?](/ring.util.response?id=response?) [set-cookie](/ring.util.response?id=set-cookie) [status](/ring.util.response?id=status) [update-header](/ring.util.response?id=update-header) [url-response](/ring.util.response?id=url-response)
### [ring.util.servlet](#)

Compatibility functions for turning a ring handler into a Java servlet.


Public variables and functions: [build-request-map](/ring.util.servlet?id=build-request-map) [defservice](/ring.util.servlet?id=defservice) [make-service-method](/ring.util.servlet?id=make-service-method) [merge-servlet-keys](/ring.util.servlet?id=merge-servlet-keys) [servlet](/ring.util.servlet?id=servlet) [update-servlet-response](/ring.util.servlet?id=update-servlet-response)
### [ring.util.test](#)

Utilities for testing Ring components.

All functions in this namespace are currently deprecated.

Public variables and functions: [string-input-stream](/ring.util.test?id=string-input-stream)
### [ring.util.time](#)

Functions for dealing with time and dates in HTTP requests.


Public variables and functions: [format-date](/ring.util.time?id=format-date) [parse-date](/ring.util.time?id=parse-date)