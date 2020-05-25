package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import js.lang.JsDate;
import js.web.dom.Autocomplete;

import java.util.Optional;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class AbstractDateInput extends Input {
    protected AbstractDateInput(){
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
     * Defines the maximum acceptable value for an input element with type="number".When used with the min and step attributes, lets you control the range and increment (such as only even numbers) that the user can enter into an input field.
     */
    @Override
    public String getMax() {
        return super.getMax();
    }

    @Override
    public void setMax(String max) {
        super.setMax(max);
    }

    /**
     * Defines the minimum acceptable value for an input element with type="number". When used with the max and step attributes, lets you control the range and increment (such as even numbers only) that the user can enter into an input field.
     */
    @Override
    public String getMin() {
        return super.getMin();
    }

    @Override
    public void setMin(String min) {
        super.setMin(min);
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

    /**
     * Defines an increment or jump between values that you want to allow the user to enter. When used with the max and min attributes, lets you control the range and increment (for example, allow only even numbers) that the user can enter into an input field.
     */
    @Override
    public String getStep() {
        return super.getStep();
    }

    @Override
    public void setStep(String step) {
        super.setStep(step);
    }

    /**
     * Returns a Date object representing the form control's value, if applicable
     * otherwise, returns null. Can be set, to change the value. Throws an "InvalidStateError" DOMException if the control isn't date- or time-based.
     */
    @Override
    public Optional<JsDate> getValueAsDate() {
        return super.getValueAsDate();
    }

    @Override
    public void setValueAsDate(JsDate valueAsDate) {
        super.setValueAsDate(valueAsDate);
    }

    /**
     * Returns the input field value as a number.
     */
    @Override
    public double getValueAsNumber() {
        return super.getValueAsNumber();
    }

    @Override
    public void setValueAsNumber(double valueAsNumber) {
        super.setValueAsNumber(valueAsNumber);
    }

    /**
     * Makes the selection equal to the current object.
     */
    @Override
    public void select() {
        super.select();
    }

    /**
     * Decrements a range input control's value by the value given by the Step attribute. If the optional parameter is used, it will decrement the input control's step value multiplied by the parameter's value.
     *
     * @param n Value to decrement the value by.
     */
    @Override
    public void stepDown(double n) {
        super.stepDown(n);
    }

    @Override
    public void stepDown() {
        super.stepDown();
    }

    /**
     * Increments a range input control's value by the value given by the Step attribute. If the optional parameter is used, will increment the input control's value by that value.
     *
     * @param n Value to increment the value by.
     */
    @Override
    public void stepUp(double n) {
        super.stepUp(n);
    }

    @Override
    public void stepUp() {
        super.stepUp();
    }
}
