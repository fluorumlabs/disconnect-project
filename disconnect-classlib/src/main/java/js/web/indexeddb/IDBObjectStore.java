package js.web.indexeddb;

import js.lang.Any;
import js.lang.JsNumber;
import js.lang.Unknown;
import js.util.collections.Array;
import js.util.iterable.StringIterable;
import js.web.dom.DOMStringList;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This example shows a variety of different uses of object stores, from updating the data structure with IDBObjectStore.createIndex inside an onupgradeneeded function, to adding a new item to our object store with IDBObjectStore.add. For a full working example, see our To-do Notifications app (view example live.)
 */
public interface IDBObjectStore extends Any {
    @JSBody(script = "return IDBObjectStore.prototype")
    static IDBObjectStore prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new IDBObjectStore()")
    static IDBObjectStore create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns true if the store has a key generator, and false otherwise.
     */
    @JSProperty
    boolean isAutoIncrement();

    /**
     * Returns a list of the names of indexes in the store.
     */
    @JSProperty
    DOMStringList getIndexNames();

    /**
     * Returns the key path of the store, or null if none.
     */
    @JSProperty
    Unknown getKeyPath();

    /**
     * Returns the name of the store.
     */
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * Returns the associated transaction.
     */
    @JSProperty
    IDBTransaction getTransaction();

    /**
     * Adds or updates a record in store with the given value and key.
     * <p>
     * If the store uses in-line keys and key is specified a "DataError" DOMException will be thrown.
     * <p>
     * If put() is used, any existing record with the key will be replaced. If add() is used, and if a record with the key already exists the request will fail, with request's error set to a "ConstraintError" DOMException.
     * <p>
     * If successful, request's result will be the record's key.
     */
    IDBRequest<IDBValidKey> add(Any value, IDBValidKey key);

    IDBRequest<IDBValidKey> add(Any value);

    /**
     * Deletes all records in store.
     * <p>
     * If successful, request's result will be undefined.
     */
    IDBRequest<Unknown> clear();

    /**
     * Retrieves the number of records matching the given key or key range in query.
     * <p>
     * If successful, request's result will be the count.
     */
    IDBRequest<JsNumber> count(IDBValidKey key);

    IDBRequest<JsNumber> count(IDBKeyRange key);

    IDBRequest<JsNumber> count();

    /**
     * Creates a new index in store with the given name, keyPath and options and returns a new IDBIndex. If the keyPath and options define constraints that cannot be satisfied with the data already in store the upgrade transaction will abort with a "ConstraintError" DOMException.
     * <p>
     * Throws an "InvalidStateError" DOMException if not called within an upgrade transaction.
     */
    IDBIndex createIndex(String name, String keyPath, IDBIndexParameters options);

    IDBIndex createIndex(String name, StringIterable keyPath, IDBIndexParameters options);

    IDBIndex createIndex(String name, String[] keyPath, IDBIndexParameters options);

    IDBIndex createIndex(String name, String... keyPath);

    /**
     * Deletes records in store with the given key or in the given key range in query.
     * <p>
     * If successful, request's result will be undefined.
     */
    IDBRequest<Unknown> delete(IDBValidKey key);

    IDBRequest<Unknown> delete(IDBKeyRange key);

    /**
     * Deletes the index in store with the given name.
     * <p>
     * Throws an "InvalidStateError" DOMException if not called within an upgrade transaction.
     */
    void deleteIndex(String name);

    /**
     * Retrieves the value of the first record matching the given key or key range in query.
     * <p>
     * If successful, request's result will be the value, or undefined if there was no matching record.
     */
    IDBRequest<Unknown> get(IDBValidKey query);

    IDBRequest<Unknown> get(IDBKeyRange query);

    /**
     * Retrieves the values of the records matching the given key or key range in query (up to count if given).
     * <p>
     * If successful, request's result will be an Array of the values.
     */
    IDBRequest<Array<Unknown>> getAll(@Nullable IDBValidKey query, int count);

    IDBRequest<Array<Unknown>> getAll(@Nullable IDBKeyRange query, int count);

    IDBRequest<Array<Unknown>> getAll(IDBValidKey query);

    IDBRequest<Array<Unknown>> getAll(IDBKeyRange query);

    IDBRequest<Array<Unknown>> getAll();

    /**
     * Retrieves the keys of records matching the given key or key range in query (up to count if given).
     * <p>
     * If successful, request's result will be an Array of the keys.
     */
    IDBRequest<Array<IDBValidKey>> getAllKeys(@Nullable IDBValidKey query, int count);

    IDBRequest<Array<IDBValidKey>> getAllKeys(@Nullable IDBKeyRange query, int count);

    IDBRequest<Array<IDBValidKey>> getAllKeys(IDBValidKey query);

    IDBRequest<Array<IDBValidKey>> getAllKeys(IDBKeyRange query);

    IDBRequest<Array<IDBValidKey>> getAllKeys();

    /**
     * Retrieves the key of the first record matching the given key or key range in query.
     * <p>
     * If successful, request's result will be the key, or undefined if there was no matching record.
     */
    IDBRequest<IDBValidKey> getKey(IDBValidKey key);

    IDBRequest<IDBValidKey> getKey(IDBKeyRange key);

    IDBIndex index(String name);

    /**
     * Opens a cursor over the records matching query, ordered by direction. If query is null, all records in store are matched.
     * <p>
     * If successful, request's result will be an IDBCursorWithValue pointing at the first matching record, or null if there were no matching records.
     */
    IDBRequest<IDBCursorWithValue> openCursor(@Nullable IDBValidKey query, IDBCursorDirection direction);

    IDBRequest<IDBCursorWithValue> openCursor(@Nullable IDBKeyRange query, IDBCursorDirection direction);

    IDBRequest<IDBCursorWithValue> openCursor(IDBValidKey query);

    IDBRequest<IDBCursorWithValue> openCursor(IDBKeyRange query);

    IDBRequest<IDBCursorWithValue> openCursor();

    /**
     * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in store are matched.
     * <p>
     * If successful, request's result will be an IDBCursor pointing at the first matching record, or null if there were no matching records.
     */
    IDBRequest<IDBCursor> openKeyCursor(@Nullable IDBValidKey query, IDBCursorDirection direction);

    IDBRequest<IDBCursor> openKeyCursor(@Nullable IDBKeyRange query, IDBCursorDirection direction);

    IDBRequest<IDBCursor> openKeyCursor(IDBValidKey query);

    IDBRequest<IDBCursor> openKeyCursor(IDBKeyRange query);

    IDBRequest<IDBCursor> openKeyCursor();

    /**
     * Adds or updates a record in store with the given value and key.
     * <p>
     * If the store uses in-line keys and key is specified a "DataError" DOMException will be thrown.
     * <p>
     * If put() is used, any existing record with the key will be replaced. If add() is used, and if a record with the key already exists the request will fail, with request's error set to a "ConstraintError" DOMException.
     * <p>
     * If successful, request's result will be the record's key.
     */
    IDBRequest<IDBValidKey> put(Any value, IDBValidKey key);

    IDBRequest<IDBValidKey> put(Any value);

}
