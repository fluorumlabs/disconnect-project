package js.web.webrtc;

import js.util.buffers.ArrayBuffer;
import js.util.collections.Array;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/22/2020.
 */
public interface RTCDtlsTransport extends EventTarget, RTCTransport {

    @JSBody(script = "return RTCDtlsTransport.prototype")
    static RTCDtlsTransport prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCDtlsTransport()")
    static RTCDtlsTransport create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    EventListener<RTCErrorEvent> getOnerror();

    @JSProperty
    void setOnerror(EventListener<RTCErrorEvent> onerror);

    default void addErrorEventListener(EventListener<RTCErrorEvent> listener, AddEventListenerOptions options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<RTCErrorEvent> listener, boolean options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<RTCErrorEvent> listener) {
        addEventListener("error", listener);
    }

    default void removeErrorEventListener(EventListener<RTCErrorEvent> listener, EventListenerOptions options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<RTCErrorEvent> listener, boolean options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<RTCErrorEvent> listener) {
        removeEventListener("error", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnstatechange();

    @JSProperty
    void setOnstatechange(EventListener<Event> onstatechange);

    default void addStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("statechange", listener, options);
    }

    default void addStateChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("statechange", listener, options);
    }

    default void addStateChangeEventListener(EventListener<Event> listener) {
        addEventListener("statechange", listener);
    }

    default void removeStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("statechange", listener, options);
    }

    default void removeStateChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("statechange", listener, options);
    }

    default void removeStateChangeEventListener(EventListener<Event> listener) {
        removeEventListener("statechange", listener);
    }

    @JSProperty
    RTCDtlsTransportState getState();

    @JSProperty
    RTCIceTransport getTransport();

    Array<ArrayBuffer> getRemoteCertificates();

}
