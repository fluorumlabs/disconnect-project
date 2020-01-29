package js.web.dom.svg;

import org.teavm.jso.JSBody;


public interface SVGAnimateMotionElement extends SVGAnimationElement {
    @JSBody(script = "return SVGAnimateMotionElement.prototype")
    static SVGAnimateMotionElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAnimateMotionElement()")
    static SVGAnimateMotionElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
