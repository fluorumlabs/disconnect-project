package js.web.indexeddb;

import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This IndexedDB API interface represents a cursor for traversing or iterating over multiple records in a database. It is the same as the IDBCursor, except that it includes the value property.
 */
public interface IDBCursorWithValue extends IDBCursor {
    @JSBody(script = "return IDBCursorWithValue.prototype")
    static IDBCursorWithValue prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new IDBCursorWithValue()")
    static IDBCursorWithValue create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the cursor's current value.
     */
    @JSProperty
    Unknown getValue();

}
