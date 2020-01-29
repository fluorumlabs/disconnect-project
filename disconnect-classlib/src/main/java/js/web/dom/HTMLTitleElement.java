package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Contains the title for a document. This element inherits all of the properties and methods of the HTMLElement interface. */
public interface HTMLTitleElement extends HTMLElement {
    /**
     * Retrieves or sets the text of the object as a string.
     */
    @JSProperty
    String getText();

    @JSProperty
    void setText(String text);

    @JSBody(script = "return HTMLTitleElement.prototype")
    static HTMLTitleElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTitleElement()")
    static HTMLTitleElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
