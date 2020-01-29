package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGFEDropShadowElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEDropShadowElement.prototype")
    static SVGFEDropShadowElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEDropShadowElement()")
    static SVGFEDropShadowElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedNumber getDx();

    @JSProperty
    SVGAnimatedNumber getDy();

    @JSProperty
    SVGAnimatedString getIn1();

    @JSProperty
    SVGAnimatedNumber getStdDeviationX();

    @JSProperty
    SVGAnimatedNumber getStdDeviationY();

}
