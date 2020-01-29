package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A controller object that allows you to abort one or more DOM requests as and when desired.
 */
public interface AbortController extends Any {
    @JSBody(script = "return new AbortController()")
    static AbortController create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return AbortController.prototype")
    static AbortController prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the AbortSignal object associated with this object.
     */
    @JSProperty
    AbortSignal getSignal();

    /**
     * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
     */
    void abort();

}
