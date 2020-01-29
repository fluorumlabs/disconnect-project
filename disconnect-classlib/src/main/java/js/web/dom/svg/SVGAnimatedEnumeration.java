package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used for attributes whose value must be a constant from a particular enumeration and which can be animated. */
        public interface SVGAnimatedEnumeration<T extends JsEnum> extends Any {
        @JSProperty
        T getAnimVal();

        @JSProperty
        T getBaseVal();

        @JSProperty
        void setBaseVal(T baseVal);

        @JSBody(script = "return SVGAnimatedEnumeration.prototype")
        static SVGAnimatedEnumeration prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAnimatedEnumeration()")
        static SVGAnimatedEnumeration create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
