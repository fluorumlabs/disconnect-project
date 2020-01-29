package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Used for attributes of type SVGPreserveAspectRatio which can be animated.
 */
public interface SVGAnimatedPreserveAspectRatio extends Any {
    @JSBody(script = "return SVGAnimatedPreserveAspectRatio.prototype")
    static SVGAnimatedPreserveAspectRatio prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAnimatedPreserveAspectRatio()")
    static SVGAnimatedPreserveAspectRatio create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGPreserveAspectRatio getAnimVal();

    @JSProperty
    SVGPreserveAspectRatio getBaseVal();

}
