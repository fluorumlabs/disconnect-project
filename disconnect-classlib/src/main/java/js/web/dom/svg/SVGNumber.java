package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the <number> basic data type.
 */
public interface SVGNumber extends Any {
    @JSBody(script = "return SVGNumber.prototype")
    static SVGNumber prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGNumber()")
    static SVGNumber create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getValue();

    @JSProperty
    void setValue(double value);

}
