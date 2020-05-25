package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import js.web.dom.Autocomplete;

import java.util.Optional;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class EmailInput extends Input{
    public EmailInput() {
        setType("email");
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
     * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     */
    @Override
    public boolean isMultiple() {
        return super.isMultiple();
    }

    @Override
    public void setMultiple(boolean multiple) {
        super.setMultiple(multiple);
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
}
