package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.NumberFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-number-field>` is a Web Component for number field control in forms.
 * <p>
 * ```html
 * <vaadin-number-field label="Number">
 * </vaadin-number-field>
 * ```
 */
public class VaadinNumberField extends AbstractComponent<NumberFieldElement>
        implements HasComponents<NumberFieldElement, VaadinNumberField, Component<?>> {
    public VaadinNumberField() {
        super("vaadin-number-field");
    }

    /**
     * Set to true to display value increase/decrease controls.
     */
    public boolean hasControls() {
        return getNode().isHasControls();
    }

    /**
     * Set to true to display value increase/decrease controls.
     */
    public VaadinNumberField hasControls(boolean hasControls) {
        getNode().setHasControls(hasControls);
        return this;
    }

    /**
     * The minimum value of the field.
     */
    public double min() {
        return getNode().getMin();
    }

    /**
     * The minimum value of the field.
     */
    public VaadinNumberField min(double min) {
        getNode().setMin(min);
        return this;
    }

    /**
     * The maximum value of the field.
     */
    public double max() {
        return getNode().getMax();
    }

    /**
     * The maximum value of the field.
     */
    public VaadinNumberField max(double max) {
        getNode().setMax(max);
        return this;
    }

    /**
     * Specifies the allowed number intervals of the field.
     */
    public double step() {
        return getNode().getStep();
    }

    /**
     * Specifies the allowed number intervals of the field.
     */
    public VaadinNumberField step(double step) {
        getNode().setStep(step);
        return this;
    }

    /**
     *
     */
    public boolean checkValidity() {
        return getNode().checkValidity();
    }
}
