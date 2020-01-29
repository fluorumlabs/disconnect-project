package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** An error object that contains an error name. */
public interface DOMError extends Any {
    @JSProperty
    String getName();

    String toString();

    @JSBody(script = "return DOMError.prototype")
    static DOMError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMError()")
    static DOMError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
