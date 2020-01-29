package js.util.collections;

import js.lang.Any;
import js.lang.JsObject;
import org.teavm.jso.JSBody;

import java.util.Map;


public abstract class KeyValue<K extends Any, V extends Any> implements Any, Map.Entry<K, V> {
    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    public static <K extends Any, V extends Any> KeyValue of(K key, V value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return this[0]")
    @Override
    public native K getKey();

    @JSBody(script = "return this[1]")
    @Override
    public native V getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    @Override
    public native V setValue(V value);

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        KeyValue<K, V> other = (KeyValue<K, V>) o;

        boolean result = (other.getKey() == null && getKey() == null) || JsObject.is(other.getKey(), getKey());
        result &= (other.getValue() == null && getValue() == null) || JsObject.is(other.getValue(), getValue());

        return result;
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException();
    }
}
