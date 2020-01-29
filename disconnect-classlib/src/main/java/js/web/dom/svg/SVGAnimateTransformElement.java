package js.web.dom.svg;

import org.teavm.jso.JSBody;


public interface SVGAnimateTransformElement extends SVGAnimationElement {
        @JSBody(script = "return SVGAnimateTransformElement.prototype")
        static SVGAnimateTransformElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimateTransformElement()")
        static SVGAnimateTransformElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
