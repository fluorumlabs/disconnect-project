package js.web.dom;

import org.teavm.jso.JSBody;

/**
 * Contains the descriptive information, or metadata, for a document. This object inherits all of the properties and methods described in the HTMLElement interface.
 */
public interface HTMLHeadElement extends HTMLElement {
    @JSBody(script = "return HTMLHeadElement.prototype")
    static HTMLHeadElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLHeadElement()")
    static HTMLHeadElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
