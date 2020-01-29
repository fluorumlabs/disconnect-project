package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Provides special properties (beyond the HTMLElement interface it also has available to it inheritance) for manipulating single or grouped table column elements. */
public interface HTMLTableColElement extends HTMLElement {
    /**
     * Sets or retrieves the alignment of the object relative to the display or table.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    @Deprecated
    @JSProperty
    String getCh();

    @JSProperty
    void setCh(String ch);

    @Deprecated
    @JSProperty
    String getChOff();

    @JSProperty
    void setChOff(String chOff);

    /**
     * Sets or retrieves the number of columns in the group.
     */
    @JSProperty
    double getSpan();

    @JSProperty
    void setSpan(double span);

    @Deprecated
    @JSProperty
    String getVAlign();

    @JSProperty
    void setVAlign(String vAlign);

    /**
     * Sets or retrieves the width of the object.
     */
    @Deprecated
    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

    @JSBody(script = "return HTMLTableColElement.prototype")
    static HTMLTableColElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTableColElement()")
    static HTMLTableColElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
