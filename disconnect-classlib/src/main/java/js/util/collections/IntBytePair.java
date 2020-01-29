package js.util.collections;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface IntBytePair extends Any {
    @JSBody(script = "return this[0]")
    int getKey();

    @JSBody(script = "return this[1]")
    byte getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    byte setValue(byte value);

    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    static IntBytePair of(int key, byte value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
