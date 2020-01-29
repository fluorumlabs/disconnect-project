package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used for attributes of basic type <integer> which can be animated. */
        public interface SVGAnimatedInteger extends Any {
        @JSProperty
        int getAnimVal();

        @JSProperty
        int getBaseVal();

        @JSProperty
        void setBaseVal(int baseVal);

        @JSBody(script = "return SVGAnimatedInteger.prototype")
        static SVGAnimatedInteger prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedInteger()")
        static SVGAnimatedInteger create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
