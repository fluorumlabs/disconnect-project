package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A HTML line break element (<br>). It inherits from HTMLElement.
 */
public interface HTMLBRElement extends HTMLElement {
    @JSBody(script = "return HTMLBRElement.prototype")
    static HTMLBRElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLBRElement()")
    static HTMLBRElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves the side on which floating objects are not to be positioned when any IHTMLBlockElement is inserted into the document.
     */
    @Deprecated
    @JSProperty
    String getClear();

    @JSProperty
    void setClear(String clear);

}
