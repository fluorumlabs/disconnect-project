package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGAnimationElement extends SVGElement {
    @JSBody(script = "return SVGAnimationElement.prototype")
    static SVGAnimationElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAnimationElement()")
    static SVGAnimationElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGElement getTargetElement();

    double getCurrentTime();

    double getSimpleDuration();

    double getStartTime();

}
