package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import js.lang.JsDate;
import js.lang.Unknown;
import js.web.dom.*;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Tag("input")
public class Input extends HtmlComponent<HTMLInputElement> {
    protected Input() {}

    protected Input(Component<?>... components) {
        super(components);
    }

    /**
     * Sets or retrieves a comma-separated list of content types.
     */
    protected String getAccept() {
        return getElement().getAccept();
    }

    protected void setAccept(String accept) {
        getElement().setAccept(accept);
    }

    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    protected String getAlt() {
        return getElement().getAlt();
    }

    protected void setAlt(String alt) {
        getElement().setAlt(alt);
    }

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
    protected HtmlComponent.Autocomplete getAutocomplete() {
        return LowerCase.parse(Autocomplete.class, getElement().getAutocomplete());
    }

    protected void setAutocomplete(HtmlComponent.Autocomplete autocomplete) {
        getElement().setAutocomplete(LowerCase.of(autocomplete));
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
     * Sets or retrieves the state of the check box or radio button.
     */
    protected boolean isChecked() {
        return getElement().isChecked();
    }

    protected void setChecked(boolean checked) {
        getElement().setChecked(checked);
    }

    /**
     * Sets or retrieves the state of the check box or radio button.
     */
    protected boolean isDefaultChecked() {
        return getElement().isDefaultChecked();
    }

    protected void setDefaultChecked(boolean defaultChecked) {
        getElement().setDefaultChecked(defaultChecked);
    }

    /**
     * Sets or retrieves the initial contents of the object.
     */
    protected String getDefaultValue() {
        return getElement().getDefaultValue();
    }

    protected void setDefaultValue(String defaultValue) {
        getElement().setDefaultValue(defaultValue);
    }

    protected String getDirName() {
        return getElement().getDirName();
    }

    protected void setDirName(String dirName) {
        getElement().setDirName(dirName);
    }

    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    public void setDisabled(boolean disabled) {
        getElement().setDisabled(disabled);
    }

    /**
     * Returns a FileList object on a file type input object.
     */
    protected Stream<File> getFiles() {
        return Optional.ofNullable(getElement().getFiles())
                .map(f -> StreamSupport.stream(f.iterable().spliterator(), false))
                .orElse(Stream.empty());
    }

    protected void setFiles(@Nullable FileList files) {
        getElement().setFiles(files);
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
    protected String getFormAction() {
        return getElement().getFormAction();
    }

    protected void setFormAction(String formAction) {
        getElement().setFormAction(formAction);
    }

    /**
     * Used to override the encoding (formEnctype attribute) specified on the form element.
     */
    protected String getFormEnctype() {
        return getElement().getFormEnctype();
    }

    protected void setFormEnctype(String formEnctype) {
        getElement().setFormEnctype(formEnctype);
    }

    /**
     * Overrides the submit method attribute previously specified on a form element.
     */
    protected String getFormMethod() {
        return getElement().getFormMethod();
    }

    protected void setFormMethod(String formMethod) {
        getElement().setFormMethod(formMethod);
    }

    /**
     * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
     */
    protected boolean isFormNoValidate() {
        return getElement().isFormNoValidate();
    }

    protected void setFormNoValidate(boolean formNoValidate) {
        getElement().setFormNoValidate(formNoValidate);
    }

    /**
     * Overrides the target attribute on a form element.
     */
    protected String getFormTarget() {
        return getElement().getFormTarget();
    }

    protected void setFormTarget(String formTarget) {
        getElement().setFormTarget(formTarget);
    }

    /**
     * Sets or retrieves the height of the object.
     */
    protected double getHeight() {
        return getElement().getHeight();
    }

    protected void setHeight(double height) {
        getElement().setHeight(height);
    }

    protected boolean isIndeterminate() {
        return getElement().isIndeterminate();
    }

    protected void setIndeterminate(boolean indeterminate) {
        getElement().setIndeterminate(indeterminate);
    }

    public ComponentList<Label> getLabels() {
        return  new ArrayLikeBackedComponentList<>(getElement().getLabels());
    }

    /**
     * Specifies the ID of a pre-defined datalist of options for an input element.
     */
    protected Optional<DataList> getList() {
        return Optional.ofNullable(getElement().getList()).map(TagRegistry::recover);
    }

    protected String getListId() {
        return getElement().getAttribute("list");
    }

    protected void setListId(String id) {
        getElement().setAttribute("list", id);
    }
    /**
     * Defines the maximum acceptable value for an input element with type="number".When used with the min and step attributes, lets you control the range and increment (such as only even numbers) that the user can enter into an input field.
     */
    protected String getMax() {
        return getElement().getMax();
    }

    protected void setMax(String max) {
        getElement().setMax(max);
    }

    /**
     * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    protected double getMaxLength() {
        return getElement().getMaxLength();
    }

    protected void setMaxLength(double maxLength) {
        getElement().setMaxLength(maxLength);
    }

    /**
     * Defines the minimum acceptable value for an input element with type="number". When used with the max and step attributes, lets you control the range and increment (such as even numbers only) that the user can enter into an input field.
     */
    protected String getMin() {
        return getElement().getMin();
    }

    protected void setMin(String min) {
        getElement().setMin(min);
    }

    protected double getMinLength() {
        return getElement().getMinLength();
    }

    protected void setMinLength(double minLength) {
        getElement().setMinLength(minLength);
    }

    /**
     * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     */
    protected boolean isMultiple() {
        return getElement().isMultiple();
    }

    protected void setMultiple(boolean multiple) {
        getElement().setMultiple(multiple);
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
     * Gets or sets a string containing a regular expression that the user's input must match.
     */
    protected String getPattern() {
        return getElement().getPattern();
    }

    protected void setPattern(String pattern) {
        getElement().setPattern(pattern);
    }

    /**
     * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    protected String getPlaceholder() {
        return getElement().getPlaceholder();
    }

    protected void setPlaceholder(String placeholder) {
        getElement().setPlaceholder(placeholder);
    }

    protected boolean isReadOnly() {
        return getElement().isReadOnly();
    }

    protected void setReadOnly(boolean readOnly) {
        getElement().setReadOnly(readOnly);
    }

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    protected boolean isRequired() {
        return getElement().isRequired();
    }

    protected void setRequired(boolean required) {
        getElement().setRequired(required);
    }

    protected Optional<String> getSelectionDirection() {
        return Optional.ofNullable(getElement().getSelectionDirection());
    }

    protected void setSelectionDirection(@Nullable String selectionDirection) {
        getElement().setSelectionDirection(selectionDirection);
    }

    /**
     * Gets or sets the end position or offset of a text selection.
     */
    protected Optional<Integer> getSelectionEnd() {
        return Optional.ofNullable(getElement().getSelectionEnd()).map(Unknown::intValue);
    }

    protected void setSelectionEnd(@Nullable Integer selectionEnd) {
        getElement().setSelectionEnd(selectionEnd == null?null:Unknown.of(selectionEnd));
    }

    /**
     * Gets or sets the starting position or offset of a text selection.
     */
    protected Optional<Integer> getSelectionStart() {
        return Optional.ofNullable(getElement().getSelectionStart()).map(Unknown::intValue);
    }

    protected void setSelectionStart(@Nullable Integer selectionStart) {
        getElement().setSelectionStart(selectionStart == null?null:Unknown.of(selectionStart));
    }

    protected int getSize() {
        return getElement().getSize();
    }

    protected void setSize(int size) {
        getElement().setSize(size);
    }

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    protected String getSrc() {
        return getElement().getSrc();
    }

    protected void setSrc(String src) {
        getElement().setSrc(src);
    }

    /**
     * Defines an increment or jump between values that you want to allow the user to enter. When used with the max and min attributes, lets you control the range and increment (for example, allow only even numbers) that the user can enter into an input field.
     */
    protected String getStep() {
        return getElement().getStep();
    }

    protected void setStep(String step) {
        getElement().setStep(step);
    }

    /**
     * Returns the content type of the object.
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
     * Returns the value of the data at the cursor's current position.
     */
    public String getValue() {
        return getElement().getValue();
    }

    public void setValue(String value) {
        getElement().setValue(value);
    }

    /**
     * Returns a Date object representing the form control's value, if applicable
     * otherwise, returns null. Can be set, to change the value. Throws an "InvalidStateError" DOMException if the control isn't date- or time-based.
     */
    protected Optional<JsDate> getValueAsDate() {
        return Optional.ofNullable(getElement().getValueAsDate());
    }

    protected void setValueAsDate(JsDate valueAsDate) {
        getElement().setValueAsDate(valueAsDate);
    }

    /**
     * Returns the input field value as a number.
     */
    protected double getValueAsNumber() {
        return getElement().getValueAsNumber();
    }

    protected void setValueAsNumber(double valueAsNumber) {
        getElement().setValueAsNumber(valueAsNumber);
    }

    /**
     * Sets or retrieves the width of the object.
     */
    protected double getWidth() {
        return getElement().getWidth();
    }

    protected void setWidth(double width) {
        getElement().setWidth(width);
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
     * Makes the selection equal to the current object.
     */
    protected void select() {
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

    protected void setRangeText(String replacement) {
        getElement().setRangeText(replacement);
    }

    protected void setRangeText(String replacement, int start, int end, SelectionMode selectionMode) {
        getElement().setRangeText(replacement, start, end, selectionMode);
    }

    protected void setRangeText(String replacement, int start, int end) {
        getElement().setRangeText(replacement, start, end);
    }

    /**
     * Sets the start and end positions of a selection in a text field.
     *  @param start     The offset into the text field for the start of the selection.
     * @param end       The offset into the text field for the end of the selection.
     * @param direction The direction in which the selection is performed.
     */
    protected void setSelectionRange(int start, int end, HTMLInputElement.Direction direction) {
        getElement().setSelectionRange(start, end, direction);
    }

    protected void setSelectionRange(int start, int end) {
        getElement().setSelectionRange(start, end);
    }

    /**
     * Decrements a range input control's value by the value given by the Step attribute. If the optional parameter is used, it will decrement the input control's step value multiplied by the parameter's value.
     *
     * @param n Value to decrement the value by.
     */
    protected void stepDown(double n) {
        getElement().stepDown(n);
    }

    protected void stepDown() {
        getElement().stepDown();
    }

    /**
     * Increments a range input control's value by the value given by the Step attribute. If the optional parameter is used, will increment the input control's value by that value.
     *
     * @param n Value to increment the value by.
     */
    protected void stepUp(double n) {
        getElement().stepUp(n);
    }

    protected void stepUp() {
        getElement().stepUp();
    }
}
