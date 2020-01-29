package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Contains descriptive metadata about a document. It inherits all of the properties and methods described in the HTMLElement interface. */
public interface HTMLMetaElement extends HTMLElement {
    /**
     * Gets or sets meta-information to associate with httpEquiv or name.
     */
    @JSProperty
    String getContent();

    @JSProperty
    void setContent(String content);

    /**
     * Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header.
     */
    @JSProperty
    String getHttpEquiv();

    @JSProperty
    void setHttpEquiv(String httpEquiv);

    /**
     * Sets or retrieves the value specified in the content attribute of the meta object.
     */
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * Sets or retrieves a scheme to be used in interpreting the value of a property specified for the object.
     */
    @Deprecated
    @JSProperty
    String getScheme();

    @JSProperty
    void setScheme(String scheme);

    @JSBody(script = "return HTMLMetaElement.prototype")
    static HTMLMetaElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLMetaElement()")
    static HTMLMetaElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
