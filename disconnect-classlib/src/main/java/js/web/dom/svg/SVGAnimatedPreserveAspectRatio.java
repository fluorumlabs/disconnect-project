package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used for attributes of type SVGPreserveAspectRatio which can be animated. */
        public interface SVGAnimatedPreserveAspectRatio extends Any {
        @JSProperty
        SVGPreserveAspectRatio getAnimVal();

        @JSProperty
        SVGPreserveAspectRatio getBaseVal();

        @JSBody(script = "return SVGAnimatedPreserveAspectRatio.prototype")
        static SVGAnimatedPreserveAspectRatio prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedPreserveAspectRatio()")
        static SVGAnimatedPreserveAspectRatio create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
