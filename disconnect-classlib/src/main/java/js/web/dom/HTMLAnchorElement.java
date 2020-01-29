package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Hyperlink elements and provides special properties and methods (beyond those of the regular HTMLElement object interface that they inherit from) for manipulating the layout and presentation of such elements.
 */
public interface HTMLAnchorElement extends HTMLElement, HTMLHyperlinkElementUtils {
    @JSBody(script = "return HTMLAnchorElement.prototype")
    static HTMLAnchorElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLAnchorElement()")
    static HTMLAnchorElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves the character set used to encode the object.
     */
    @Deprecated
    @JSProperty
    String getCharset();

    @Deprecated
    @JSProperty
    void setCharset(String charset);

    /**
     * Sets or retrieves the coordinates of the object.
     */
    @Deprecated
    @JSProperty
    String getCoords();

    @Deprecated
    @JSProperty
    void setCoords(String coords);

    @JSProperty
    String getDownload();

    @JSProperty
    void setDownload(String download);

    /**
     * Sets or retrieves the language code of the object.
     */
    @JSProperty
    String getHreflang();

    @JSProperty
    void setHreflang(String hreflang);

    /**
     * Sets or retrieves the shape of the object.
     */
    @Deprecated
    @JSProperty
    String getName();

    @Deprecated
    @JSProperty
    void setName(String name);

    @JSProperty
    String getPing();

    @JSProperty
    void setPing(String ping);

    @JSProperty
    String getReferrerPolicy();

    @JSProperty
    void setReferrerPolicy(String referrerPolicy);

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     */
    @JSProperty
    String getRel();

    @JSProperty
    void setRel(String rel);

    @JSProperty
    DOMTokenList getRelList();

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     */
    @Deprecated
    @JSProperty
    String getRev();

    @Deprecated
    @JSProperty
    void setRev(String rev);

    /**
     * Sets or retrieves the shape of the object.
     */
    @Deprecated
    @JSProperty
    String getShape();

    @Deprecated
    @JSProperty
    void setShape(String shape);

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    @JSProperty
    String getTarget();

    @JSProperty
    void setTarget(String target);

    /**
     * Retrieves or sets the text of the object as a string.
     */
    @JSProperty
    String getText();

    @JSProperty
    void setText(String text);

    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

}
