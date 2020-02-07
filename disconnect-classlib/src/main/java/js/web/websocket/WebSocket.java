package js.web.websocket;

import js.extras.JsEnum;
import js.web.channelmessaging.MessageEvent;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides the API for creating and managing a WebSocket connection to a server, as well as for sending and receiving data on the connection.
 */
public interface WebSocket extends EventTarget {
    @JSBody(script = "return WebSocket.prototype")
    static WebSocket prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "url", script = "return new WebSocket(url)")
    static WebSocket create(String url) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"url", "protocols"}, script = "return new WebSocket(url, protocols)")
    static WebSocket create(String url, String protocols) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"url", "protocols"}, script = "return new WebSocket(url, protocols)")
    static WebSocket create(String url, String... protocols) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    BinaryType getBinaryType();

    @JSProperty
    void setBinaryType(BinaryType binaryType);

    @JSProperty
    double getBufferedAmount();

    @JSProperty
    String getExtensions();

    @JSProperty
    @Nullable
    EventListener<CloseEvent> getOnclose();

    @JSProperty
    void setOnclose(EventListener<CloseEvent> onclose);

    default void addCloseEventListener(EventListener<CloseEvent> listener, AddEventListenerOptions options) {
        addEventListener("close", listener, options);
    }

    default void addCloseEventListener(EventListener<CloseEvent> listener, boolean options) {
        addEventListener("close", listener, options);
    }

    default void addCloseEventListener(EventListener<CloseEvent> listener) {
        addEventListener("close", listener);
    }

    default void removeCloseEventListener(EventListener<CloseEvent> listener, EventListenerOptions options) {
        removeEventListener("close", listener, options);
    }

    default void removeCloseEventListener(EventListener<CloseEvent> listener, boolean options) {
        removeEventListener("close", listener, options);
    }

    default void removeCloseEventListener(EventListener<CloseEvent> listener) {
        removeEventListener("close", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnerror();

    @JSProperty
    void setOnerror(EventListener<Event> onerror);

    default void addErrorEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<Event> listener) {
        addEventListener("error", listener);
    }

    default void removeErrorEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<Event> listener) {
        removeEventListener("error", listener);
    }

    @JSProperty
    @Nullable
    EventListener<MessageEvent> getOnmessage();

    @JSProperty
    void setOnmessage(EventListener<MessageEvent> onmessage);

    default void addMessageEventListener(EventListener<MessageEvent> listener, AddEventListenerOptions options) {
        addEventListener("message", listener, options);
    }

    default void addMessageEventListener(EventListener<MessageEvent> listener, boolean options) {
        addEventListener("message", listener, options);
    }

    default void addMessageEventListener(EventListener<MessageEvent> listener) {
        addEventListener("message", listener);
    }

    default void removeMessageEventListener(EventListener<MessageEvent> listener, EventListenerOptions options) {
        removeEventListener("message", listener, options);
    }

    default void removeMessageEventListener(EventListener<MessageEvent> listener, boolean options) {
        removeEventListener("message", listener, options);
    }

    default void removeMessageEventListener(EventListener<MessageEvent> listener) {
        removeEventListener("message", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnopen();

    @JSProperty
    void setOnopen(EventListener<Event> onopen);

    default void addOpenEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("open", listener, options);
    }

    default void addOpenEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("open", listener, options);
    }

    default void addOpenEventListener(EventListener<Event> listener) {
        addEventListener("open", listener);
    }

    default void removeOpenEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("open", listener, options);
    }

    default void removeOpenEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("open", listener, options);
    }

    default void removeOpenEventListener(EventListener<Event> listener) {
        removeEventListener("open", listener);
    }

    @JSProperty
    String getProtocol();

    @JSProperty
    ReadyState getReadyState();

    @JSProperty
    String getUrl();

    void close(int code, String reason);

    void close(int code);

    void close();

    void send(String data);

    void send(BufferSource data);

    void send(Blob data);

    abstract class ReadyState extends JsEnum {
        public static final ReadyState CLOSED = JsEnum.from("return WebSocket.CLOSED");

        public static final ReadyState CLOSING = JsEnum.from("return WebSocket.CLOSING");

        public static final ReadyState CONNECTING = JsEnum.from("return WebSocket.CONNECTING");

        public static final ReadyState OPEN = JsEnum.from("return WebSocket.OPEN");
    }

}
