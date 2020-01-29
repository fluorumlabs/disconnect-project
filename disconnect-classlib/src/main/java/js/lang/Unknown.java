package js.lang;

import org.teavm.jso.JSBody;


public interface Unknown extends Any {
    @JSBody(script = "return this")
    double doubleValue();
    @JSBody(script = "return this")
    int intValue();
    @JSBody(script = "return this")
    byte byteValue();
    @JSBody(script = "return this")
    char charValue();
    @JSBody(script = "return this")
    short shortValue();
    @JSBody(script = "return this")
    float floatValue();
    @JSBody(script = "return this")
    boolean booleanValue();
    @JSBody(script = "return this")
    String stringValue();

    @JSBody(params = "other", script = "return this === other")
    boolean equals(Unknown other);

    @JSBody(params = "value", script = "return value")
    static Unknown of(double value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params = "value", script = "return value")
    static Unknown of(int value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params = "value", script = "return value")
    static Unknown of(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "value", script = "return value")
    static Unknown of(boolean value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
