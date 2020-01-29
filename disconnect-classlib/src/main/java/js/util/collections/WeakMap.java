package js.util.collections;

import js.lang.Any;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;


public abstract class WeakMap<K extends Any, V extends Any> implements Any {
    @JSBody(script = "return WeakMap.prototype")
    public static WeakMap prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WeakMap()")
    public static <K extends Any, V extends Any> WeakMap<K, V> create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "entries", script = "return new WeakMap(entries)")
    public static <K extends Any, V extends Any> WeakMap<K, V> create(Array<KeyValue<K, V>> entries) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "entries", script = "return new WeakMap(entries)")
    public static <K extends Any, V extends Any> WeakMap<K, V> create(JsIterable<KeyValue<K, V>> entries) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    public native boolean delete(K key);

    public native V get(K key);

    public native boolean has(K key);

    public native WeakMap<K, V> set(K key, V value);

}
