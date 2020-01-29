package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGCursorElement extends SVGElement {
    @JSBody(script = "return SVGCursorElement.prototype")
    static SVGCursorElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGCursorElement()")
    static SVGCursorElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedLength getX();

    @JSProperty
    SVGAnimatedLength getY();

}
