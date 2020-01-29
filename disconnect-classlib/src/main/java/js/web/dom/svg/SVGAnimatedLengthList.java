package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used for attributes of type SVGLengthList which can be animated. */
        public interface SVGAnimatedLengthList extends Any {
        @JSProperty
        SVGLengthList getAnimVal();

        @JSProperty
        SVGLengthList getBaseVal();

        @JSBody(script = "return SVGAnimatedLengthList.prototype")
        static SVGAnimatedLengthList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedLengthList()")
        static SVGAnimatedLengthList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
