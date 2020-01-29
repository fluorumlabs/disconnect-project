package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The SVGAnimatedString interface represents string attributes which can be animated from each SVG declaration. You need to create SVG attribute before doing anything else, everything should be declared inside this. */
        public interface SVGAnimatedString extends Any {
        @JSProperty
        String getAnimVal();

        @JSProperty
        String getBaseVal();

        @JSProperty
        void setBaseVal(String baseVal);

        @JSBody(script = "return SVGAnimatedString.prototype")
        static SVGAnimatedString prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedString()")
        static SVGAnimatedString create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
