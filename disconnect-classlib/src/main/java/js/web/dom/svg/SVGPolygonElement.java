package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Provides access to the properties of &lt;polygon&gt; elements, as well as methods to manipulate them.
 */
public interface SVGPolygonElement extends SVGGeometryElement, SVGAnimatedPoints {
    @JSBody(script = "return SVGPolygonElement.prototype")
    static SVGPolygonElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPolygonElement()")
    static SVGPolygonElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
