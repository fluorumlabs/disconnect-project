package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating quoting elements, like &lt;blockquote&gt; and &lt;q&gt;, but not the &lt;cite&gt; element.
 */
public interface HTMLQuoteElement extends HTMLElement {
    @JSBody(script = "return HTMLQuoteElement.prototype")
    static HTMLQuoteElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLQuoteElement()")
    static HTMLQuoteElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves reference information about the object.
     */
    @JSProperty
    String getCite();

    @JSProperty
    void setCite(String cite);

}
