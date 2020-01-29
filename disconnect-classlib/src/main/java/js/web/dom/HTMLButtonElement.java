package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Provides properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <button> elements. */
public interface HTMLButtonElement extends HTMLElement {
    /**
     * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
     */
    @JSProperty
    boolean isAutofocus();

    @JSProperty
    void setAutofocus(boolean autofocus);

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
     * Overrides the action attribute (where the data on a form is sent) on the parent form element.
     */
    @JSProperty
    String getFormAction();

    @JSProperty
    void setFormAction(String formAction);

    /**
     * Used to override the encoding (formEnctype attribute) specified on the form element.
     */
    @JSProperty
    String getFormEnctype();

    @JSProperty
    void setFormEnctype(String formEnctype);

    /**
     * Overrides the submit method attribute previously specified on a form element.
     */
    @JSProperty
    String getFormMethod();

    @JSProperty
    void setFormMethod(String formMethod);

    /**
     * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
     */
    @JSProperty
    boolean isFormNoValidate();

    @JSProperty
    void setFormNoValidate(boolean formNoValidate);

    /**
     * Overrides the target attribute on a form element.
     */
    @JSProperty
    String getFormTarget();

    @JSProperty
    void setFormTarget(String formTarget);

    @JSProperty
    NodeListOf<HTMLLabelElement> getLabels();
    /**
     * Sets or retrieves the name of the object.
     */
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * Gets the classification and default behavior of the button.
     */
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    @JSProperty
    String getValidationMessage();

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     */
    @JSProperty
    ValidityState getValidity();

    /**
     * Sets or retrieves the default or selected value of the control.
     */
    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    @JSProperty
    boolean isWillValidate();

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    boolean checkValidity();
    boolean reportValidity();
    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    void setCustomValidity(String error);

    @JSBody(script = "return HTMLButtonElement.prototype")
    static HTMLButtonElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLButtonElement()")
    static HTMLButtonElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
