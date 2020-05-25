package com.github.fluorumlabs.disconnect.zero.component.html.form;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import com.github.fluorumlabs.disconnect.zero.container.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.zero.container.ComponentList;
import com.github.fluorumlabs.disconnect.zero.internals.TagRegistry;
import js.web.dom.Element;
import js.web.dom.HTMLOptGroupElement;
import js.web.dom.HTMLSelectElement;
import js.web.dom.ValidityState;

import java.util.Optional;

@Tag("select")
public class Select extends HtmlComponent<HTMLSelectElement> {

    /**
     * Gets autocomplete.
     *
     * @return the autocomplete
     */
    public String getAutocomplete() {
        return getElement().getAutocomplete();
    }

    /**
     * Sets autocomplete.
     *
     * @param autocomplete the autocomplete
     */
    public void setAutocomplete(String autocomplete) {
        getElement().setAutocomplete(autocomplete);
    }

    /**
     * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and
     * convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true
     * when present on an element, and false when missing.
     *
     * @return the boolean
     */
    public boolean isAutofocus() {
        return getElement().isAutofocus();
    }

    /**
     * Sets autofocus.
     *
     * @param autofocus the autofocus
     */
    public void setAutofocus(boolean autofocus) {
        getElement().setAutofocus(autofocus);
    }

    /**
     * Is disabled boolean.
     *
     * @return the boolean
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    /**
     * Sets disabled.
     *
     * @param disabled the disabled
     */
    public void setDisabled(boolean disabled) {
        getElement().setDisabled(disabled);
    }

    /**
     * Retrieves a reference to the form that the object is embedded in.
     *
     * @return the form
     */
    public Optional<Form> getForm() {
        return Optional.ofNullable(getElement().getForm()).map(TagRegistry::recover);
    }

    /**
     * Gets labels.
     *
     * @return the labels
     */
    public ComponentList<Label> getLabels() {
        return  new ArrayLikeBackedComponentList<>(getElement().getLabels());
    }

    /**
     * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     *
     * @return the boolean
     */
    public boolean isMultiple() {
        return getElement().isMultiple();
    }

    /**
     * Sets multiple.
     *
     * @param multiple the multiple
     */
    public void setMultiple(boolean multiple) {
        getElement().setMultiple(multiple);
    }

    /**
     * Sets or retrieves the name of the object.
     *
     * @return the name
     */
    public String getName() {
        return getElement().getName();
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        getElement().setName(name);
    }

    /**
     * When present, marks an element that can't be submitted without a value.
     *
     * @return the boolean
     */
    public boolean isRequired() {
        return getElement().isRequired();
    }

    /**
     * Sets required.
     *
     * @param required the required
     */
    public void setRequired(boolean required) {
        getElement().setRequired(required);
    }

    /**
     * Sets or retrieves the index of the selected option in a select object.
     *
     * @return the selected index
     */
    public int getSelectedIndex() {
        return getElement().getSelectedIndex();
    }

    /**
     * Sets selected index.
     *
     * @param selectedIndex the selected index
     */
    public void setSelectedIndex(int selectedIndex) {
        getElement().setSelectedIndex(selectedIndex);
    }

    /**
     * Gets selected options.
     *
     * @return the selected options
     */
    public ComponentList<Option> getSelectedOptions() {
        return  new ArrayLikeBackedComponentList<>(getElement().getSelectedOptions());
    }

    /**
     * Sets or retrieves the number of rows in the list box.
     *
     * @return the size
     */
    public int getSize() {
        return getElement().getSize();
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(int size) {
        getElement().setSize(size);
    }

    /**
     * Retrieves the type of select control based on the value of the MULTIPLE attribute.
     *
     * @return the type
     */
    public String getType() {
        return getElement().getType();
    }

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error
     * message. It also triggers the standard error message, such as "this is a required field". The result is that
     * the user sees validation messages without actually submitting.
     *
     * @return the validation message
     */
    public String getValidationMessage() {
        return getElement().getValidationMessage();
    }

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     *
     * @return the validity
     */
    public ValidityState getValidity() {
        return getElement().getValidity();
    }

    /**
     * Sets or retrieves the value which is returned to the server when the form control is submitted.
     *
     * @return the value
     */
    public String getValue() {
        return getElement().getValue();
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     *
     * @return the boolean
     */
    public boolean isWillValidate() {
        return getElement().isWillValidate();
    }

    /**
     * Adds an element to the areas, controlRange, or options collection.
     *  @param element Variant of type Number that specifies the index position in the collection where the element is
     *                placed. If no value is given, the method places the element at the end of the collection.
     * @param before  Variant of type Object that specifies an element to insert before, or null to append the object
     */
    public void add(Option element, HtmlComponent<? extends Element> before) {
        getElement().add(element.getElement(), before.getElement());
    }

    /**
     * Add.
     *  @param element the element
     * @param before  the before
     */
    public void add(Option element, int before) {
        getElement().add(element.getElement(), before);
    }

    /**
     * Add.
     *
     * @param element the element
     */
    public void add(Option element) {
        getElement().add(element.getElement());
    }

    /**
     * Add.
     *  @param element the element
     * @param before  the before
     */
    public void add(OptionGroup element, HtmlComponent<?> before) {
        getElement().add(element.getElement(), before.getElement());
    }

    /**
     * Add.
     *  @param element the element
     * @param before  the before
     */
    public void add(OptionGroup element, int before) {
        getElement().add(element.getElement(), before);
    }

    /**
     * Add.
     *
     * @param element the element
     */
    public void add(OptionGroup element) {
        getElement().add(element.getElement());
    }

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     *
     * @return the boolean
     */
    public boolean checkValidity() {
        return getElement().checkValidity();
    }

    /**
     * Retrieves a select object or an object from an options collection.
     *
     * @param index Variant of type Number that specifies the zero-based index of the object to retrieve when a
     *              collection is returned.
     *
     * @return the element
     */
    public HtmlComponent<?> get(int index) {
        return TagRegistry.recover(getElement().item(index));
    }

    /**
     * Retrieves a select object or an object from an options collection.
     *
     * @param name A String that specifies the name or id property of the object to retrieve. A collection is
     *             returned           if more than one match is made.
     *
     * @return the html option element
     */
    public Optional<OptionGroup> namedItem(String name) {
        return Optional.ofNullable(getElement().namedItem(name)).map(TagRegistry::recover);
    }

    /**
     * Remove.
     *
     * @param index the index
     */
    public HtmlComponent<?> remove(int index) {
        HtmlComponent<?> component = get(index);
        getElement().remove(index);
        return component;
    }

    /**
     * Report validity boolean.
     *
     * @return the boolean
     */
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

    /**
     * Set.
     *  @param name  the name
     * @param value the value
     */
    public void set(int name, HtmlComponent<?> value) {
        getElement().set(name, value.getElement());
    }

    @Tag("optgroup")
    public static class OptionGroup extends HtmlComponent<HTMLOptGroupElement> {
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
         * Sets or retrieves a value that you can use to implement your own label functionality for the object.
         */
        public String getLabel() {
            return getElement().getLabel();
        }

        public void setLabel(String label) {
            getElement().setLabel(label);
        }
    }

}
