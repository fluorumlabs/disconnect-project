package js.web.dom.svg;

import org.teavm.jso.JSBody;


public interface SVGAnimateElement extends SVGAnimationElement {
    @JSBody(script = "return SVGAnimateElement.prototype")
    static SVGAnimateElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAnimateElement()")
    static SVGAnimateElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
