package js.web.dom;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** A <select> HTML Element. These elements also share all of the properties and methods of other HTML elements via the HTMLElement interface. */
public interface HTMLSelectElement extends ArrayLike<Element>, HTMLElement {
    @JSProperty
     String getAutocomplete();

    @JSProperty
     void setAutocomplete(String autocomplete);

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
     HTMLFormElement  getForm();

    @JSProperty
     NodeListOf<HTMLLabelElement> getLabels();
    /**
     * Sets or retrieves the number of objects in a collection.
     */
    @JSProperty
     void setLength(int length);

    /**
     * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     */
    @JSProperty
     boolean isMultiple();

    @JSProperty
     void setMultiple(boolean multiple);

    /**
     * Sets or retrieves the name of the object.
     */
    @JSProperty
     String getName();

    @JSProperty
     void setName(String name);

    @JSProperty
     HTMLOptionsCollection getOptions();

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    @JSProperty
     boolean isRequired();

    @JSProperty
     void setRequired(boolean required);

    /**
     * Sets or retrieves the index of the selected option in a select object.
     */
    @JSProperty
     int getSelectedIndex();

    @JSProperty
     void setSelectedIndex(int selectedIndex);

    @JSProperty
     HTMLCollectionOf<HTMLOptionElement> getSelectedOptions();
    /**
     * Sets or retrieves the number of rows in the list box.
     */
    @JSProperty
     int getSize();

    @JSProperty
     void setSize(int size);

    /**
     * Retrieves the type of select control based on the value of the MULTIPLE attribute.
     */
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
     * Sets or retrieves the value which is returned to the server when the form control is submitted.
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
     * Adds an element to the areas, controlRange, or options collection.
     * @param element Variant of type Number that specifies the index position in the collection where the element is placed. If no value is given, the method places the element at the end of the collection.
     * @param before Variant of type Object that specifies an element to insert before, or null to append the object to the collection.
     */
     void add(HTMLOptionElement element, HTMLElement before);
     void add(HTMLOptionElement element, int before);
     void add(HTMLOptionElement element);
     void add(HTMLOptGroupElement element, HTMLElement before);
     void add(HTMLOptGroupElement element, int before);
     void add(HTMLOptGroupElement element);
    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
     boolean checkValidity();
    /**
     * Retrieves a select object or an object from an options collection.
     * @param name Variant of type Number or String that specifies the object or collection to retrieve. If this parameter is an integer, it is the zero-based index of the object. If this parameter is a string, all objects with matching name or id properties are retrieved, and a collection is returned if more than one match is made.
     * @param index Variant of type Number that specifies the zero-based index of the object to retrieve when a collection is returned.
     */
    @Nullable
     Element item(int index);
    /**
     * Retrieves a select object or an object from an options collection.
     * @param namedItem A String that specifies the name or id property of the object to retrieve. A collection is returned if more than one match is made.
     */
    @Nullable
     HTMLOptionElement namedItem(String name);
    /**
     * Removes an element from the collection.
     * @param index Number that specifies the zero-based index of the element to remove from the collection.
     */
     void remove();
     void remove(int index);
     boolean reportValidity();
    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
     void setCustomValidity(String error);

    @JSIndexer
     void set(int name, Element value);

    @JSBody(script = "return HTMLSelectElement.prototype")
    static HTMLSelectElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLSelectElement()")
    static HTMLSelectElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
