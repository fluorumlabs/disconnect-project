package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface HTMLDirectoryElement extends HTMLElement {
    @Deprecated
    @JSProperty
    boolean isCompact();

    @JSProperty
    void setCompact(boolean compact);

    @JSBody(script = "return HTMLDirectoryElement.prototype")
    static HTMLDirectoryElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLDirectoryElement()")
    static HTMLDirectoryElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
