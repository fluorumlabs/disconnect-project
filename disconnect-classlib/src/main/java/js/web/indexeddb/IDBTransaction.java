package js.web.indexeddb;


import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/22/2020.
 */
public interface IDBTransaction extends EventTarget {
    @JSBody(script = "return IDBTransaction.prototype")
    static IDBTransaction prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new IDBTransaction()")
    static IDBTransaction create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the transaction's connection.
     */
    @JSProperty
    IDBDatabase getDb();

    /**
     * If the transaction was aborted, returns the error (a DOMException) providing the reason.
     */
    @JSProperty
    DOMException getError();

    /**
     * Returns the mode the transaction was created with ("readonly" or "readwrite"), or "versionchange" for an upgrade transaction.
     */
    @JSProperty
    IDBTransactionMode getMode();

    /**
     * Returns a list of the names of object stores in the transaction's scope. For an upgrade transaction this is all object stores in the database.
     */
    @JSProperty
    DOMStringList getObjectStoreNames();

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

    @JSProperty
    @Nullable
    EventListener<Event> getOncomplete();

    @JSProperty
    void setOncomplete(EventListener<Event> oncomplete);

    default void addCompleteEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("complete", listener, options);
    }

    default void addCompleteEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("complete", listener, options);
    }

    default void addCompleteEventListener(EventListener<Event> listener) {
        addEventListener("complete", listener);
    }

    default void removeCompleteEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("complete", listener, options);
    }

    default void removeCompleteEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("complete", listener, options);
    }

    default void removeCompleteEventListener(EventListener<Event> listener) {
        removeEventListener("complete", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnerror();

    @JSProperty
    void setOnerror(EventListener<Event> onerror);

    default void addErrorEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<Event> listener) {
        addEventListener("error", listener);
    }

    default void removeErrorEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<Event> listener) {
        removeEventListener("error", listener);
    }

    /**
     * Aborts the transaction. All pending requests will fail with a "AbortError" DOMException and all changes made to the database will be reverted.
     */
    void abort();

    /**
     * Returns an IDBObjectStore in the transaction's scope.
     */
    IDBObjectStore objectStore(String name);

}
