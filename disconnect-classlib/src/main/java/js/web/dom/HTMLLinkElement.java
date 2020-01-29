package js.web.dom;


import js.web.cssom.LinkStyle;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Reference information for external resources and the relationship of those resources to a document and vice-versa. This object inherits all of the properties and methods of the HTMLElement interface. */
public interface HTMLLinkElement extends HTMLElement, LinkStyle {
    @JSProperty
    String getAs();

    @JSProperty
    void setAs(String as);

    /**
     * Sets or retrieves the character set used to encode the object.
     */
    @Deprecated
    @JSProperty
    String getCharset();

    @JSProperty
    void setCharset(String charset);

    @JSProperty
    @Nullable
    String  getCrossOrigin();

    @JSProperty
    void setCrossOrigin(String crossOrigin);

    @JSProperty
    boolean isDisabled();

    @JSProperty
    void setDisabled(boolean disabled);

    /**
     * Sets or retrieves a destination URL or an anchor point.
     */
    @JSProperty
    String getHref();

    @JSProperty
    void setHref(String href);

    /**
     * Sets or retrieves the language code of the object.
     */
    @JSProperty
    String getHreflang();

    @JSProperty
    void setHreflang(String hreflang);

    @JSProperty
    String getImageSizes();

    @JSProperty
    void setImageSizes(String imageSizes);

    @JSProperty
    String getImageSrcset();

    @JSProperty
    void setImageSrcset(String imageSrcset);

    @JSProperty
    String getIntegrity();

    @JSProperty
    void setIntegrity(String integrity);

    /**
     * Sets or retrieves the media type.
     */
    @JSProperty
    String getMedia();

    @JSProperty
    void setMedia(String media);

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

    @JSProperty
    void setRev(String rev);

    @JSProperty
    DOMTokenList getSizes();

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    @Deprecated
    @JSProperty
    String getTarget();

    @JSProperty
    void setTarget(String target);

    /**
     * Sets or retrieves the MIME type of the object.
     */
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

    @JSBody(script = "return HTMLLinkElement.prototype")
    static HTMLLinkElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLLinkElement()")
    static HTMLLinkElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
