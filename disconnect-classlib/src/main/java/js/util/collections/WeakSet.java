package js.util.collections;

import js.lang.Any;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;


public abstract class WeakSet<T extends Any> implements Any {
        public native WeakSet<T> add(T value);
    public native boolean delete(T value);
    public native boolean has(T value);
    
    @JSBody(script = "return WeakSet.prototype")
    static WeakSet prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    
    @JSBody(script = "return new WeakSet()")
    static <T extends Any> WeakSet<T> create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    
    @JSBody(params="values", script = "return new WeakSet(values)")
    static <T extends Any> WeakSet<T> create(Array<T> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params="values", script = "return new WeakSet(values)")
    static <T extends Any> WeakSet<T> create(JsIterable<T> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params="values", script = "return new WeakSet(values)")
    static <T extends Any> WeakSet<T> create(@JSByRef T... values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
