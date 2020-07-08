package js.web.dom;

import js.extras.JsEnum;
import js.lang.JsDate;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides special properties and methods for manipulating the options, layout, and presentation of &lt;input&gt; elements.
 */
public interface HTMLInputElement extends HTMLElement {
    @JSBody(script = "return HTMLInputElement.prototype")
    static HTMLInputElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLInputElement()")
    static HTMLInputElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves a comma-separated list of content types.
     */
    @JSProperty
    String getAccept();

    @JSProperty
    void setAccept(String accept);

    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @Deprecated
    @JSProperty
    void setAlign(String align);

    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    @JSProperty
    String getAlt();

    @JSProperty
    void setAlt(String alt);

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
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
     * Sets or retrieves the state of the check box or radio button.
     */
    @JSProperty
    boolean isChecked();

    @JSProperty
    void setChecked(boolean checked);

    /**
     * Sets or retrieves the state of the check box or radio button.
     */
    @JSProperty
    boolean isDefaultChecked();

    @JSProperty
    void setDefaultChecked(boolean defaultChecked);

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
     * Returns a FileList object on a file type input object.
     */
    @JSProperty
    @Nullable
    FileList getFiles();

    @JSProperty
    void setFiles(FileList files);

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

    /**
     * Sets or retrieves the height of the object.
     */
    @JSProperty
    double getHeight();

    @JSProperty
    void setHeight(double height);

    @JSProperty
    boolean isIndeterminate();

    @JSProperty
    void setIndeterminate(boolean indeterminate);

    @JSProperty
    @Nullable
    NodeListOf<HTMLLabelElement> getLabels();

    /**
     * Specifies the ID of a pre-defined datalist of options for an input element.
     */
    @JSProperty
    @Nullable
    HTMLElement getList();

    /**
     * Defines the maximum acceptable value for an input element with type="number".When used with the min and step attributes, lets you control the range and increment (such as only even numbers) that the user can enter into an input field.
     */
    @JSProperty
    String getMax();

    @JSProperty
    void setMax(String max);

    /**
     * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    @JSProperty
    double getMaxLength();

    @JSProperty
    void setMaxLength(double maxLength);

    /**
     * Defines the minimum acceptable value for an input element with type="number". When used with the max and step attributes, lets you control the range and increment (such as even numbers only) that the user can enter into an input field.
     */
    @JSProperty
    String getMin();

    @JSProperty
    void setMin(String min);

    @JSProperty
    double getMinLength();

    @JSProperty
    void setMinLength(double minLength);

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

    /**
     * Gets or sets a string containing a regular expression that the user's input must match.
     */
    @JSProperty
    String getPattern();

    @JSProperty
    void setPattern(String pattern);

    /**
     * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    @JSProperty
    String getPlaceholder();

    @JSProperty
    void setPlaceholder(String placeholder);

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

    @JSProperty
    @Nullable
    String getSelectionDirection();

    @JSProperty
    void setSelectionDirection(String selectionDirection);

    /**
     * Gets or sets the end position or offset of a text selection.
     */
    @JSProperty
    @Nullable
    Unknown getSelectionEnd();

    @JSProperty
    void setSelectionEnd(Unknown selectionEnd);

    /**
     * Gets or sets the starting position or offset of a text selection.
     */
    @JSProperty
    @Nullable
    Unknown getSelectionStart();

    @JSProperty
    void setSelectionStart(Unknown selectionStart);

    @JSProperty
    int getSize();

    @JSProperty
    void setSize(int size);

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    @JSProperty
    String getSrc();

    @JSProperty
    void setSrc(String src);

    /**
     * Defines an increment or jump between values that you want to allow the user to enter. When used with the max and min attributes, lets you control the range and increment (for example, allow only even numbers) that the user can enter into an input field.
     */
    @JSProperty
    String getStep();

    @JSProperty
    void setStep(String step);

    /**
     * Returns the content type of the object.
     */
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

    /**
     * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    @Deprecated
    @JSProperty
    String getUseMap();

    @JSProperty
    void setUseMap(String useMap);

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
     * Returns the value of the data at the cursor's current position.
     */
    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);

    /**
     * Returns a Date object representing the form control's value, if applicable
     * otherwise, returns null. Can be set, to change the value. Throws an "InvalidStateError" DOMException if the control isn't date- or time-based.
     */
    @JSProperty
    @Nullable
    JsDate getValueAsDate();

    @JSProperty
    void setValueAsDate(JsDate valueAsDate);

    /**
     * Returns the input field value as a number.
     */
    @JSProperty
    double getValueAsNumber();

    @JSProperty
    void setValueAsNumber(double valueAsNumber);

    /**
     * Sets or retrieves the width of the object.
     */
    @JSProperty
    double getWidth();

    @JSProperty
    void setWidth(double width);

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
     * Makes the selection equal to the current object.
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
    void setSelectionRange(int start, int end, Direction direction);

    void setSelectionRange(int start, int end);

    /**
     * Decrements a range input control's value by the value given by the Step attribute. If the optional parameter is used, it will decrement the input control's step value multiplied by the parameter's value.
     *
     * @param n Value to decrement the value by.
     */
    void stepDown(double n);

    void stepDown();

    /**
     * Increments a range input control's value by the value given by the Step attribute. If the optional parameter is used, will increment the input control's value by that value.
     *
     * @param n Value to increment the value by.
     */
    void stepUp(double n);

    void stepUp();

    abstract class Direction extends JsEnum {
        public static final Direction FORWARD = JsEnum.of("forward");

        public static final Direction BACKWARD = JsEnum.of("backward");

        public static final Direction NONE = JsEnum.of("none");
    }

}
