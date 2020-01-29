package js.web.webrtc;

import js.web.channelmessaging.MessageEvent;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/22/2020.
 */
public interface RTCDataChannel extends EventTarget {
    @JSBody(script = "return RTCDataChannel.prototype")
    static RTCDataChannel prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCDataChannel()")
    static RTCDataChannel create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getBinaryType();

    @JSProperty
    void setBinaryType(String binaryType);

    @JSProperty
    int getBufferedAmount();

    @JSProperty
    int getBufferedAmountLowThreshold();

    @JSProperty
    void setBufferedAmountLowThreshold(int bufferedAmountLowThreshold);

    @JSProperty
    @Nullable
    int getId();

    @JSProperty
    String getLabel();

    @JSProperty
    @Nullable
    double getMaxPacketLifeTime();

    @JSProperty
    @Nullable
    int getMaxRetransmits();

    @JSProperty
    boolean isNegotiated();

    @JSProperty
    @Nullable
    EventListener<Event> getOnbufferedamountlow();

    @JSProperty
    void setOnbufferedamountlow(EventListener<Event> onbufferedamountlow);

    default void addBufferedAmountLowEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("bufferedamountlow", listener, options);
    }

    default void addBufferedAmountLowEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("bufferedamountlow", listener, options);
    }

    default void addBufferedAmountLowEventListener(EventListener<Event> listener) {
        addEventListener("bufferedamountlow", listener);
    }

    default void removeBufferedAmountLowEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("bufferedamountlow", listener, options);
    }

    default void removeBufferedAmountLowEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("bufferedamountlow", listener, options);
    }

    default void removeBufferedAmountLowEventListener(EventListener<Event> listener) {
        removeEventListener("bufferedamountlow", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnclose();

    @JSProperty
    void setOnclose(EventListener<Event> onclose);

    default void addCloseEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("close", listener, options);
    }

    default void addCloseEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("close", listener, options);
    }

    default void addCloseEventListener(EventListener<Event> listener) {
        addEventListener("close", listener);
    }

    default void removeCloseEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("close", listener, options);
    }

    default void removeCloseEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("close", listener, options);
    }

    default void removeCloseEventListener(EventListener<Event> listener) {
        removeEventListener("close", listener);
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
    boolean isOrdered();

    @JSProperty
    RTCPriorityType getPriority();

    @JSProperty
    String getProtocol();

    @JSProperty
    RTCDataChannelState getReadyState();

    void close();

    void send(String data);

    void send(Blob data);

    void send(BufferSource data);

}
