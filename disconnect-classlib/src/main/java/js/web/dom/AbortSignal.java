package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object.
 */
public interface AbortSignal extends EventTarget {
    @JSBody(script = "return new AbortSignal()")
    static AbortSignal create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return AbortSignal.prototype")
    static AbortSignal prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
     */
    @JSProperty
    boolean isAborted();

    @JSProperty
    @Nullable
    EventListener<Event> getOnabort();

    @JSProperty
    void setOnabort(EventListener<Event> onabort);

    default void addAbortEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("abort", listener, options);
    }

    default void addAbortEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("abort", listener, options);
    }

    default void addAbortEventListener(EventListener<Event> listener) {
        addEventListener("abort", listener);
    }

    default void removeAbortEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("abort", listener, options);
    }

    default void removeAbortEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("abort", listener, options);
    }

    default void removeAbortEventListener(EventListener<Event> listener) {
        removeEventListener("abort", listener);
    }
}
