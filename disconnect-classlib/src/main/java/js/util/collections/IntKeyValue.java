package js.util.collections;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface IntKeyValue<V extends Any> extends Any {
    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    static <V extends Any> IntKeyValue of(int key, V value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return this[0]")
    int getKey();

    @JSBody(script = "return this[1]")
    V getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    V setValue(V value);

}
