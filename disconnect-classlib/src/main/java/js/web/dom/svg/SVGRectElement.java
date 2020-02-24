package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides access to the properties of &lt;rect&gt; elements, as well as methods to manipulate them.
 */
public interface SVGRectElement extends SVGGeometryElement {
    @JSBody(script = "return SVGRectElement.prototype")
    static SVGRectElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGRectElement()")
    static SVGRectElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedLength getHeight();

    @JSProperty
    SVGAnimatedLength getRx();

    @JSProperty
    SVGAnimatedLength getRy();

    @JSProperty
    SVGAnimatedLength getWidth();

    @JSProperty
    SVGAnimatedLength getX();

    @JSProperty
    SVGAnimatedLength getY();
}
