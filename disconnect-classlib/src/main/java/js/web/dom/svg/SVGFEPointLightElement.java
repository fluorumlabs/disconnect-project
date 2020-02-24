package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;fePointLight&gt; element.
 */
public interface SVGFEPointLightElement extends SVGElement {
    @JSBody(script = "return SVGFEPointLightElement.prototype")
    static SVGFEPointLightElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEPointLightElement()")
    static SVGFEPointLightElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedNumber getX();

    @JSProperty
    SVGAnimatedNumber getY();

    @JSProperty
    SVGAnimatedNumber getZ();

}
