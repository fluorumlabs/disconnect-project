package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <area> elements.
 */
public interface HTMLAreaElement extends HTMLElement, HTMLHyperlinkElementUtils {
    @JSBody(script = "return HTMLAreaElement.prototype")
    static HTMLAreaElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLAreaElement()")
    static HTMLAreaElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    @JSProperty
    String getAlt();

    @JSProperty
    void setAlt(String alt);

    /**
     * Sets or retrieves the coordinates of the object.
     */
    @JSProperty
    String getCoords();

    @JSProperty
    void setCoords(String coords);

    @JSProperty
    String getDownload();

    @JSProperty
    void setDownload(String download);

    /**
     * Sets or gets whether clicks in this region cause action.
     */
    @Deprecated
    @JSProperty
    boolean isNoHref();

    @JSProperty
    void setNoHref(boolean noHref);

    @JSProperty
    String getPing();

    @JSProperty
    void setPing(String ping);

    @JSProperty
    String getReferrerPolicy();

    @JSProperty
    void setReferrerPolicy(String referrerPolicy);

    @JSProperty
    String getRel();

    @JSProperty
    void setRel(String rel);

    @JSProperty
    DOMTokenList getRelList();

    /**
     * Sets or retrieves the shape of the object.
     */
    @JSProperty
    String getShape();

    @JSProperty
    void setShape(String shape);

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    @JSProperty
    String getTarget();

    @JSProperty
    void setTarget(String target);

}
