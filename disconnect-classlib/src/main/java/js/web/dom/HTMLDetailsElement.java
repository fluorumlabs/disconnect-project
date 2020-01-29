package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface HTMLDetailsElement extends HTMLElement {
    @JSBody(script = "return HTMLDetailsElement.prototype")
    static HTMLDetailsElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLDetailsElement()")
    static HTMLDetailsElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isOpen();

    @JSProperty
    void setOpen(boolean open);

}
