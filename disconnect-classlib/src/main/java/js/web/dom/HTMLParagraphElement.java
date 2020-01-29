package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond those of the regular HTMLElement object interface it inherits) for manipulating <p> elements.
 */
public interface HTMLParagraphElement extends HTMLElement {
    @JSBody(script = "return HTMLParagraphElement.prototype")
    static HTMLParagraphElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLParagraphElement()")
    static HTMLParagraphElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

}
