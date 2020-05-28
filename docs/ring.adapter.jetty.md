# ring.adapter.jetty

A Ring adapter that uses the Jetty 9 embedded web server.

Adapters are used to convert Ring handlers into running web servers.

## run-jetty
**Type:** var



**Arguments:**
```clojure
[handler options]
```
Start a Jetty webserver to serve the given handler according to the
supplied options:

:configurator         - a function called with the Jetty Server instance
:async?               - if true, treat the handler as asynchronous
:async-timeout        - async context timeout in ms (defaults to 0, no timeout)
:port                 - the port to listen on (defaults to 80)
:host                 - the hostname to listen on
:join?                - blocks the thread until server ends (defaults to true)
:daemon?              - use daemon threads (defaults to false)
:http?                - listen on :port for HTTP traffic (defaults to true)
:ssl?                 - allow connections over HTTPS
:ssl-port             - the SSL port to listen on (defaults to 443, implies
                        :ssl? is true)
:exclude-ciphers      - When :ssl? is true, exclude these cipher suites
:exclude-protocols    - When :ssl? is true, exclude these protocols
:keystore             - the keystore to use for SSL connections
:keystore-type        - the keystore type (default jks)
:key-password         - the password to the keystore
:truststore           - a truststore to use for SSL connections
:trust-password       - the password to the truststore
:max-threads          - the maximum number of threads to use (default 50)
:min-threads          - the minimum number of threads to use (default 8)
:max-queued-requests  - the maximum number of requests to be queued
:thread-idle-timeout  - Set the maximum thread idle time. Threads that are idle
                        for longer than this period may be stopped (default 60000)
:max-idle-time        - the maximum idle time in milliseconds for a connection
                        (default 200000)
:client-auth          - SSL client certificate authenticate, may be set to
                        :need,:want or :none (defaults to :none)
:send-date-header?    - add a date header to the response (default true)
:output-buffer-size   - the response body buffer size (default 32768)
:request-header-size  - the maximum size of a request header (default 8192)
:response-header-size - the maximum size of a response header (default 8192)
:send-server-version? - add Server header to HTTP response (default true)
[View source](http://github.com/ring-clojure/ring/blob/1.8.1/ring-jetty-adapter/src/ring/adapter/jetty.clj#L128)