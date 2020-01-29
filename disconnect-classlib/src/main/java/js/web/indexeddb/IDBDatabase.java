package js.web.indexeddb;

import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This IndexedDB API interface provides a connection to a database; you can use an IDBDatabase object to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The interface provides the only way to get and manage versions of the database.
 */
public interface IDBDatabase extends EventTarget {
    @JSBody(script = "return IDBDatabase.prototype")
    static IDBDatabase prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new IDBDatabase()")
    static IDBDatabase create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the name of the database.
     */
    @JSProperty
    String getName();

    /**
     * Returns a list of the names of object stores in the database.
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

    @JSProperty
    @Nullable
    EventListener<IDBVersionChangeEvent> getOnversionchange();

    @JSProperty
    void setOnversionchange(EventListener<IDBVersionChangeEvent> onversionchange);

    default void addVersionChangeEventListener(EventListener<IDBVersionChangeEvent> listener, AddEventListenerOptions options) {
        addEventListener("versionchange", listener, options);
    }

    default void addVersionChangeEventListener(EventListener<IDBVersionChangeEvent> listener, boolean options) {
        addEventListener("versionchange", listener, options);
    }

    default void addVersionChangeEventListener(EventListener<IDBVersionChangeEvent> listener) {
        addEventListener("versionchange", listener);
    }

    default void removeVersionChangeEventListener(EventListener<IDBVersionChangeEvent> listener, EventListenerOptions options) {
        removeEventListener("versionchange", listener, options);
    }

    default void removeVersionChangeEventListener(EventListener<IDBVersionChangeEvent> listener, boolean options) {
        removeEventListener("versionchange", listener, options);
    }

    default void removeVersionChangeEventListener(EventListener<IDBVersionChangeEvent> listener) {
        removeEventListener("versionchange", listener);
    }

    /**
     * Returns the version of the database.
     */
    @JSProperty
    int getVersion();

    /**
     * Closes the connection once all running transactions have finished.
     */
    void close();

    /**
     * Creates a new object store with the given name and options and returns a new IDBObjectStore.
     * <p>
     * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
     */
    IDBObjectStore createObjectStore(String name, IDBObjectStoreParameters optionalParameters);

    IDBObjectStore createObjectStore(String name);

    /**
     * Deletes the object store with the given name.
     * <p>
     * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
     */
    void deleteObjectStore(String name);

    /**
     * Returns a new transaction with the given mode ("readonly" or "readwrite") and scope which can be a single object store name or an array of names.
     */
    IDBTransaction transaction(String storeNames, IDBTransactionMode mode);

    IDBTransaction transaction(@JSByRef String[] storeNames, IDBTransactionMode mode);

    IDBTransaction transaction(@JSByRef String... storeNames);

}
