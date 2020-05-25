package com.github.fluorumlabs.disconnect.zero.component.html.form;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import com.github.fluorumlabs.disconnect.zero.container.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.zero.container.ComponentList;
import com.github.fluorumlabs.disconnect.zero.internals.TagRegistry;
import js.web.dom.HTMLFieldSetElement;
import js.web.dom.HTMLLegendElement;
import js.web.dom.ValidityState;

import java.util.Optional;

@Tag("fieldset")
public class FieldSet extends HtmlComponent<HTMLFieldSetElement> {

    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    public void setDisabled(boolean disabled) {
        getElement().setDisabled(disabled);
    }

    public ComponentList<Component<?>> getElements() {
        return  new ArrayLikeBackedComponentList<>(getElement().getElements());
    }

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    public Optional<Form> getForm() {
        return Optional.ofNullable(getElement().getForm()).map(TagRegistry::recover);
    }

    public String getName() {
        return getElement().getName();
    }

    public void setName(String name) {
        getElement().setName(name);
    }

    public String getType() {
        return getElement().getType();
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

    @Tag("legend")
    public static class Legend extends HtmlComponent<HTMLLegendElement> {
        /**
         * Retrieves a reference to the form that the object is embedded in.
         */
        public Optional<Form> getForm() {
            return Optional.ofNullable(getElement().getForm()).map(TagRegistry::recover);
        }
    }


}
