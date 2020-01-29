package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating <hr> elements.
 */
public interface HTMLHRElement extends HTMLElement {
    @JSBody(script = "return HTMLHRElement.prototype")
    static HTMLHRElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLHRElement()")
    static HTMLHRElement create() {
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

    @Deprecated
    @JSProperty
    String getColor();

    @JSProperty
    void setColor(String color);

    /**
     * Sets or retrieves whether the horizontal rule is drawn with 3-D shading.
     */
    @Deprecated
    @JSProperty
    boolean isNoShade();

    @JSProperty
    void setNoShade(boolean noShade);

    @Deprecated
    @JSProperty
    String getSize();

    @JSProperty
    void setSize(String size);

    /**
     * Sets or retrieves the width of the object.
     */
    @Deprecated
    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

}
