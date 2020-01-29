package js.web.mediastreams;

import js.lang.BooleanPromise;
import js.lang.VoidPromise;
import js.web.channelmessaging.MessageEvent;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This EncryptedMediaExtensions API interface represents a context for message exchange with a content decryption module (CDM).
 */
public interface MediaKeySession extends EventTarget {

    @JSBody(script = "return MediaKeySession.prototype")
    static MediaKeySession prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaKeySession()")
    static MediaKeySession create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    VoidPromise getClosed();

    @JSProperty
    double getExpiration();

    @JSProperty
    MediaKeyStatusMap getKeyStatuses();

    @JSProperty
    @Nullable
    EventListener<Event> getOnkeystatuseschange();

    @JSProperty
    void setOnkeystatuseschange(EventListener<Event> onkeystatuseschange);

    default void addKeyStatusesChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("keystatuseschange", listener, options);
    }

    default void addKeyStatusesChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("keystatuseschange", listener, options);
    }

    default void addKeyStatusesChangeEventListener(EventListener<Event> listener) {
        addEventListener("keystatuseschange", listener);
    }

    default void removeKeyStatusesChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("keystatuseschange", listener, options);
    }

    default void removeKeyStatusesChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("keystatuseschange", listener, options);
    }

    default void removeKeyStatusesChangeEventListener(EventListener<Event> listener) {
        removeEventListener("keystatuseschange", listener);
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
    String getSessionId();

    VoidPromise close();

    VoidPromise generateRequest(String initDataType, BufferSource initData);

    BooleanPromise load(String sessionId);

    VoidPromise remove();

    VoidPromise update(BufferSource response);

}
