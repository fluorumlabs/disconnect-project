package js.util.collections;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface IntFloatPair extends Any {
    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    static IntFloatPair of(int key, float value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return this[0]")
    int getKey();

    @JSBody(script = "return this[1]")
    float getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    float setValue(float value);

}
