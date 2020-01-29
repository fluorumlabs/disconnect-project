package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Serves as the root node for a given HTML document. This object inherits the properties and methods described in the HTMLElement interface.
 */
public interface HTMLHtmlElement extends HTMLElement {
    @JSBody(script = "return HTMLHtmlElement.prototype")
    static HTMLHtmlElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLHtmlElement()")
    static HTMLHtmlElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves the DTD version that governs the current document.
     */
    @Deprecated
    @JSProperty
    String getVersion();

    @JSProperty
    void setVersion(String version);

}
