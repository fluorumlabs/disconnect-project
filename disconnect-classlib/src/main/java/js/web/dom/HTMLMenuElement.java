package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface HTMLMenuElement extends HTMLElement {
    @Deprecated
    @JSProperty
    boolean isCompact();

    @JSProperty
    void setCompact(boolean compact);

    @JSBody(script = "return HTMLMenuElement.prototype")
    static HTMLMenuElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLMenuElement()")
    static HTMLMenuElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
