package js.web.dom;

import js.web.cssom.LinkStyle;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** A <style> element. It inherits properties and methods from its parent, HTMLElement, and from LinkStyle. */
public interface HTMLStyleElement extends HTMLElement, LinkStyle {
    /**
     * Sets or retrieves the media type.
     */
    @JSProperty
    String getMedia();

    @JSProperty
    void setMedia(String media);

    /**
     * Retrieves the CSS language in which the style sheet is written.
     */
    @Deprecated
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

    @JSBody(script = "return HTMLStyleElement.prototype")
    static HTMLStyleElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLStyleElement()")
    static HTMLStyleElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
