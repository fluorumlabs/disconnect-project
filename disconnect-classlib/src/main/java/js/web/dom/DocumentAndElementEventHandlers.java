package js.web.dom;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface DocumentAndElementEventHandlers extends EventTarget {
    @JSProperty
    @Nullable
    EventListener<ClipboardEvent> getOncopy();

    @JSProperty
    void setOncopy(EventListener<ClipboardEvent> oncopy);

    default void addCopyEventListener(EventListener<ClipboardEvent> listener, AddEventListenerOptions options) {
        addEventListener("copy", listener, options);
    }

    default void addCopyEventListener(EventListener<ClipboardEvent> listener, boolean options) {
        addEventListener("copy", listener, options);
    }

    default void addCopyEventListener(EventListener<ClipboardEvent> listener) {
        addEventListener("copy", listener);
    }

    default void removeCopyEventListener(EventListener<ClipboardEvent> listener, EventListenerOptions options) {
        removeEventListener("copy", listener, options);
    }

    default void removeCopyEventListener(EventListener<ClipboardEvent> listener, boolean options) {
        removeEventListener("copy", listener, options);
    }

    default void removeCopyEventListener(EventListener<ClipboardEvent> listener) {
        removeEventListener("copy", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ClipboardEvent> getOncut();

    @JSProperty
    void setOncut(EventListener<ClipboardEvent> oncut);

    default void addCutEventListener(EventListener<ClipboardEvent> listener, AddEventListenerOptions options) {
        addEventListener("cut", listener, options);
    }

    default void addCutEventListener(EventListener<ClipboardEvent> listener, boolean options) {
        addEventListener("cut", listener, options);
    }

    default void addCutEventListener(EventListener<ClipboardEvent> listener) {
        addEventListener("cut", listener);
    }

    default void removeCutEventListener(EventListener<ClipboardEvent> listener, EventListenerOptions options) {
        removeEventListener("cut", listener, options);
    }

    default void removeCutEventListener(EventListener<ClipboardEvent> listener, boolean options) {
        removeEventListener("cut", listener, options);
    }

    default void removeCutEventListener(EventListener<ClipboardEvent> listener) {
        removeEventListener("cut", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ClipboardEvent> getOnpaste();

    @JSProperty
    void setOnpaste(EventListener<ClipboardEvent> onpaste);

    default void addPasteEventListener(EventListener<ClipboardEvent> listener, AddEventListenerOptions options) {
        addEventListener("paste", listener, options);
    }

    default void addPasteEventListener(EventListener<ClipboardEvent> listener, boolean options) {
        addEventListener("paste", listener, options);
    }

    default void addPasteEventListener(EventListener<ClipboardEvent> listener) {
        addEventListener("paste", listener);
    }

    default void removePasteEventListener(EventListener<ClipboardEvent> listener, EventListenerOptions options) {
        removeEventListener("paste", listener, options);
    }

    default void removePasteEventListener(EventListener<ClipboardEvent> listener, boolean options) {
        removeEventListener("paste", listener, options);
    }

    default void removePasteEventListener(EventListener<ClipboardEvent> listener) {
        removeEventListener("paste", listener);
    }
}
