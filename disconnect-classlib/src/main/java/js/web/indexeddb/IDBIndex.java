package js.web.indexeddb;

import js.lang.Any;
import js.lang.JsNumber;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * IDBIndex interface of the IndexedDB API provides asynchronous access to an index in a database. An index is a kind of object store for looking up records in another object store, called the referenced object store. You use this interface to retrieve data.
 */
public interface IDBIndex extends Any {
    @JSBody(script = "return IDBIndex.prototype")
    static IDBIndex prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new IDBIndex()")
    static IDBIndex create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Unknown getKeyPath();

    @JSProperty
    boolean isMultiEntry();

    /**
     * Returns the name of the index.
     */
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * Returns the IDBObjectStore the index belongs to.
     */
    @JSProperty
    IDBObjectStore getObjectStore();

    @JSProperty
    boolean isUnique();

    /**
     * Retrieves the number of records matching the given key or key range in query.
     * <p>
     * If successful, request's result will be the count.
     */
    IDBRequest<JsNumber> count(IDBValidKey key);

    IDBRequest<JsNumber> count(IDBKeyRange key);

    IDBRequest<JsNumber> count();

    /**
     * Retrieves the value of the first record matching the given key or key range in query.
     * <p>
     * If successful, request's result will be the value, or undefined if there was no matching record.
     */
    IDBRequest<Unknown> get(IDBValidKey key);

    IDBRequest<Unknown> get(IDBKeyRange key);

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

    /**
     * Opens a cursor over the records matching query, ordered by direction. If query is null, all records in index are matched.
     * <p>
     * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
     */
    IDBRequest<IDBCursorWithValue> openCursor(@Nullable IDBValidKey query, IDBCursorDirection direction);

    IDBRequest<IDBCursorWithValue> openCursor(@Nullable IDBKeyRange query, IDBCursorDirection direction);

    IDBRequest<IDBCursorWithValue> openCursor(IDBValidKey query);

    IDBRequest<IDBCursorWithValue> openCursor(IDBKeyRange query);

    IDBRequest<IDBCursorWithValue> openCursor();

    /**
     * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in index are matched.
     * <p>
     * If successful, request's result will be an IDBCursor, or null if there were no matching records.
     */
    IDBRequest<IDBCursor> openKeyCursor(@Nullable IDBValidKey query, IDBCursorDirection direction);

    IDBRequest<IDBCursor> openKeyCursor(@Nullable IDBKeyRange query, IDBCursorDirection direction);

    IDBRequest<IDBCursor> openKeyCursor(IDBValidKey query);

    IDBRequest<IDBCursor> openKeyCursor(IDBKeyRange query);

    IDBRequest<IDBCursor> openKeyCursor();

}
