package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;feSpecularLighting&gt; element.
 */
public interface SVGFESpecularLightingElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFESpecularLightingElement.prototype")
    static SVGFESpecularLightingElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFESpecularLightingElement()")
    static SVGFESpecularLightingElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedString getIn1();

    @JSProperty
    SVGAnimatedNumber getKernelUnitLengthX();

    @JSProperty
    SVGAnimatedNumber getKernelUnitLengthY();

    @JSProperty
    SVGAnimatedNumber getSpecularConstant();

    @JSProperty
    SVGAnimatedNumber getSpecularExponent();

    @JSProperty
    SVGAnimatedNumber getSurfaceScale();

}
