package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating quoting elements, like <blockquote> and <q>, but not the <cite> element. */
public interface HTMLQuoteElement extends HTMLElement {
    /**
     * Sets or retrieves reference information about the object.
     */
    @JSProperty
    String getCite();

    @JSProperty
    void setCite(String cite);

    @JSBody(script = "return HTMLQuoteElement.prototype")
    static HTMLQuoteElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLQuoteElement()")
    static HTMLQuoteElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
