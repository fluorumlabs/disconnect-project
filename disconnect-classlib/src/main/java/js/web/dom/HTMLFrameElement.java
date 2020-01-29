package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface HTMLFrameElement extends HTMLElement {
    @JSBody(script = "return HTMLFrameElement.prototype")
    static HTMLFrameElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLFrameElement()")
    static HTMLFrameElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Retrieves the document object of the page or frame.
     */
    @Deprecated
    @JSProperty
    @Nullable
    Document getContentDocument();

    /**
     * Retrieves the object of the specified.
     */
    @Deprecated
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
    @Deprecated
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * Sets or retrieves whether the user can resize the frame.
     */
    @Deprecated
    @JSProperty
    boolean isNoResize();

    @JSProperty
    void setNoResize(boolean noResize);

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
    @Deprecated
    @JSProperty
    String getSrc();

    @JSProperty
    void setSrc(String src);

}
