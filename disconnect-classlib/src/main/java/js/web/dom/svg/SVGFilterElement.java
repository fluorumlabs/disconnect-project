package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides access to the properties of <filter> elements, as well as methods to manipulate them.
 */
public interface SVGFilterElement extends SVGElement, SVGURIReference {
    @JSBody(script = "return SVGFilterElement.prototype")
    static SVGFilterElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFilterElement()")
    static SVGFilterElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedEnumeration getFilterUnits();

    @JSProperty
    SVGAnimatedLength getHeight();

    @JSProperty
    SVGAnimatedEnumeration getPrimitiveUnits();

    @JSProperty
    SVGAnimatedLength getWidth();

    @JSProperty
    SVGAnimatedLength getX();

    @JSProperty
    SVGAnimatedLength getY();

}
