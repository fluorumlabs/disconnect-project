package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Corresponds to the <stop> element. */
        public interface SVGStopElement extends SVGElement {
        @JSProperty
        SVGAnimatedNumber getOffset();

        @JSBody(script = "return SVGStopElement.prototype")
        static SVGStopElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGStopElement()")
        static SVGStopElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
