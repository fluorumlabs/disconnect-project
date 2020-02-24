package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides access to the properties of &lt;mask&gt; elements, as well as methods to manipulate them.
 */
public interface SVGMaskElement extends SVGElement {
    @JSBody(script = "return SVGMaskElement.prototype")
    static SVGMaskElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGMaskElement()")
    static SVGMaskElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedLength getHeight();

    @JSProperty
    SVGAnimatedEnumeration getMaskContentUnits();

    @JSProperty
    SVGAnimatedEnumeration getMaskUnits();

    @JSProperty
    SVGAnimatedLength getWidth();

    @JSProperty
    SVGAnimatedLength getX();

    @JSProperty
    SVGAnimatedLength getY();

}
