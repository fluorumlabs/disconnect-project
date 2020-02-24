package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Used for attributes of basic type &lt;integer&gt; which can be animated.
 */
public interface SVGAnimatedInteger extends Any {
    @JSBody(script = "return SVGAnimatedInteger.prototype")
    static SVGAnimatedInteger prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAnimatedInteger()")
    static SVGAnimatedInteger create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getAnimVal();

    @JSProperty
    int getBaseVal();

    @JSProperty
    void setBaseVal(int baseVal);

}
