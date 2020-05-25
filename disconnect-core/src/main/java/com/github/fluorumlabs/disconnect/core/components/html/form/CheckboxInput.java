package com.github.fluorumlabs.disconnect.core.components.html.form;


import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class CheckboxInput extends Input {
    public CheckboxInput() {
        setType("checkbox");
    }

    public ObservableValue<Boolean> value() {
        return createObservableValue(this::isChecked, this::setChecked, "change");
    }

    public ObservableValue<Boolean> immediateValue() {
        return createObservableValue(this::isChecked, this::setChecked, "input");
    }

    /**
     * Sets or retrieves the state of the check box or radio button.
     */
    @Override
    public boolean isChecked() {
        return super.isChecked();
    }

    @Override
    public void setChecked(boolean checked) {
        super.setChecked(checked);
    }

    /**
     * Sets or retrieves the state of the check box or radio button.
     */
    @Override
    public boolean isDefaultChecked() {
        return super.isDefaultChecked();
    }

    @Override
    public void setDefaultChecked(boolean defaultChecked) {
        super.setDefaultChecked(defaultChecked);
    }

    @Override
    public boolean isIndeterminate() {
        return super.isIndeterminate();
    }

    @Override
    public void setIndeterminate(boolean indeterminate) {
        super.setIndeterminate(indeterminate);
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
}
