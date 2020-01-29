package js.util.collections;

import js.lang.Any;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;


public interface JsSet<T extends Any> extends ReadonlySet<T> {
     JsSet<T> add(T value);
     void clear();
     boolean delete(T value);

    @JSBody(script = "return Set.prototype")
    static JsSet prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Set()")
    static <T extends Any> JsSet<T> create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="values", script = "return new Set(values)")
    static <T extends Any> JsSet<T> create(Array<T> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params="values", script = "return new Set(values)")
    static <T extends Any> JsSet<T> create(JsIterable<T> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params="values", script = "return new Set(values)")
    static <T extends Any> JsSet<T> create(@JSByRef T... values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
