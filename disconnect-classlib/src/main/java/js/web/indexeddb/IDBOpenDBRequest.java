package js.web.indexeddb;


import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Also inherits methods from its parents IDBRequest and EventTarget.
 */
public interface IDBOpenDBRequest extends IDBRequest<IDBDatabase> {

    @JSBody(script = "return IDBOpenDBRequest.prototype")
    static IDBOpenDBRequest prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new IDBOpenDBRequest()")
    static IDBOpenDBRequest create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnblocked();

    @JSProperty
    void setOnblocked(EventListener<Event> onblocked);

    default void addBlockedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("blocked", listener, options);
    }

    default void addBlockedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("blocked", listener, options);
    }

    default void addBlockedEventListener(EventListener<Event> listener) {
        addEventListener("blocked", listener);
    }

    default void removeBlockedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("blocked", listener, options);
    }

    default void removeBlockedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("blocked", listener, options);
    }

    default void removeBlockedEventListener(EventListener<Event> listener) {
        removeEventListener("blocked", listener);
    }

    @JSProperty
    @Nullable
    EventListener<IDBVersionChangeEvent> getOnupgradeneeded();

    @JSProperty
    void setOnupgradeneeded(EventListener<IDBVersionChangeEvent> onupgradeneeded);

    default void addUpgradeNeededEventListener(EventListener<IDBVersionChangeEvent> listener, AddEventListenerOptions options) {
        addEventListener("upgradeneeded", listener, options);
    }

    default void addUpgradeNeededEventListener(EventListener<IDBVersionChangeEvent> listener, boolean options) {
        addEventListener("upgradeneeded", listener, options);
    }

    default void addUpgradeNeededEventListener(EventListener<IDBVersionChangeEvent> listener) {
        addEventListener("upgradeneeded", listener);
    }

    default void removeUpgradeNeededEventListener(EventListener<IDBVersionChangeEvent> listener, EventListenerOptions options) {
        removeEventListener("upgradeneeded", listener, options);
    }

    default void removeUpgradeNeededEventListener(EventListener<IDBVersionChangeEvent> listener, boolean options) {
        removeEventListener("upgradeneeded", listener, options);
    }

    default void removeUpgradeNeededEventListener(EventListener<IDBVersionChangeEvent> listener) {
        removeEventListener("upgradeneeded", listener);
    }

}
