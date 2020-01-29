package js.util.errors;

import org.teavm.jso.JSBody;


public interface ReferenceError extends JsError {
    @JSBody(params = "value", script = "return new ReferenceError(value)")
    static ReferenceError create(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ReferenceError()")
    static ReferenceError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return ReferenceError.prototype")
    static ReferenceError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
