package js.util.errors;

import org.teavm.jso.JSBody;


public interface RangeError extends JsError {
    @JSBody(params = "value", script = "return new RangeError(value)")
    static RangeError create(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(script = "return new RangeError()")
    static RangeError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return RangeError.prototype")
    static RangeError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
