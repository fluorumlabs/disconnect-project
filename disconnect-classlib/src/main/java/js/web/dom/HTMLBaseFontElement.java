package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating &lt;basefont&gt; elements.
 */
public interface HTMLBaseFontElement extends HTMLElement, DOML2DeprecatedColorProperty {
    @JSBody(script = "return HTMLBaseFontElement.prototype")
    static HTMLBaseFontElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLBaseFontElement()")
    static HTMLBaseFontElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves the current typeface family.
     */
    @Deprecated
    @JSProperty
    String getFace();

    @JSProperty
    void setFace(String face);

    /**
     * Sets or retrieves the font size of the object.
     */
    @Deprecated
    @JSProperty
    double getSize();

    @JSProperty
    void setSize(double size);

}
