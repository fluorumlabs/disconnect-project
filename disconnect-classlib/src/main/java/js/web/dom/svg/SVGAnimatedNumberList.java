package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated.
 */
public interface SVGAnimatedNumberList extends Any {
    @JSBody(script = "return SVGAnimatedNumberList.prototype")
    static SVGAnimatedNumberList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAnimatedNumberList()")
    static SVGAnimatedNumberList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGNumberList getAnimVal();

    @JSProperty
    SVGNumberList getBaseVal();

}
