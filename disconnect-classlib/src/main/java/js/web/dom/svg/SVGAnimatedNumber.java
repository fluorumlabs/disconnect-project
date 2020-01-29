package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Used for attributes of basic type <Number> which can be animated.
 */
public interface SVGAnimatedNumber extends Any {
    @JSBody(script = "return SVGAnimatedNumber.prototype")
    static SVGAnimatedNumber prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAnimatedNumber()")
    static SVGAnimatedNumber create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getAnimVal();

    @JSProperty
    double getBaseVal();

    @JSProperty
    void setBaseVal(double baseVal);

}
