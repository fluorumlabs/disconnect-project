package js.web.dom.svg;

import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGElementInstance extends EventTarget {
    @JSBody(script = "return SVGElementInstance.prototype")
    static SVGElementInstance prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGElementInstance()")
    static SVGElementInstance create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGElement getCorrespondingElement();

    @JSProperty
    SVGUseElement getCorrespondingUseElement();

}
