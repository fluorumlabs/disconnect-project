package js.util.collections;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface IntStringPair extends Any {
    @JSBody(script = "return this[0]")
    int getKey();

    @JSBody(script = "return this[1]")
    String getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    String setValue(String value);

    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    static IntStringPair of(int key, String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
