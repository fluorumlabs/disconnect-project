package js.util.errors;

import org.teavm.jso.JSBody;


public interface EvalError extends JsError {

    @JSBody(params = "value", script = "return new EvalError(value)")
    static EvalError create(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new EvalError()")
    static EvalError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return EvalError.prototype")
    static EvalError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
