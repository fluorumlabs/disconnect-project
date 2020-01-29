package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <progress> elements.
 */
public interface HTMLProgressElement extends HTMLElement {
    @JSBody(script = "return HTMLProgressElement.prototype")
    static HTMLProgressElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLProgressElement()")
    static HTMLProgressElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    NodeListOf<HTMLLabelElement> getLabels();

    /**
     * Defines the maximum, or "done" value for a progress element.
     */
    @JSProperty
    double getMax();

    @JSProperty
    void setMax(double max);

    /**
     * Returns the quotient of value/max when the value attribute is set (determinate progress bar), or -1 when the value attribute is missing (indeterminate progress bar).
     */
    @JSProperty
    double getPosition();

    /**
     * Sets or gets the current value of a progress element. The value must be a non-negative number between 0 and the max value.
     */
    @JSProperty
    double getValue();

    @JSProperty
    void setValue(double value);

}
