package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides access to the properties of <view> elements, as well as methods to manipulate them.
 */
public interface SVGViewElement extends SVGElement, SVGFitToViewBox, SVGZoomAndPan {
    @JSBody(script = "return SVGViewElement.prototype")
    static SVGViewElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGViewElement()")
    static SVGViewElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    SVGStringList getViewTarget();


}
