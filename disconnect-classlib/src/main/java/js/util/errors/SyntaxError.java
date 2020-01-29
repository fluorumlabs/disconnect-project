package js.util.errors;

import org.teavm.jso.JSBody;


public interface SyntaxError extends JsError {
    @JSBody(params = "value", script = "return new SyntaxError(value)")
    static SyntaxError create(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(script = "return new SyntaxError()")
    static SyntaxError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return SyntaxError.prototype")
    static SyntaxError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
