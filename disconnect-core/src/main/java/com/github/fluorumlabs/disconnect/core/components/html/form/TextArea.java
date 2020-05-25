package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import js.web.dom.HTMLInputElement;
import js.web.dom.HTMLTextAreaElement;
import js.web.dom.SelectionMode;
import js.web.dom.ValidityState;

import java.util.Optional;


@Tag("textarea")
public class TextArea extends HtmlComponent<HTMLTextAreaElement> {

    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "change");
    }

    public ObservableValue<String> immediateValue() {
        return createObservableValue(this::getValue, this::setValue, "input");
    }

    public String getAutocomplete() {
        return getElement().getAutocomplete();
    }

    public void setAutocomplete(String autocomplete) {
        getElement().setAutocomplete(autocomplete);
    }

    /**
     * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
     */
    public boolean isAutofocus() {
        return getElement().isAutofocus();
    }

    public void setAutofocus(boolean autofocus) {
        getElement().setAutofocus(autofocus);
    }

    /**
     * Sets or retrieves the width of the object.
     */
    public int getCols() {
        return getElement().getCols();
    }

    public void setCols(int cols) {
        getElement().setCols(cols);
    }

    /**
     * Sets or retrieves the initial contents of the object.
     */
    public String getDefaultValue() {
        return getElement().getDefaultValue();
    }

    public void setDefaultValue(String defaultValue) {
        getElement().setDefaultValue(defaultValue);
    }

    public String getDirName() {
        return getElement().getDirName();
    }

    public void setDirName(String dirName) {
        getElement().setDirName(dirName);
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

    public ComponentList<Label> getLabels() {
        return  new ArrayLikeBackedComponentList<>(getElement().getLabels());
    }

    /**
     * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    public int getMaxLength() {
        return getElement().getMaxLength();
    }

    public void setMaxLength(int maxLength) {
        getElement().setMaxLength(maxLength);
    }

    public int getMinLength() {
        return getElement().getMinLength();
    }

    public void setMinLength(int minLength) {
        getElement().setMinLength(minLength);
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
     * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    public String getPlaceholder() {
        return getElement().getPlaceholder();
    }

    public void setPlaceholder(String placeholder) {
        getElement().setPlaceholder(placeholder);
    }

    /**
     * Sets or retrieves the value indicated whether the content of the object is read-only.
     */
    public boolean isReadOnly() {
        return getElement().isReadOnly();
    }

    public void setReadOnly(boolean readOnly) {
        getElement().setReadOnly(readOnly);
    }

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    public boolean isRequired() {
        return getElement().isRequired();
    }

    public void setRequired(boolean required) {
        getElement().setRequired(required);
    }

    /**
     * Sets or retrieves the number of horizontal rows contained in the object.
     */
    public int getRows() {
        return getElement().getRows();
    }

    public void setRows(int rows) {
        getElement().setRows(rows);
    }

    public String getSelectionDirection() {
        return getElement().getSelectionDirection();
    }

    public void setSelectionDirection(String selectionDirection) {
        getElement().setSelectionDirection(selectionDirection);
    }

    /**
     * Gets or sets the end position or offset of a text selection.
     */
    public int getSelectionEnd() {
        return getElement().getSelectionEnd();
    }

    public void setSelectionEnd(int selectionEnd) {
        getElement().setSelectionEnd(selectionEnd);
    }

    /**
     * Gets or sets the starting position or offset of a text selection.
     */
    public int getSelectionStart() {
        return getElement().getSelectionStart();
    }

    public void setSelectionStart(int selectionStart) {
        getElement().setSelectionStart(selectionStart);
    }

    public int getTextLength() {
        return getElement().getTextLength();
    }

    /**
     * Retrieves the type of control.
     */
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
     * Retrieves or sets the text in the entry field of the textArea element.
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
     * Sets or retrieves how to handle wordwrapping in the object.
     */
    public String getWrap() {
        return getElement().getWrap();
    }

    public void setWrap(String wrap) {
        getElement().setWrap(wrap);
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
     * Highlights the input area of a form element.
     */
    public void select() {
        getElement().select();
    }

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     *
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    public void setCustomValidity(String error) {
        getElement().setCustomValidity(error);
    }

    public void setRangeText(String replacement) {
        getElement().setRangeText(replacement);
    }

    public void setRangeText(String replacement, int start, int end, SelectionMode selectionMode) {
        getElement().setRangeText(replacement, start, end, selectionMode);
    }

    public void setRangeText(String replacement, int start, int end) {
        getElement().setRangeText(replacement, start, end);
    }

    /**
     * Sets the start and end positions of a selection in a text field.
     *  @param start     The offset into the text field for the start of the selection.
     * @param end       The offset into the text field for the end of the selection.
     * @param direction The direction in which the selection is performed.
     */
    public void setSelectionRange(int start, int end, HTMLInputElement.Direction direction) {
        getElement().setSelectionRange(start, end, direction);
    }

    public void setSelectionRange(int start, int end) {
        getElement().setSelectionRange(start, end);
    }
}

