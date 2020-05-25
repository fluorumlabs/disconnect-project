package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import js.web.dom.HTMLProgressElement;

@Tag("progress")
public class Progress extends HtmlComponent<HTMLProgressElement> {
    public ComponentList<Label> getLabels() {
        return  new ArrayLikeBackedComponentList<>(getElement().getLabels());
    }

    /**
     * Defines the maximum, or "done" value for a progress element.
     */
    public double getMax() {
        return getElement().getMax();
    }

    public void setMax(double max) {
        getElement().setMax(max);
    }

    /**
     * Returns the quotient of value/max when the value attribute is set (determinate progress bar), or -1 when the value attribute is missing (indeterminate progress bar).
     */
    public double getPosition() {
        return getElement().getPosition();
    }

    /**
     * Sets or gets the current value of a progress element. The value must be a non-negative number between 0 and the max value.
     */
    public double getValue() {
        return getElement().getValue();
    }

    public void setValue(double value) {
        getElement().setValue(value);
    }
}
