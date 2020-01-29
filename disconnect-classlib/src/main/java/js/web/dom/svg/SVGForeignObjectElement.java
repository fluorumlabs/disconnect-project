package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides access to the properties of <foreignObject> elements, as well as methods to manipulate them.
 */
public interface SVGForeignObjectElement extends SVGGraphicsElement {
    @JSBody(script = "return SVGForeignObjectElement.prototype")
    static SVGForeignObjectElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGForeignObjectElement()")
    static SVGForeignObjectElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedLength getHeight();

    @JSProperty
    SVGAnimatedLength getWidth();

    @JSProperty
    SVGAnimatedLength getX();

    @JSProperty
    SVGAnimatedLength getY();

}
