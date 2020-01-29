package js.web.serversideevents;


import js.extras.JsEnum;
import js.web.dom.EventListener;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import js.web.channelmessaging.MessageEvent;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface EventSource extends EventTarget {
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

    /**
     * Returns the state of this EventSource object's connection. It can have the values described below.
     */
    @JSProperty
    ReadyState getReadyState();

    /**
     * Returns the URL providing the event stream.
     */
    @JSProperty
    String getUrl();

    /**
     * Returns true if the credentials mode for connection requests to the URL providing the event stream is set to "include", and false otherwise.
     */
    @JSProperty
    boolean isWithCredentials();

    /**
     * Aborts any instances of the fetch algorithm started for this EventSource object, and sets the readyState attribute to CLOSED.
     */
    void close();

    abstract class ReadyState extends JsEnum {


    public static final ReadyState CLOSED = JsEnum.from("return EventSource.CLOSED");

    public static final ReadyState CONNECTING = JsEnum.from("return EventSource.CONNECTING");

    public static final ReadyState OPEN = JsEnum.from("return EventSource.OPEN");}

    @JSBody(script = "return EventSource.prototype")
    static EventSource prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"url","eventSourceInitDict"}, script = "return new EventSource(url, eventSourceInitDict)")
    static EventSource create(String url, EventSourceInit eventSourceInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="url", script = "return new EventSource(url)")
    static EventSource create(String url) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
