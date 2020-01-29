package js.web.dom;

import js.extras.JsEnum;
import js.lang.Unknown;
import js.util.buffers.Uint8Array;
import js.web.streams.ReadableStream;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Use XMLHttpRequest (XHR) objects to interact with servers. You can retrieve data from a URL without having to do a full page refresh. This enables a Web page to update just part of a page without disrupting what the user is doing. */
        public interface XMLHttpRequest extends XMLHttpRequestEventTarget {
        @JSProperty
        @Nullable
        EventListener<Event> getOnreadystatechange();

        @JSProperty
        void setOnreadystatechange(EventListener<Event> onreadystatechange);

        default void addReadyStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("readystatechange", listener, options);
        }
        default void addReadyStateChangeEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("readystatechange", listener, options);
        }
        default void addReadyStateChangeEventListener(EventListener<Event> listener) {
            addEventListener("readystatechange", listener);
        }

        default void removeReadyStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("readystatechange", listener, options);
        }
        default void removeReadyStateChangeEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("readystatechange", listener, options);
        }
        default void removeReadyStateChangeEventListener(EventListener<Event> listener) {
            removeEventListener("readystatechange", listener);
        }
        /**
         * Returns client's state.
         */
        @JSProperty
        ReadyState getReadyState();

        /**
         * Returns the response's body.
         */
        @JSProperty
        Unknown getResponse();

        /**
         * Returns the text response.
         *
         * Throws an "InvalidStateError" DOMException if responseType is not the empty string or "text".
         */
        @JSProperty
        String getResponseText();

        /**
         * Returns the response type.
         *
         * Can be set to change the response type. Values the empty string  are(default), "arraybuffer", "blob", "document", "json", and "text".
         *
         * When setting to  set"document" is ignored if current global object is not a Window object.
         *
         * When throws an  set"InvalidStateError" DOMException if state is loading or done.
         *
         * When throws an  set"InvalidAccessError" DOMException if the synchronous flag is set and current global object is a Window object.
         */
        @JSProperty
        XMLHttpRequestResponseType getResponseType();

        @JSProperty
        void setResponseType(XMLHttpRequestResponseType responseType);

        @JSProperty
        String getResponseURL();

        /**
         * Returns the document response.
         *
         * Throws an "InvalidStateError" DOMException if responseType is not the empty string or "document".
         */
        @JSProperty
        @Nullable
        Document getResponseXML();

        @JSProperty
        int getStatus();

        @JSProperty
        String getStatusText();

        /**
         * Can be set to a time in milliseconds. When set to a non-zero value will cause fetching to terminate after the given time has passed. When the time has passed, the request has not yet completed, and the synchronous flag is unset, a timeout event will then be dispatched, or a "TimeoutError" DOMException will be thrown otherwise (for the send() method).
         *
         * When throws an  set"InvalidAccessError" DOMException if the synchronous flag is set and current global object is a Window object.
         */
        @JSProperty
        double getTimeout();

        @JSProperty
        void setTimeout(double timeout);

        /**
         * Returns the associated XMLHttpRequestUpload object. It can be used to gather transmission information when data is transferred to a server.
         */
        @JSProperty
        XMLHttpRequestUpload getUpload();

        /**
         * True when credentials are to be included in a cross-origin request. False when they are to be excluded in a cross-origin request and when cookies are to be ignored in its response. Initially false.
         *
         * When throws an  set"InvalidStateError" DOMException if state is not unsent or opened, or if the send() flag is set.
         */
        @JSProperty
        boolean isWithCredentials();

        @JSProperty
        void setWithCredentials(boolean withCredentials);

        /**
         * Cancels any network activity.
         */
        void abort();
        String getAllResponseHeaders();
        @Nullable
        String getResponseHeader(String name);
        /**
         * Sets the request method, request URL, and synchronous flag.
         *
         * Throws a "SyntaxError" DOMException if either method is not a valid HTTP method or url cannot be parsed.
         *
         * Throws a "SecurityError" DOMException if method is a case-insensitive match for `CONNECT`, `TRACE`, or `TRACK`.
         *
         * Throws an "InvalidAccessError" DOMException if async is false, current global object is a Window object, and the timeout attribute is not zero or the responseType attribute is not the empty string.
         */
        void open(String method, String url);
        void open(String method, String url, boolean async, @Nullable String username, @Nullable String password);
        void open(String method, String url, boolean async, @Nullable String username);
        void open(String method, String url, boolean async);
        /**
         * Acts as if the `Content-Type` header value for response is mime. (It does not actually change the header though.)
         *
         * Throws an "InvalidStateError" DOMException if state is loading or done.
         */
        void overrideMimeType(String mime);
        /**
         * Initiates the request. The body argument provides the request body, if any, and is ignored if the request method is GET or HEAD.
         *
         * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
         */
        void send(Document body);
        void send(Blob body);
        void send(BufferSource body);
        void send(FormData body);
        void send(URLSearchParams body);
        void send(ReadableStream<Uint8Array> body);
        void send(String body);
        void send();
        /**
         * Combines a header in author request headers.
         *
         * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
         *
         * Throws a "SyntaxError" DOMException if name is not a header name or if value is not a header value.
         */
        void setRequestHeader(String name, String value);

        abstract class ReadyState extends JsEnum {
        public static final ReadyState DONE = JsEnum.from("return XMLHttpRequest.DONE");

        public static final ReadyState HEADERS_RECEIVED = JsEnum.from("return XMLHttpRequest.HEADERS_RECEIVED");

        public static final ReadyState LOADING = JsEnum.from("return XMLHttpRequest.LOADING");

        public static final ReadyState OPENED = JsEnum.from("return XMLHttpRequest.OPENED");

        public static final ReadyState UNSENT = JsEnum.from("return XMLHttpRequest.UNSENT");}

        @JSBody(script = "return XMLHttpRequest.prototype")
        static XMLHttpRequest prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new XMLHttpRequest()")
        static XMLHttpRequest create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
