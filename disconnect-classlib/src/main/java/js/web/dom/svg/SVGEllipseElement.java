package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides access to the properties of <ellipse> elements.
 */
public interface SVGEllipseElement extends SVGGeometryElement {
    @JSBody(script = "return SVGEllipseElement.prototype")
    static SVGEllipseElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGEllipseElement()")
    static SVGEllipseElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedLength getCx();

    @JSProperty
    SVGAnimatedLength getCy();

    @JSProperty
    SVGAnimatedLength getRx();

    @JSProperty
    SVGAnimatedLength getRy();

}
