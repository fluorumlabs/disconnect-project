package js.web.dom.svg;

import js.web.dom.DOMMatrix;
import js.web.dom.DOMRect;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * SVG elements whose primary purpose is to directly render graphics into a group.
 */
public interface SVGGraphicsElement extends SVGElement, SVGTests {
    @JSBody(script = "return SVGGraphicsElement.prototype")
    static SVGGraphicsElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGGraphicsElement()")
    static SVGGraphicsElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedTransformList getTransform();

    DOMRect getBBox(SVGBoundingBoxOptions options);

    DOMRect getBBox();

    @Nullable
    DOMMatrix getCTM();

    @Nullable
    DOMMatrix getScreenCTM();

}
