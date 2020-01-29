package js.util.collections;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface IntShortPair extends Any {
    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    static IntShortPair of(int key, short value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return this[0]")
    int getKey();

    @JSBody(script = "return this[1]")
    short getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    short setValue(short value);

}
