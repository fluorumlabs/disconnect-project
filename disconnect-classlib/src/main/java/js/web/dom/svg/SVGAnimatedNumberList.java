package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated. */
        public interface SVGAnimatedNumberList extends Any {
        @JSProperty
        SVGNumberList getAnimVal();

        @JSProperty
        SVGNumberList getBaseVal();

        @JSBody(script = "return SVGAnimatedNumberList.prototype")
        static SVGAnimatedNumberList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedNumberList()")
        static SVGAnimatedNumberList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
