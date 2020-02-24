package com.github.fluorumlabs.disconnect.types;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface StringKeyDoubleArrayValue extends Any {
    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    static StringKeyDoubleArrayValue of(String key, double[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return this[0]")
    String getKey();

    @JSBody(script = "return this[1]")
    double[] getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    double[] setValue(double[] value);

}
