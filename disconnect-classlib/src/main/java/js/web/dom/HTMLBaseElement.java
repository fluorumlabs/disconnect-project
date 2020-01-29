package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Contains the base URI for a document. This object inherits all of the properties and methods as described in the HTMLElement interface. */
public interface HTMLBaseElement extends HTMLElement {
    /**
     * Gets or sets the baseline URL on which relative links are based.
     */
    @JSProperty
    String getHref();

    @JSProperty
    void setHref(String href);

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    @JSProperty
    String getTarget();

    @JSProperty
    void setTarget(String target);

    @JSBody(script = "return HTMLBaseElement.prototype")
    static HTMLBaseElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLBaseElement()")
    static HTMLBaseElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
