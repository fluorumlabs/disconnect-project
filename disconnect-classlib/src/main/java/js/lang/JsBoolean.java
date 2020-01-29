package js.lang;

import org.teavm.jso.JSBody;


public abstract class JsBoolean implements Any {
    @JSBody(params = "value", script = "return Boolean(value)")
    public static native JsBoolean of(boolean value);

    @JSBody(params = "value", script = "return Boolean(value)")
    static JsBoolean create(Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "value", script = "return Boolean()")
    static JsBoolean create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return Boolean.prototype")
    static JsString prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the primitive value of the specified object.
     */
    public native boolean valueOf();
}
