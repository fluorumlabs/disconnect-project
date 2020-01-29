package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides special properties and methods (beyond the regular HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of <optgroup> elements.
 */
public interface HTMLOptGroupElement extends HTMLElement {
    @JSBody(script = "return HTMLOptGroupElement.prototype")
    static HTMLOptGroupElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLOptGroupElement()")
    static HTMLOptGroupElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isDisabled();

    @JSProperty
    void setDisabled(boolean disabled);

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JSProperty
    @Nullable
    HTMLFormElement getForm();

    /**
     * Sets or retrieves a value that you can use to implement your own label functionality for the object.
     */
    @JSProperty
    String getLabel();

    @JSProperty
    void setLabel(String label);

}
