package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the <feDiffuseLighting> element.
 */
public interface SVGFEDiffuseLightingElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEDiffuseLightingElement.prototype")
    static SVGFEDiffuseLightingElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEDiffuseLightingElement()")
    static SVGFEDiffuseLightingElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedNumber getDiffuseConstant();

    @JSProperty
    SVGAnimatedString getIn1();

    @JSProperty
    SVGAnimatedNumber getKernelUnitLengthX();

    @JSProperty
    SVGAnimatedNumber getKernelUnitLengthY();

    @JSProperty
    SVGAnimatedNumber getSurfaceScale();

}
