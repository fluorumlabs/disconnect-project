package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;feGaussianBlur&gt; element.
 */
public interface SVGFEGaussianBlurElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEGaussianBlurElement.prototype")
    static SVGFEGaussianBlurElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEGaussianBlurElement()")
    static SVGFEGaussianBlurElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedString getIn1();

    @JSProperty
    SVGAnimatedNumber getStdDeviationX();

    @JSProperty
    SVGAnimatedNumber getStdDeviationY();

}
