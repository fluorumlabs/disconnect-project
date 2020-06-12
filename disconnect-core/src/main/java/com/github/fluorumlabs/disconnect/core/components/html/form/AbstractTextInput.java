package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import js.web.dom.Autocomplete;
import js.web.dom.HTMLInputElement;
import js.web.dom.SelectionMode;

import javax.annotation.Nullable;
import java.util.Optional;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class AbstractTextInput extends Input{
    protected AbstractTextInput() {

    }

    protected AbstractTextInput(Component<?>... components) {
        super(components);
    }

    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "change");
    }

    public ObservableValue<String> immediateValue() {
        return createObservableValue(this::getValue, this::setValue, "input");
    }

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
    @Override
    public Autocomplete getAutocomplete() {
        return super.getAutocomplete();
    }

    @Override
    public void setAutocomplete(Autocomplete autocomplete) {
        super.setAutocomplete(autocomplete);
    }

    /**
     * Specifies the ID of a pre-defined datalist of options for an input element.
     */
    @Override
    public Optional<DataList> getList() {
        return super.getList();
    }

    @Override
    public String getListId() {
        return super.getListId();
    }

    @Override
    public void setListId(String id) {
        super.setListId(id);
    }

    /**
     * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    @Override
    public double getMaxLength() {
        return super.getMaxLength();
    }

    @Override
    public void setMaxLength(double maxLength) {
        super.setMaxLength(maxLength);
    }

    @Override
    public double getMinLength() {
        return super.getMinLength();
    }

    @Override
    public void setMinLength(double minLength) {
        super.setMinLength(minLength);
    }

    /**
     * Gets or sets a string containing a regular expression that the user's input must match.
     */
    @Override
    public String getPattern() {
        return super.getPattern();
    }

    @Override
    public void setPattern(String pattern) {
        super.setPattern(pattern);
    }

    /**
     * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    @Override
    public String getPlaceholder() {
        return super.getPlaceholder();
    }

    @Override
    public void setPlaceholder(String placeholder) {
        super.setPlaceholder(placeholder);
    }

    @Override
    public boolean isReadOnly() {
        return super.isReadOnly();
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        super.setReadOnly(readOnly);
    }

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    @Override
    public boolean isRequired() {
        return super.isRequired();
    }

    @Override
    public void setRequired(boolean required) {
        super.setRequired(required);
    }

    @Override
    public Optional<String> getSelectionDirection() {
        return super.getSelectionDirection();
    }

    @Override
    public void setSelectionDirection(@Nullable String selectionDirection) {
        super.setSelectionDirection(selectionDirection);
    }

    /**
     * Gets or sets the end position or offset of a text selection.
     */
    @Override
    public Optional<Integer> getSelectionEnd() {
        return super.getSelectionEnd();
    }

    @Override
    public void setSelectionEnd(@Nullable Integer selectionEnd) {
        super.setSelectionEnd(selectionEnd);
    }

    /**
     * Gets or sets the starting position or offset of a text selection.
     */
    @Override
    public Optional<Integer> getSelectionStart() {
        return super.getSelectionStart();
    }

    @Override
    public void setSelectionStart(@Nullable Integer selectionStart) {
        super.setSelectionStart(selectionStart);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    /**
     * Makes the selection equal to the current object.
     */
    @Override
    public void select() {
        super.select();
    }

    @Override
    public void setRangeText(String replacement) {
        super.setRangeText(replacement);
    }

    @Override
    public void setRangeText(String replacement, int start, int end, SelectionMode selectionMode) {
        super.setRangeText(replacement, start, end, selectionMode);
    }

    @Override
    public void setRangeText(String replacement, int start, int end) {
        super.setRangeText(replacement, start, end);
    }

    /**
     * Sets the start and end positions of a selection in a text field.
     *
     * @param start     The offset into the text field for the start of the selection.
     * @param end       The offset into the text field for the end of the selection.
     * @param direction The direction in which the selection is performed.
     */
    @Override
    public void setSelectionRange(int start, int end, HTMLInputElement.Direction direction) {
        super.setSelectionRange(start, end, direction);
    }

    @Override
    public void setSelectionRange(int start, int end) {
        super.setSelectionRange(start, end);
    }

    /**
     * Sets or retrieves the initial contents of the object.
     */
    @Override
    public String getDefaultValue() {
        return super.getDefaultValue();
    }

    @Override
    public void setDefaultValue(String defaultValue) {
        super.setDefaultValue(defaultValue);
    }
}
