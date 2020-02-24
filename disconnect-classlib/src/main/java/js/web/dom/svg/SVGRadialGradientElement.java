package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;RadialGradient&gt; element.
 */
public interface SVGRadialGradientElement extends SVGGradientElement {
    @JSBody(script = "return SVGRadialGradientElement.prototype")
    static SVGRadialGradientElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGRadialGradientElement()")
    static SVGRadialGradientElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedLength getCx();

    @JSProperty
    SVGAnimatedLength getCy();

    @JSProperty
    SVGAnimatedLength getFx();

    @JSProperty
    SVGAnimatedLength getFy();

    @JSProperty
    SVGAnimatedLength getR();

}
