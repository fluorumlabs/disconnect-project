package js.web.dom.svg;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Corresponds to the <use> element.
 */
public interface SVGUseElement extends SVGGraphicsElement, SVGURIReference {
    @JSBody(script = "return SVGUseElement.prototype")
    static SVGUseElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGUseElement()")
    static SVGUseElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    SVGElementInstance getAnimatedInstanceRoot();

    @JSProperty
    SVGAnimatedLength getHeight();

    @JSProperty
    @Nullable
    SVGElementInstance getInstanceRoot();

    @JSProperty
    SVGAnimatedLength getWidth();

    @JSProperty
    SVGAnimatedLength getX();

    @JSProperty
    SVGAnimatedLength getY();

}
