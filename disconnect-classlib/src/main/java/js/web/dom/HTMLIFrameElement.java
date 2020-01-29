package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Provides special properties and methods (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements. */
public interface HTMLIFrameElement extends HTMLElement {
    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    @JSProperty
    String getAllow();

    @JSProperty
    void setAllow(String allow);

    @JSProperty
    boolean isAllowFullscreen();

    @JSProperty
    void setAllowFullscreen(boolean allowFullscreen);

    @JSProperty
    boolean isAllowPaymentRequest();

    @JSProperty
    void setAllowPaymentRequest(boolean allowPaymentRequest);

    /**
     * Retrieves the document object of the page or frame.
     */
    @JSProperty
    @Nullable
    Document getContentDocument();

    /**
     * Retrieves the object of the specified.
     */
    @JSProperty
    @Nullable
    WindowProxy getContentWindow();

    /**
     * Sets or retrieves whether to display a border for the frame.
     */
    @Deprecated
    @JSProperty
    String getFrameBorder();

    @JSProperty
    void setFrameBorder(String frameBorder);

    /**
     * Sets or retrieves the height of the object.
     */
    @JSProperty
    String getHeight();

    @JSProperty
    void setHeight(String height);

    /**
     * Sets or retrieves a URI to a long description of the object.
     */
    @Deprecated
    @JSProperty
    String getLongDesc();

    @JSProperty
    void setLongDesc(String longDesc);

    /**
     * Sets or retrieves the top and bottom margin heights before displaying the text in a frame.
     */
    @Deprecated
    @JSProperty
    String getMarginHeight();

    @JSProperty
    void setMarginHeight(String marginHeight);

    /**
     * Sets or retrieves the left and right margin widths before displaying the text in a frame.
     */
    @Deprecated
    @JSProperty
    String getMarginWidth();

    @JSProperty
    void setMarginWidth(String marginWidth);

    /**
     * Sets or retrieves the frame name.
     */
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    @JSProperty
    ReferrerPolicy getReferrerPolicy();

    @JSProperty
    void setReferrerPolicy(ReferrerPolicy referrerPolicy);

    @JSProperty
    DOMTokenList getSandbox();

    /**
     * Sets or retrieves whether the frame can be scrolled.
     */
    @Deprecated
    @JSProperty
    String getScrolling();

    @JSProperty
    void setScrolling(String scrolling);

    /**
     * Sets or retrieves a URL to be loaded by the object.
     */
    @JSProperty
    String getSrc();

    @JSProperty
    void setSrc(String src);

    /**
     * Sets or retrives the content of the page that is to contain.
     */
    @JSProperty
    String getSrcdoc();

    @JSProperty
    void setSrcdoc(String srcdoc);

    /**
     * Sets or retrieves the width of the object.
     */
    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

    @Nullable
    Document getSVGDocument();

    @JSBody(script = "return HTMLIFrameElement.prototype")
    static HTMLIFrameElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLIFrameElement()")
    static HTMLIFrameElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
