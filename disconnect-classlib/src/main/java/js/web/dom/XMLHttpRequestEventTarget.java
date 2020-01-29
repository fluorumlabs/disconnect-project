package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/23/2020.
 */
public interface XMLHttpRequestEventTarget extends EventTarget {
    @JSBody(script = "return XMLHttpRequestEventTarget.prototype")
    static XMLHttpRequestEventTarget prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new XMLHttpRequestEventTarget()")
    static XMLHttpRequestEventTarget create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent> getOnabort();

    @JSProperty
    void setOnabort(EventListener<ProgressEvent> onabort);

    default void addAbortEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
        addEventListener("abort", listener, options);
    }

    default void addAbortEventListener(EventListener<ProgressEvent> listener, boolean options) {
        addEventListener("abort", listener, options);
    }

    default void addAbortEventListener(EventListener<ProgressEvent> listener) {
        addEventListener("abort", listener);
    }

    default void removeAbortEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
        removeEventListener("abort", listener, options);
    }

    default void removeAbortEventListener(EventListener<ProgressEvent> listener, boolean options) {
        removeEventListener("abort", listener, options);
    }

    default void removeAbortEventListener(EventListener<ProgressEvent> listener) {
        removeEventListener("abort", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent> getOnerror();

    @JSProperty
    void setOnerror(EventListener<ProgressEvent> onerror);

    default void addErrorEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<ProgressEvent> listener, boolean options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<ProgressEvent> listener) {
        addEventListener("error", listener);
    }

    default void removeErrorEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<ProgressEvent> listener, boolean options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<ProgressEvent> listener) {
        removeEventListener("error", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent> getOnload();

    @JSProperty
    void setOnload(EventListener<ProgressEvent> onload);

    default void addLoadEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
        addEventListener("load", listener, options);
    }

    default void addLoadEventListener(EventListener<ProgressEvent> listener, boolean options) {
        addEventListener("load", listener, options);
    }

    default void addLoadEventListener(EventListener<ProgressEvent> listener) {
        addEventListener("load", listener);
    }

    default void removeLoadEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
        removeEventListener("load", listener, options);
    }

    default void removeLoadEventListener(EventListener<ProgressEvent> listener, boolean options) {
        removeEventListener("load", listener, options);
    }

    default void removeLoadEventListener(EventListener<ProgressEvent> listener) {
        removeEventListener("load", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent> getOnloadend();

    @JSProperty
    void setOnloadend(EventListener<ProgressEvent> onloadend);

    default void addLoadEndEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
        addEventListener("loadend", listener, options);
    }

    default void addLoadEndEventListener(EventListener<ProgressEvent> listener, boolean options) {
        addEventListener("loadend", listener, options);
    }

    default void addLoadEndEventListener(EventListener<ProgressEvent> listener) {
        addEventListener("loadend", listener);
    }

    default void removeLoadEndEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
        removeEventListener("loadend", listener, options);
    }

    default void removeLoadEndEventListener(EventListener<ProgressEvent> listener, boolean options) {
        removeEventListener("loadend", listener, options);
    }

    default void removeLoadEndEventListener(EventListener<ProgressEvent> listener) {
        removeEventListener("loadend", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent> getOnloadstart();

    @JSProperty
    void setOnloadstart(EventListener<ProgressEvent> onloadstart);

    default void addLoadStartEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
        addEventListener("loadstart", listener, options);
    }

    default void addLoadStartEventListener(EventListener<ProgressEvent> listener, boolean options) {
        addEventListener("loadstart", listener, options);
    }

    default void addLoadStartEventListener(EventListener<ProgressEvent> listener) {
        addEventListener("loadstart", listener);
    }

    default void removeLoadStartEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
        removeEventListener("loadstart", listener, options);
    }

    default void removeLoadStartEventListener(EventListener<ProgressEvent> listener, boolean options) {
        removeEventListener("loadstart", listener, options);
    }

    default void removeLoadStartEventListener(EventListener<ProgressEvent> listener) {
        removeEventListener("loadstart", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent> getOnprogress();

    @JSProperty
    void setOnprogress(EventListener<ProgressEvent> onprogress);

    default void addProgressEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
        addEventListener("progress", listener, options);
    }

    default void addProgressEventListener(EventListener<ProgressEvent> listener, boolean options) {
        addEventListener("progress", listener, options);
    }

    default void addProgressEventListener(EventListener<ProgressEvent> listener) {
        addEventListener("progress", listener);
    }

    default void removeProgressEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
        removeEventListener("progress", listener, options);
    }

    default void removeProgressEventListener(EventListener<ProgressEvent> listener, boolean options) {
        removeEventListener("progress", listener, options);
    }

    default void removeProgressEventListener(EventListener<ProgressEvent> listener) {
        removeEventListener("progress", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent> getOntimeout();

    @JSProperty
    void setOntimeout(EventListener<ProgressEvent> ontimeout);

    default void addTimeoutEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
        addEventListener("timeout", listener, options);
    }

    default void addTimeoutEventListener(EventListener<ProgressEvent> listener, boolean options) {
        addEventListener("timeout", listener, options);
    }

    default void addTimeoutEventListener(EventListener<ProgressEvent> listener) {
        addEventListener("timeout", listener);
    }

    default void removeTimeoutEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
        removeEventListener("timeout", listener, options);
    }

    default void removeTimeoutEventListener(EventListener<ProgressEvent> listener, boolean options) {
        removeEventListener("timeout", listener, options);
    }

    default void removeTimeoutEventListener(EventListener<ProgressEvent> listener) {
        removeEventListener("timeout", listener);
    }

}
