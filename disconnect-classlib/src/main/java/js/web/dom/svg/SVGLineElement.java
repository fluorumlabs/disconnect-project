package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides access to the properties of &lt;line&gt; elements, as well as methods to manipulate them.
 */
public interface SVGLineElement extends SVGGeometryElement {
    @JSBody(script = "return SVGLineElement.prototype")
    static SVGLineElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGLineElement()")
    static SVGLineElement create() {
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
