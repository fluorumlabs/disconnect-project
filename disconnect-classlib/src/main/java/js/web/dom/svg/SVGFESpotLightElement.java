package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;feSpotLight&gt; element.
 */
public interface SVGFESpotLightElement extends SVGElement {
    @JSBody(script = "return SVGFESpotLightElement.prototype")
    static SVGFESpotLightElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFESpotLightElement()")
    static SVGFESpotLightElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedNumber getLimitingConeAngle();

    @JSProperty
    SVGAnimatedNumber getPointsAtX();

    @JSProperty
    SVGAnimatedNumber getPointsAtY();

    @JSProperty
    SVGAnimatedNumber getPointsAtZ();

    @JSProperty
    SVGAnimatedNumber getSpecularExponent();

    @JSProperty
    SVGAnimatedNumber getX();

    @JSProperty
    SVGAnimatedNumber getY();

    @JSProperty
    SVGAnimatedNumber getZ();

}
