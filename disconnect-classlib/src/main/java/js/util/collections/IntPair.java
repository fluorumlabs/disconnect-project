package js.util.collections;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface IntPair extends Any {
    @JSBody(script = "return this[0]")
    int getKey();

    @JSBody(script = "return this[1]")
    int getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    int setValue(int value);

    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    static IntPair of(int key, int value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
