package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Used for attributes of basic type &lt;length&gt; which can be animated.
 */
public interface SVGAnimatedLength extends Any {
    @JSBody(script = "return SVGAnimatedLength.prototype")
    static SVGAnimatedLength prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAnimatedLength()")
    static SVGAnimatedLength create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGLength getAnimVal();

    @JSProperty
    SVGLength getBaseVal();

}
