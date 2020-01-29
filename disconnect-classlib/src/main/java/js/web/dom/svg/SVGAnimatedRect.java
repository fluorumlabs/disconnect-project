package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.web.dom.DOMRect;
import js.web.dom.DOMRectReadOnly;

/** Used for attributes of basic SVGRect which can be animated. */
        public interface SVGAnimatedRect extends Any {
        @JSProperty
        DOMRectReadOnly getAnimVal();

        @JSProperty
        DOMRect getBaseVal();

        @JSBody(script = "return SVGAnimatedRect.prototype")
        static SVGAnimatedRect prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedRect()")
        static SVGAnimatedRect create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
