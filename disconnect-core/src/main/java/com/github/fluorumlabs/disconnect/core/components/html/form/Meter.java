package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import js.web.dom.HTMLMeterElement;

@Tag("meter")
public class Meter extends HtmlComponent<HTMLMeterElement> {
    public double getHigh() {
        return getElement().getHigh();
    }

    public void setHigh(double high) {
        getElement().setHigh(high);
    }

    public ComponentList<Label> getLabels() {
        return new ArrayLikeBackedComponentList<>(getElement().getLabels());
    }

    public double getLow() {
        return getElement().getLow();
    }

    public void setLow(double low) {
        getElement().setLow(low);
    }

    public double getMax() {
        return getElement().getMax();
    }

    public void setMax(double max) {
        getElement().setMax(max);
    }

    public double getMin() {
        return getElement().getMin();
    }

    public void setMin(double min) {
        getElement().setMin(min);
    }

    public double getOptimum() {
        return getElement().getOptimum();
    }

    public void setOptimum(double optimum) {
        getElement().setOptimum(optimum);
    }

    public double getValue() {
        return getElement().getValue();
    }

    public void setValue(double value) {
        getElement().setValue(value);
    }
}
