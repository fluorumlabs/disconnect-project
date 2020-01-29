package js.web.indexeddb;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

/**
 * This IndexedDB API interface represents a cursor for traversing or iterating over multiple records in a database.
 */
public interface IDBCursor extends Any {
    @JSBody(script = "return IDBCursor.prototype")
    static IDBCursor prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new IDBCursor()")
    static IDBCursor create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the direction ("next", "nextunique", "prev" or "prevunique") of the cursor.
     */
    @JSProperty
    IDBCursorDirection getDirection();

    /**
     * Returns the key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished.
     */
    @JSProperty
    IDBValidKey getKey();

    /**
     * Returns the effective key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished.
     */
    @JSProperty
    IDBValidKey getPrimaryKey();

    /**
     * Returns the IDBObjectStore or IDBIndex the cursor was opened from.
     */
    @JSProperty
    Unknown getSource();

    /**
     * Advances the cursor through the next count records in range.
     */
    void advance(int count);

    /**
     * Advances the cursor to the next record in range.
     */
    @JSMethod("continue")
    void doContinue(IDBValidKey key);

    @JSMethod("continue")
    void doContinue();

    /**
     * Advances the cursor to the next record in range matching or after key and primaryKey. Throws an "InvalidAccessError" DOMException if the source is not an index.
     */
    void continuePrimaryKey(IDBValidKey key, IDBValidKey primaryKey);

    /**
     * Delete the record pointed at by the cursor with a new value.
     * <p>
     * If successful, request's result will be undefined.
     */
    IDBRequest<Unknown> delete();

    /**
     * Updated the record pointed at by the cursor with a new value.
     * <p>
     * Throws a "DataError" DOMException if the effective object store uses in-line keys and the key would have changed.
     * <p>
     * If successful, request's result will be the record's key.
     */
    IDBRequest<IDBValidKey> update(Any value);

}
