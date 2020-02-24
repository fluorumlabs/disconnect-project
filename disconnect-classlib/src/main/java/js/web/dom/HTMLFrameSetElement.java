package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond those of the regular HTMLElement interface they also inherit) for manipulating &lt;frameset&gt; elements.
 */
public interface HTMLFrameSetElement extends HTMLElement, WindowEventHandlers {
    @JSBody(script = "return HTMLFrameSetElement.prototype")
    static HTMLFrameSetElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLFrameSetElement()")
    static HTMLFrameSetElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves the frame widths of the object.
     */
    @Deprecated
    @JSProperty
    String getCols();

    @JSProperty
    void setCols(String cols);

    /**
     * Sets or retrieves the frame heights of the object.
     */
    @Deprecated
    @JSProperty
    String getRows();

    @JSProperty
    void setRows(String rows);

}
