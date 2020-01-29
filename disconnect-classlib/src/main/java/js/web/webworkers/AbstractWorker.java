package js.web.webworkers;

import js.web.dom.*;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface AbstractWorker extends EventTarget {
    @JSProperty
    @Nullable
    EventListener<ErrorEvent> getOnerror();

    @JSProperty
    void setOnerror(EventListener<ErrorEvent> onerror);

    default void addErrorEventListener(EventListener<ErrorEvent> listener, AddEventListenerOptions options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<ErrorEvent> listener, boolean options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<ErrorEvent> listener) {
        addEventListener("error", listener);
    }

    default void removeErrorEventListener(EventListener<ErrorEvent> listener, EventListenerOptions options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<ErrorEvent> listener, boolean options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<ErrorEvent> listener) {
        removeEventListener("error", listener);
    }

}
