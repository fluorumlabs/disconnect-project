package js.web.mse;


import js.util.collections.ArrayLike;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A simple container list for multiple SourceBuffer objects.
 */
public interface SourceBufferList extends ArrayLike<SourceBuffer>, EventTarget {

    @JSBody(script = "return SourceBufferList.prototype")
    static SourceBufferList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SourceBufferList()")
    static SourceBufferList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnaddsourcebuffer();

    @JSProperty
    void setOnaddsourcebuffer(EventListener<Event> onaddsourcebuffer);

    default void addAddSourceBufferEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("addsourcebuffer", listener, options);
    }

    default void addAddSourceBufferEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("addsourcebuffer", listener, options);
    }

    default void addAddSourceBufferEventListener(EventListener<Event> listener) {
        addEventListener("addsourcebuffer", listener);
    }

    default void removeAddSourceBufferEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("addsourcebuffer", listener, options);
    }

    default void removeAddSourceBufferEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("addsourcebuffer", listener, options);
    }

    default void removeAddSourceBufferEventListener(EventListener<Event> listener) {
        removeEventListener("addsourcebuffer", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnremovesourcebuffer();

    @JSProperty
    void setOnremovesourcebuffer(EventListener<Event> onremovesourcebuffer);

    default void addRemoveSourceBufferEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("removesourcebuffer", listener, options);
    }

    default void addRemoveSourceBufferEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("removesourcebuffer", listener, options);
    }

    default void addRemoveSourceBufferEventListener(EventListener<Event> listener) {
        addEventListener("removesourcebuffer", listener);
    }

    default void removeRemoveSourceBufferEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("removesourcebuffer", listener, options);
    }

    default void removeRemoveSourceBufferEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("removesourcebuffer", listener, options);
    }

    default void removeRemoveSourceBufferEventListener(EventListener<Event> listener) {
        removeEventListener("removesourcebuffer", listener);
    }

}
