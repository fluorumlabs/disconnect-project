package com.github.fluorumlabs.disconnect.zero.component.html.form;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableValue;
import js.lang.Unknown;
import js.web.dom.Autocomplete;

import javax.annotation.Nullable;
import java.util.Optional;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class RangeInput extends Input {
    public RangeInput() {
        setType("range");
    }

    public ObservableValue<Double> value() {
        return createObservableValue(this::getValueAsNumber, this::setValue, "change");
    }

    public ObservableValue<Double> immediateValue() {
        return createObservableValue(this::getValueAsNumber, this::setValue, "input");
    }

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
    @Override
    protected Autocomplete getAutocomplete() {
        return super.getAutocomplete();
    }

    @Override
    protected void setAutocomplete(Autocomplete autocomplete) {
        super.setAutocomplete(autocomplete);
    }

    /**
     * Specifies the ID of a pre-defined datalist of options for an input element.
     */
    @Override
    protected Optional<DataList> getList() {
        return super.getList();
    }

    @Override
    protected String getListId() {
        return super.getListId();
    }

    @Override
    protected void setListId(String id) {
        super.setListId(id);
    }

    /**
     * Defines the maximum acceptable value for an input element with type="number".When used with the min and step attributes, lets you control the range and increment (such as only even numbers) that the user can enter into an input field.
     */
    @Override
    protected String getMax() {
        return super.getMax();
    }

    @Override
    protected void setMax(String max) {
        super.setMax(max);
    }

    /**
     * Defines the minimum acceptable value for an input element with type="number". When used with the max and step attributes, lets you control the range and increment (such as even numbers only) that the user can enter into an input field.
     */
    @Override
    protected String getMin() {
        return super.getMin();
    }

    @Override
    protected void setMin(String min) {
        super.setMin(min);
    }

    /**
     * Defines an increment or jump between values that you want to allow the user to enter. When used with the max and min attributes, lets you control the range and increment (for example, allow only even numbers) that the user can enter into an input field.
     */
    @Override
    protected String getStep() {
        return super.getStep();
    }

    @Override
    protected void setStep(String step) {
        super.setStep(step);
    }

    /**
     * Returns the input field value as a number.
     */
    @Override
    protected double getValueAsNumber() {
        return super.getValueAsNumber();
    }

    @Override
    protected void setValueAsNumber(double valueAsNumber) {
        super.setValueAsNumber(valueAsNumber);
    }

    /**
     * Decrements a range input control's value by the value given by the Step attribute. If the optional parameter is used, it will decrement the input control's step value multiplied by the parameter's value.
     *
     * @param n Value to decrement the value by.
     */
    @Override
    protected void stepDown(double n) {
        super.stepDown(n);
    }

    @Override
    protected void stepDown() {
        super.stepDown();
    }

    /**
     * Increments a range input control's value by the value given by the Step attribute. If the optional parameter is used, will increment the input control's value by that value.
     *
     * @param n Value to increment the value by.
     */
    @Override
    protected void stepUp(double n) {
        super.stepUp(n);
    }

    @Override
    protected void stepUp() {
        super.stepUp();
    }

    @Nullable
    public Double getDefaultDoubleValue() {
        String value = getDefaultValue();
        if (value.isEmpty()) {
            return null;
        } else {
            return Unknown.of(value).doubleValue();
        }
    }

    public void setValue(@Nullable Double value) {
        if (value == null || value.isNaN()) {
            setValue("");
        } else {
            setValue(Unknown.of(value).stringValue());
        }
    }

    public void setDefaultDoubleValue(@Nullable Double value) {
        if (value == null || value.isNaN()) {
            setDefaultValue("");
        } else {
            setDefaultValue(Unknown.of(value).stringValue());
        }
    }
}
