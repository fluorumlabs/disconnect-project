package js.util.collections;

import js.lang.Any;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;


public interface JsMap<K extends Any, V extends Any> extends ReadonlyMap<K,V> {
     void clear();
     boolean delete(K key);
     JsMap<K,V> set(K key, V value);

    @JSBody(script = "return Map.prototype")
    static JsMap prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Map()")
    static <K extends Any, V extends Any> JsMap<K,V> create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="entries", script = "return new Map(entries)")
    static <K extends Any, V extends Any> JsMap<K,V> create(Array<KeyValue<K, V>> entries) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="entries", script = "return new Map(entries)")
    static <K extends Any, V extends Any> JsMap<K,V> create(@JSByRef KeyValue<K, V> entries) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="entries", script = "return new Map(entries)")
    static <K extends Any, V extends Any> JsMap<K,V> create(JsIterable<KeyValue<K, V>> entries) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


}
