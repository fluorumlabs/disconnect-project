package js.util.errors;

import org.teavm.jso.JSBody;


public interface URIError extends JsError {
    @JSBody(params = "value", script = "return new URIError(value)")
    static URIError create(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(script = "return new URIError()")
    static URIError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return URIError.prototype")
    static URIError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
