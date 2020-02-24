package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating &lt;embed&gt; elements.
 */
public interface HTMLEmbedElement extends HTMLElement {
    @JSBody(script = "return HTMLEmbedElement.prototype")
    static HTMLEmbedElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLEmbedElement()")
    static HTMLEmbedElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    /**
     * Sets or retrieves the height of the object.
     */
    @JSProperty
    String getHeight();

    @JSProperty
    void setHeight(String height);

    /**
     * Sets or retrieves the name of the object.
     */
    @Deprecated
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * Sets or retrieves a URL to be loaded by the object.
     */
    @JSProperty
    String getSrc();

    @JSProperty
    void setSrc(String src);

    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

    /**
     * Sets or retrieves the width of the object.
     */
    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

    @Nullable
    Document getSVGDocument();

}
