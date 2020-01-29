package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <fieldset> elements. */
public interface HTMLFieldSetElement extends HTMLElement {
    @JSProperty
    boolean isDisabled();

    @JSProperty
    void setDisabled(boolean disabled);

    @JSProperty
    HTMLCollection getElements();

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JSProperty
    @Nullable
    HTMLFormElement getForm();

    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    @JSProperty
    String getType();

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

   @JSBody(script = "return HTMLFieldSetElement.prototype")
   static HTMLFieldSetElement prototype() {
       throw new UnsupportedOperationException("Available only in JavaScript");
   }

   @JSBody(script = "return new HTMLFieldSetElement()")
   static HTMLFieldSetElement create() {
       throw new UnsupportedOperationException("Available only in JavaScript");
   }

}
