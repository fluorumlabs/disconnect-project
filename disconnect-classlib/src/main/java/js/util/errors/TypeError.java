package js.util.errors;

import org.teavm.jso.JSBody;


public interface TypeError extends JsError {
    @JSBody(params = "value", script = "return new TypeError(value)")
    static TypeError create(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new TypeError()")
    static TypeError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return TypeError.prototype")
    static TypeError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
