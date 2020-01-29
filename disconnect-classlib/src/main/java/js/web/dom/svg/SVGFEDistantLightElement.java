package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the <feDistantLight> element.
 */
public interface SVGFEDistantLightElement extends SVGElement {
    @JSBody(script = "return SVGFEDistantLightElement.prototype")
    static SVGFEDistantLightElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEDistantLightElement()")
    static SVGFEDistantLightElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedNumber getAzimuth();

    @JSProperty
    SVGAnimatedNumber getElevation();

}
