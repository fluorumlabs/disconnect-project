package com.github.fluorumlabs.disconnect.zero.component.html.form;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import com.github.fluorumlabs.disconnect.zero.container.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.zero.container.ComponentList;
import com.github.fluorumlabs.disconnect.zero.internals.TagRegistry;
import js.web.dom.HTMLButtonElement;
import js.web.dom.ValidityState;

import java.util.Optional;

@Tag("button")
public class Button extends HtmlComponent<HTMLButtonElement> {
    /**
     * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
     */
    public boolean isAutofocus() {
        return getElement().isAutofocus();
    }

    public void setAutofocus(boolean autofocus) {
        getElement().setAutofocus(autofocus);
    }

    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    public void setDisabled(boolean disabled) {
        getElement().setDisabled(disabled);
    }

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    public Optional<Form> getForm() {
        return Optional.ofNullable(getElement().getForm()).map(TagRegistry::recover);
    }

    /**
     * Overrides the action attribute (where the data on a form is sent) on the parent form element.
     */
    public String getFormAction() {
        return getElement().getFormAction();
    }

    public void setFormAction(String formAction) {
        getElement().setFormAction(formAction);
    }

    /**
     * Used to override the encoding (formEnctype attribute) specified on the form element.
     */
    public String getFormEnctype() {
        return getElement().getFormEnctype();
    }

    public void setFormEnctype(String formEnctype) {
        getElement().setFormEnctype(formEnctype);
    }

    /**
     * Overrides the submit method attribute previously specified on a form element.
     */
    public String getFormMethod() {
        return getElement().getFormMethod();
    }

    public void setFormMethod(String formMethod) {
        getElement().setFormMethod(formMethod);
    }

    /**
     * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
     */
    public boolean isFormNoValidate() {
        return getElement().isFormNoValidate();
    }

    public void setFormNoValidate(boolean formNoValidate) {
        getElement().setFormNoValidate(formNoValidate);
    }

    /**
     * Overrides the target attribute on a form element.
     */
    public String getFormTarget() {
        return getElement().getFormTarget();
    }

    public void setFormTarget(String formTarget) {
        getElement().setFormTarget(formTarget);
    }

    public ComponentList<Label> getLabels() {
        return  new ArrayLikeBackedComponentList<>(getElement().getLabels());
    }

    /**
     * Sets or retrieves the name of the object.
     */
    public String getName() {
        return getElement().getName();
    }

    public void setName(String name) {
        getElement().setName(name);
    }

    /**
     * Gets the classification and default behavior of the button.
     */
    public String getType() {
        return getElement().getType();
    }

    public void setType(String type) {
        getElement().setType(type);
    }

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    public String getValidationMessage() {
        return getElement().getValidationMessage();
    }

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     */
    public ValidityState getValidity() {
        return getElement().getValidity();
    }

    /**
     * Sets or retrieves the default or selected value of the control.
     */
    public String getValue() {
        return getElement().getValue();
    }

    public void setValue(String value) {
        getElement().setValue(value);
    }

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    public boolean isWillValidate() {
        return getElement().isWillValidate();
    }

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public boolean checkValidity() {
        return getElement().checkValidity();
    }

    public boolean reportValidity() {
        return getElement().reportValidity();
    }

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     *
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    public void setCustomValidity(String error) {
        getElement().setCustomValidity(error);
    }
}
