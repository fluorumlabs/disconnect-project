package js.web.dom;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A &lt;select&gt; HTML Element. These elements also share all of the properties and methods of other HTML elements via
 * the HTMLElement interface.
 */
public interface HTMLSelectElement extends ArrayLike<Element>, HTMLElement {
    /**
     * Prototype html select element.
     *
     * @return the html select element
     */
    @JSBody(script = "return HTMLSelectElement.prototype")
    static HTMLSelectElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Create html select element.
     *
     * @return the html select element
     */
    @JSBody(script = "return new HTMLSelectElement()")
    static HTMLSelectElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Gets autocomplete.
     *
     * @return the autocomplete
     */
    @JSProperty
    String getAutocomplete();

    /**
     * Sets autocomplete.
     *
     * @param autocomplete the autocomplete
     */
    @JSProperty
    void setAutocomplete(String autocomplete);

    /**
     * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and
     * convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true
     * when present on an element, and false when missing.
     *
     * @return the boolean
     */
    @JSProperty
    boolean isAutofocus();

    /**
     * Sets autofocus.
     *
     * @param autofocus the autofocus
     */
    @JSProperty
    void setAutofocus(boolean autofocus);

    /**
     * Is disabled boolean.
     *
     * @return the boolean
     */
    @JSProperty
    boolean isDisabled();

    /**
     * Sets disabled.
     *
     * @param disabled the disabled
     */
    @JSProperty
    void setDisabled(boolean disabled);

    /**
     * Retrieves a reference to the form that the object is embedded in.
     *
     * @return the form
     */
    @JSProperty
    @Nullable
    HTMLFormElement getForm();

    /**
     * Gets labels.
     *
     * @return the labels
     */
    @JSProperty
    NodeListOf<HTMLLabelElement> getLabels();

    /**
     * Sets or retrieves the number of objects in a collection.
     *
     * @param length the length
     */
    @JSProperty
    void setLength(int length);

    /**
     * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     *
     * @return the boolean
     */
    @JSProperty
    boolean isMultiple();

    /**
     * Sets multiple.
     *
     * @param multiple the multiple
     */
    @JSProperty
    void setMultiple(boolean multiple);

    /**
     * Sets or retrieves the name of the object.
     *
     * @return the name
     */
    @JSProperty
    String getName();

    /**
     * Sets name.
     *
     * @param name the name
     */
    @JSProperty
    void setName(String name);

    /**
     * Gets options.
     *
     * @return the options
     */
    @JSProperty
    HTMLOptionsCollection getOptions();

    /**
     * When present, marks an element that can't be submitted without a value.
     *
     * @return the boolean
     */
    @JSProperty
    boolean isRequired();

    /**
     * Sets required.
     *
     * @param required the required
     */
    @JSProperty
    void setRequired(boolean required);

    /**
     * Sets or retrieves the index of the selected option in a select object.
     *
     * @return the selected index
     */
    @JSProperty
    int getSelectedIndex();

    /**
     * Sets selected index.
     *
     * @param selectedIndex the selected index
     */
    @JSProperty
    void setSelectedIndex(int selectedIndex);

    /**
     * Gets selected options.
     *
     * @return the selected options
     */
    @JSProperty
    HTMLCollectionOf<HTMLOptionElement> getSelectedOptions();

    /**
     * Sets or retrieves the number of rows in the list box.
     *
     * @return the size
     */
    @JSProperty
    int getSize();

    /**
     * Sets size.
     *
     * @param size the size
     */
    @JSProperty
    void setSize(int size);

    /**
     * Retrieves the type of select control based on the value of the MULTIPLE attribute.
     *
     * @return the type
     */
    @JSProperty
    String getType();

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error
     * message. It also triggers the standard error message, such as "this is a required field". The result is that
     * the user sees validation messages without actually submitting.
     *
     * @return the validation message
     */
    @JSProperty
    String getValidationMessage();

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     *
     * @return the validity
     */
    @JSProperty
    ValidityState getValidity();

    /**
     * Sets or retrieves the value which is returned to the server when the form control is submitted.
     *
     * @return the value
     */
    @JSProperty
    String getValue();

    /**
     * Sets value.
     *
     * @param value the value
     */
    @JSProperty
    void setValue(String value);

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     *
     * @return the boolean
     */
    @JSProperty
    boolean isWillValidate();

    /**
     * Adds an element to the areas, controlRange, or options collection.
     *
     * @param element Variant of type Number that specifies the index position in the collection where the element is
     *                placed. If no value is given, the method places the element at the end of the collection.
     * @param before  Variant of type Object that specifies an element to insert before, or null to append the object
     *                to the collection.
     */
    void add(HTMLOptionElement element, HTMLElement before);

    /**
     * Add.
     *
     * @param element the element
     * @param before  the before
     */
    void add(HTMLOptionElement element, int before);

    /**
     * Add.
     *
     * @param element the element
     */
    void add(HTMLOptionElement element);

    /**
     * Add.
     *
     * @param element the element
     * @param before  the before
     */
    void add(HTMLOptGroupElement element, HTMLElement before);

    /**
     * Add.
     *
     * @param element the element
     * @param before  the before
     */
    void add(HTMLOptGroupElement element, int before);

    /**
     * Add.
     *
     * @param element the element
     */
    void add(HTMLOptGroupElement element);

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     *
     * @return the boolean
     */
    boolean checkValidity();

    /**
     * Retrieves a select object or an object from an options collection.
     *
     * @param index Variant of type Number that specifies the zero-based index of the object to retrieve when a
     *              collection is returned.
     *
     * @return the element
     */
    @Nullable
    Element item(int index);

    /**
     * Retrieves a select object or an object from an options collection.
     *
     * @param name A String that specifies the name or id property of the object to retrieve. A collection is
     *             returned           if more than one match is made.
     *
     * @return the html option element
     */
    @Nullable
    HTMLOptionElement namedItem(String name);

    /**
     * Removes an element from the collection.
     *
     */
    void remove();

    /**
     * Remove.
     *
     * @param index the index
     */
    void remove(int index);

    /**
     * Report validity boolean.
     *
     * @return the boolean
     */
    boolean reportValidity();

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     *
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    void setCustomValidity(String error);

    /**
     * Set.
     *
     * @param name  the name
     * @param value the value
     */
    @JSIndexer
    void set(int name, Element value);

}
