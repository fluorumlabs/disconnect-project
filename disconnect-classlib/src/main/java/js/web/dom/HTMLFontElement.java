package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Implements the document object model (DOM) representation of the font element. The HTML Font Element <font> defines the font size, font face and color of text. */
public interface HTMLFontElement extends HTMLElement {
    @Deprecated
    @JSProperty
    String getColor();

    @JSProperty
    void setColor(String color);

    /**
     * Sets or retrieves the current typeface family.
     */
    @Deprecated
    @JSProperty
    String getFace();

    @JSProperty
    void setFace(String face);

    @Deprecated
    @JSProperty
    String getSize();

    @JSProperty
    void setSize(String size);

    @JSBody(script = "return HTMLFontElement.prototype")
    static HTMLFontElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLFontElement()")
    static HTMLFontElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
