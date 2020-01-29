package js.util.errors;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface JsError extends Any {
    @JSBody(params = "value", script = "return new Error(value)")
    static JsError create(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Error()")
    static JsError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return Error.prototype")
    static JsError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    @JSProperty
    String getMessage();

    @JSProperty
    void setMessage(String message);

    @JSProperty
    @Nullable
    String getStack();

    @JSProperty
    void setStack(String stack);
}
