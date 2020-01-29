package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.EventTarget;


public interface SVGElementInstance extends EventTarget {
        @JSProperty
        SVGElement getCorrespondingElement();

        @JSProperty
        SVGUseElement getCorrespondingUseElement();

        @JSBody(script = "return SVGElementInstance.prototype")
        static SVGElementInstance prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGElementInstance()")
        static SVGElementInstance create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
