package js.web.broadcastchannel;

import js.lang.Any;
import js.web.channelmessaging.MessageEvent;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface BroadcastChannel extends EventTarget {
    @JSBody(script = "return BroadcastChannel.prototype")
    static BroadcastChannel prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "name", script = "return new BroadcastChannel(name)")
    static BroadcastChannel create(String name) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the channel name (as passed to the constructor).
     */
    @JSProperty
    String getName();

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
    EventListener<MessageEvent> getOnmessageerror();

    @JSProperty
    void setOnmessageerror(EventListener<MessageEvent> onmessageerror);

    default void addMessageErrorEventListener(EventListener<MessageEvent> listener, AddEventListenerOptions options) {
        addEventListener("messageerror", listener, options);
    }

    default void addMessageErrorEventListener(EventListener<MessageEvent> listener, boolean options) {
        addEventListener("messageerror", listener, options);
    }

    default void addMessageErrorEventListener(EventListener<MessageEvent> listener) {
        addEventListener("messageerror", listener);
    }

    default void removeMessageErrorEventListener(EventListener<MessageEvent> listener, EventListenerOptions options) {
        removeEventListener("messageerror", listener, options);
    }

    default void removeMessageErrorEventListener(EventListener<MessageEvent> listener, boolean options) {
        removeEventListener("messageerror", listener, options);
    }

    default void removeMessageErrorEventListener(EventListener<MessageEvent> listener) {
        removeEventListener("messageerror", listener);
    }

    /**
     * Closes the BroadcastChannel object, opening it up to garbage collection.
     */
    void close();

    /**
     * Sends the given message to other BroadcastChannel objects set up for this channel. Messages can be structured objects, e.g. nested objects and arrays.
     */
    void postMessage(Any message);

}
