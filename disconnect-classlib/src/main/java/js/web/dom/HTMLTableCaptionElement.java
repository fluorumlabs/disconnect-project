package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating table caption elements.
 */
public interface HTMLTableCaptionElement extends HTMLElement {
    @JSBody(script = "return HTMLTableCaptionElement.prototype")
    static HTMLTableCaptionElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTableCaptionElement()")
    static HTMLTableCaptionElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves the alignment of the caption or legend.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

}
