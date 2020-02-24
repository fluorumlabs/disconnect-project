package com.github.fluorumlabs.disconnect.types;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface DoubleKeyStringValue extends Any {
    @JSBody(params = {"key", "value"}, script = "return [key, value]")
    static DoubleKeyStringValue of(double key, String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return this[0]")
    double getKey();

    @JSBody(script = "return this[1]")
    String getValue();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    String setValue(String value);

}
