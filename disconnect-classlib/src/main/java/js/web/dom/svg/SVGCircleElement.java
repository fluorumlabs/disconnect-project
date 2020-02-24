package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * An interface for the &lt;circle&gt; element. The circle element is defined by the cx and cy attributes that denote the coordinates of the centre of the circle.
 */
public interface SVGCircleElement extends SVGGeometryElement {
    @JSBody(script = "return SVGCircleElement.prototype")
    static SVGCircleElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGCircleElement()")
    static SVGCircleElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedLength getCx();

    @JSProperty
    SVGAnimatedLength getCy();

    @JSProperty
    SVGAnimatedLength getR();

}
