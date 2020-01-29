package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The HTML <meter> elements expose the HTMLMeterElement interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of <meter> elements.
 */
public interface HTMLMeterElement extends HTMLElement {
    @JSBody(script = "return HTMLMeterElement.prototype")
    static HTMLMeterElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLMeterElement()")
    static HTMLMeterElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getHigh();

    @JSProperty
    void setHigh(double high);

    @JSProperty
    NodeListOf<HTMLLabelElement> getLabels();

    @JSProperty
    double getLow();

    @JSProperty
    void setLow(double low);

    @JSProperty
    double getMax();

    @JSProperty
    void setMax(double max);

    @JSProperty
    double getMin();

    @JSProperty
    void setMin(double min);

    @JSProperty
    double getOptimum();

    @JSProperty
    void setOptimum(double optimum);

    @JSProperty
    double getValue();

    @JSProperty
    void setValue(double value);

}
