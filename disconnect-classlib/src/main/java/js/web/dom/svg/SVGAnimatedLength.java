package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used for attributes of basic type <length> which can be animated. */
        public interface SVGAnimatedLength extends Any {
        @JSProperty
        SVGLength getAnimVal();

        @JSProperty
        SVGLength getBaseVal();

        @JSBody(script = "return SVGAnimatedLength.prototype")
        static SVGAnimatedLength prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedLength()")
        static SVGAnimatedLength create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
