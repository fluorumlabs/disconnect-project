package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used for attributes of type boolean which can be animated. */
        public interface SVGAnimatedBoolean extends Any {
        @JSProperty
        boolean isAnimVal();

        @JSProperty
        boolean isBaseVal();

        @JSProperty
        void setBaseVal(boolean baseVal);

        @JSBody(script = "return SVGAnimatedBoolean.prototype")
        static SVGAnimatedBoolean prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedBoolean()")
        static SVGAnimatedBoolean create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
