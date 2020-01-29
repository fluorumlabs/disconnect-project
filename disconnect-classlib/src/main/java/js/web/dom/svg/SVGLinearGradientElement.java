package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the <linearGradient> element.
 */
public interface SVGLinearGradientElement extends SVGGradientElement {
    @JSBody(script = "return SVGLinearGradientElement.prototype")
    static SVGLinearGradientElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGLinearGradientElement()")
    static SVGLinearGradientElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedLength getX1();

    @JSProperty
    SVGAnimatedLength getX2();

    @JSProperty
    SVGAnimatedLength getY1();

    @JSProperty
    SVGAnimatedLength getY2();

}
