package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used for attributes which take a list of numbers and which can be animated. */
        public interface SVGAnimatedTransformList extends Any {
        @JSProperty
        SVGTransformList getAnimVal();

        @JSProperty
        SVGTransformList getBaseVal();

        @JSBody(script = "return SVGAnimatedTransformList.prototype")
        static SVGAnimatedTransformList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedTransformList()")
        static SVGAnimatedTransformList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
