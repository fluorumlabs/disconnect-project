package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <div> elements.
 */
public interface HTMLDivElement extends HTMLElement {
    @JSBody(script = "return HTMLDivElement.prototype")
    static HTMLDivElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLDivElement()")
    static HTMLDivElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @Deprecated
    @JSProperty
    void setAlign(String align);

}
