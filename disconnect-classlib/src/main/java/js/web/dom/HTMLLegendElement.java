package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** The HTMLLegendElement is an interface allowing to access properties of the <legend> elements. It inherits properties and methods from the HTMLElement interface. */
public interface HTMLLegendElement extends HTMLElement {
    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JSProperty
    @Nullable
    HTMLFormElement  getForm();

    @JSBody(script = "return HTMLLegendElement.prototype")
    static HTMLLegendElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLLegendElement()")
    static HTMLLegendElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
