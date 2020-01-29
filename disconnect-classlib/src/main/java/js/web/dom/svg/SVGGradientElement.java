package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** The SVGGradient interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement. */
        public interface SVGGradientElement extends SVGElement, SVGURIReference {
        @JSProperty
        SVGAnimatedTransformList getGradientTransform();

        @JSProperty
        SVGAnimatedEnumeration getGradientUnits();

        @JSProperty
        SVGAnimatedEnumeration<SpreadMethod> getSpreadMethod();

        abstract class SpreadMethod extends JsEnum {
        public static final SpreadMethod SVG_SPREADMETHOD_PAD = JsEnum.from("return SVGGradientElement.SVG_SPREADMETHOD_PAD");


        public static final SpreadMethod SVG_SPREADMETHOD_REFLECT = JsEnum.from("return SVGGradientElement.SVG_SPREADMETHOD_REFLECT");


        public static final SpreadMethod SVG_SPREADMETHOD_REPEAT = JsEnum.from("return SVGGradientElement.SVG_SPREADMETHOD_REPEAT");


        public static final SpreadMethod SVG_SPREADMETHOD_UNKNOWN = JsEnum.from("return SVGGradientElement.SVG_SPREADMETHOD_UNKNOWN");}

        @JSBody(script = "return SVGGradientElement.prototype")
        static SVGGradientElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGGradientElement()")
        static SVGGradientElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
