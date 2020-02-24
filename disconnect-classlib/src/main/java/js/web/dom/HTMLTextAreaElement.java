package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides special properties and methods for manipulating the layout and presentation of &lt;textarea&gt; elements.
 */
public interface HTMLTextAreaElement extends HTMLElement {
    @JSBody(script = "return HTMLTextAreaElement.prototype")
    static HTMLTextAreaElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTextAreaElement()")
    static HTMLTextAreaElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

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

    /**
     * Sets or retrieves the width of the object.
     */
    @JSProperty
    int getCols();

    @JSProperty
    void setCols(int cols);

    /**
     * Sets or retrieves the initial contents of the object.
     */
    @JSProperty
    String getDefaultValue();

    @JSProperty
    void setDefaultValue(String defaultValue);

    @JSProperty
    String getDirName();

    @JSProperty
    void setDirName(String dirName);

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

    @JSProperty
    NodeListOf<HTMLLabelElement> getLabels();

    /**
     * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    @JSProperty
    int getMaxLength();

    @JSProperty
    void setMaxLength(int maxLength);

    @JSProperty
    int getMinLength();

    @JSProperty
    void setMinLength(int minLength);

    /**
     * Sets or retrieves the name of the object.
     */
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    @JSProperty
    String getPlaceholder();

    @JSProperty
    void setPlaceholder(String placeholder);

    /**
     * Sets or retrieves the value indicated whether the content of the object is read-only.
     */
    @JSProperty
    boolean isReadOnly();

    @JSProperty
    void setReadOnly(boolean readOnly);

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    @JSProperty
    boolean isRequired();

    @JSProperty
    void setRequired(boolean required);

    /**
     * Sets or retrieves the number of horizontal rows contained in the object.
     */
    @JSProperty
    int getRows();

    @JSProperty
    void setRows(int rows);

    @JSProperty
    String getSelectionDirection();

    @JSProperty
    void setSelectionDirection(String selectionDirection);

    /**
     * Gets or sets the end position or offset of a text selection.
     */
    @JSProperty
    int getSelectionEnd();

    @JSProperty
    void setSelectionEnd(int selectionEnd);

    /**
     * Gets or sets the starting position or offset of a text selection.
     */
    @JSProperty
    int getSelectionStart();

    @JSProperty
    void setSelectionStart(int selectionStart);

    @JSProperty
    int getTextLength();

    /**
     * Retrieves the type of control.
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
     * Retrieves or sets the text in the entry field of the textArea element.
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
     * Sets or retrieves how to handle wordwrapping in the object.
     */
    @JSProperty
    String getWrap();

    @JSProperty
    void setWrap(String wrap);

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    boolean checkValidity();

    boolean reportValidity();

    /**
     * Highlights the input area of a form element.
     */
    void select();

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     *
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    void setCustomValidity(String error);

    void setRangeText(String replacement);

    void setRangeText(String replacement, int start, int end, SelectionMode selectionMode);

    void setRangeText(String replacement, int start, int end);

    /**
     * Sets the start and end positions of a selection in a text field.
     *
     * @param start     The offset into the text field for the start of the selection.
     * @param end       The offset into the text field for the end of the selection.
     * @param direction The direction in which the selection is performed.
     */
    void setSelectionRange(int start, int end, HTMLInputElement.Direction direction);

    void setSelectionRange(int start, int end);

}
