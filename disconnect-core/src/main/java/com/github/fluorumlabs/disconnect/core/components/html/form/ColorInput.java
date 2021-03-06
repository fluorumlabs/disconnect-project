package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;

import java.util.Optional;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class ColorInput extends Input {
    public ColorInput() {
        setType("color");
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
    public HtmlComponent.Autocomplete getAutocomplete() {
        return super.getAutocomplete();
    }

    @Override
    public void setAutocomplete(HtmlComponent.Autocomplete autocomplete) {
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
     * Makes the selection equal to the current object.
     */
    @Override
    public void select() {
        super.select();
    }
}
