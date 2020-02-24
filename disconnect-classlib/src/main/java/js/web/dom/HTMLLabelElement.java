package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Gives access to properties specific to &lt;label&gt; elements. It inherits methods and properties from the base HTMLElement interface.
 */
public interface HTMLLabelElement extends HTMLElement {
    @JSBody(script = "return HTMLLabelElement.prototype")
    static HTMLLabelElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLLabelElement()")
    static HTMLLabelElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    HTMLElement getControl();

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JSProperty
    @Nullable
    HTMLFormElement getForm();

    /**
     * Sets or retrieves the object to which the given label object is assigned.
     */
    @JSProperty
    String getHtmlFor();

    @JSProperty
    void setHtmlFor(String htmlFor);

}
