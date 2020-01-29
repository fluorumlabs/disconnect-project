package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Provides access to the properties of <polyline> elements, as well as methods to manipulate them.
 */
public interface SVGPolylineElement extends SVGGeometryElement, SVGAnimatedPoints {
    @JSBody(script = "return SVGPolylineElement.prototype")
    static SVGPolylineElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPolylineElement()")
    static SVGPolylineElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
