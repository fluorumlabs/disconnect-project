package js.util.collections;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface IntDoublePair extends Any {
    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    static IntDoublePair of(int key, double value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return this[0]")
    int getKey();

    @JSBody(script = "return this[1]")
    double getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    double setValue(double value);

}
