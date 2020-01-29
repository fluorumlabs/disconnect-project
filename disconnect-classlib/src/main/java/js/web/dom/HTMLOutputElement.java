package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements.
 */
public interface HTMLOutputElement extends HTMLElement {
    @JSBody(script = "return HTMLOutputElement.prototype")
    static HTMLOutputElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLOutputElement()")
    static HTMLOutputElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getDefaultValue();

    @JSProperty
    void setDefaultValue(String defaultValue);

    @JSProperty
    @Nullable
    HTMLFormElement getForm();

    @JSProperty
    DOMTokenList getHtmlFor();

    @JSProperty
    NodeListOf<HTMLLabelElement> getLabels();

    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    @JSProperty
    String getType();

    @JSProperty
    String getValidationMessage();

    @JSProperty
    ValidityState getValidity();

    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);

    @JSProperty
    boolean isWillValidate();

    boolean checkValidity();

    boolean reportValidity();

    void setCustomValidity(String error);

}
