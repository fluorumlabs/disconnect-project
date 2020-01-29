package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used for attributes of basic type <angle> which can be animated. */
        public interface SVGAnimatedAngle extends Any {
        @JSProperty
        SVGAngle getAnimVal();

        @JSProperty
        SVGAngle getBaseVal();

        @JSBody(script = "return SVGAnimatedAngle.prototype")
        static SVGAnimatedAngle prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedAngle()")
        static SVGAnimatedAngle create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
