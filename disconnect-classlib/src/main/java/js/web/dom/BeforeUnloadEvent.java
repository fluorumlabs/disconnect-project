package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The beforeunload event is fired when the window, the document and its resources are about to be unloaded.
 */
public interface BeforeUnloadEvent extends Event {
    @JSBody(script = "return BeforeUnloadEvent.prototype")
    static BeforeUnloadEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new BeforeUnloadEvent()")
    static BeforeUnloadEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Any getReturnValue();

    @JSProperty
    void setReturnValue(Any returnValue);

}
