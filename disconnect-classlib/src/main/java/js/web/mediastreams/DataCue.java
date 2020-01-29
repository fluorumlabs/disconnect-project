package js.web.mediastreams;

import js.util.buffers.ArrayBuffer;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface DataCue extends TextTrackCue {
    @JSBody(script = "return DataCue.prototype")
    static DataCue prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DataCue()")
    static DataCue create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ArrayBuffer getData();

    @JSProperty
    void setData(ArrayBuffer data);

    default void addEnterEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("enter", listener, options);
    }

    default void addEnterEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("enter", listener, options);
    }

    default void addEnterEventListener(EventListener<Event> listener) {
        addEventListener("enter", listener);
    }

    default void removeEnterEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("enter", listener, options);
    }

    default void removeEnterEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("enter", listener, options);
    }

    default void removeEnterEventListener(EventListener<Event> listener) {
        removeEventListener("enter", listener);
    }

    default void addExitEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("exit", listener, options);
    }

    default void addExitEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("exit", listener, options);
    }

    default void addExitEventListener(EventListener<Event> listener) {
        addEventListener("exit", listener);
    }

    default void removeExitEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("exit", listener, options);
    }

    default void removeExitEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("exit", listener, options);
    }

    default void removeExitEventListener(EventListener<Event> listener) {
        removeEventListener("exit", listener);
    }

}
