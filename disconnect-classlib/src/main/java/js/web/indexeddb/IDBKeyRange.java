package js.web.indexeddb;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A key range can be a single value or a range with upper and lower bounds or endpoints. If the key range has both upper and lower bounds, then it is bounded; if it has no bounds, it is unbounded. A bounded key range can either be open (the endpoints are excluded) or closed (the endpoints are included). To retrieve all keys within a certain range, you can use the following code constructs:
 */
public interface IDBKeyRange extends Any {
    @JSBody(script = "return IDBKeyRange.prototype")
    static IDBKeyRange prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new IDBKeyRange()")
    static IDBKeyRange create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
     */
    @JSBody(params = {"lower", "upper", "lowerOpen", "upperOpen"}, script = "return IDBKeyRange.bound(lower,upper,lowerOpen,upperOpen)")
    static IDBKeyRange bound(Any lower, Any upper, boolean lowerOpen, boolean upperOpen) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"lower", "upper", "lowerOpen"}, script = "return IDBKeyRange.bound(lower,upper,lowerOpen)")
    static IDBKeyRange bound(Any lower, Any upper, boolean lowerOpen) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"lower", "upper"}, script = "return IDBKeyRange.bound(lower,upper)")
    static IDBKeyRange bound(Any lower, Any upper) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
     */
    @JSBody(params = {"lower", "open"}, script = "return IDBKeyRange.lowerBound(lower,open)")
    static IDBKeyRange lowerBound(Any lower, boolean open) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"lower"}, script = "return IDBKeyRange.lowerBound(lower)")
    static IDBKeyRange lowerBound(Any lower) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a new IDBKeyRange spanning only key.
     */
    @JSBody(params = {"value"}, script = "return IDBKeyRange.only(value)")
    static IDBKeyRange only(Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
     */
    @JSBody(params = {"upper", "open"}, script = "return IDBKeyRange.upperBound(upper,open)")
    static IDBKeyRange upperBound(Any upper, boolean open) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"upper"}, script = "return IDBKeyRange.upperBound(upper)")
    static IDBKeyRange upperBound(Any upper) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns lower bound, or undefined if none.
     */
    @JSProperty
    Unknown getLower();

    /**
     * Returns true if the lower open flag is set, and false otherwise.
     */
    @JSProperty
    boolean isLowerOpen();

    /**
     * Returns upper bound, or undefined if none.
     */
    @JSProperty
    Unknown getUpper();

    /**
     * Returns true if the upper open flag is set, and false otherwise.
     */
    @JSProperty
    boolean isUpperOpen();

    /**
     * Returns true if key is included in the range, and false otherwise.
     */
    boolean includes(Any key);

}
