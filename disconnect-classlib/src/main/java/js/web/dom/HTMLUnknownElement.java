package js.web.dom;

import org.teavm.jso.JSBody;

/**
 * An invalid HTML element and derives from the HTMLElement interface, but without implementing any additional properties or methods.
 */
public interface HTMLUnknownElement extends HTMLElement {
    @JSBody(script = "return HTMLUnknownElement.prototype")
    static HTMLUnknownElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLUnknownElement()")
    static HTMLUnknownElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
