package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the <feBlend> element.
 */
public interface SVGFEBlendElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEBlendElement.prototype")
    static SVGFEBlendElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEBlendElement()")
    static SVGFEBlendElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedString getIn1();

    @JSProperty
    SVGAnimatedString getIn2();

    @JSProperty
    SVGAnimatedEnumeration getMode();

    abstract class Mode extends JsEnum {
        public static final Mode SVG_FEBLEND_MODE_COLOR = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_COLOR");


        public static final Mode SVG_FEBLEND_MODE_COLOR_BURN = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_COLOR_BURN");


        public static final Mode SVG_FEBLEND_MODE_COLOR_DODGE = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_COLOR_DODGE");


        public static final Mode SVG_FEBLEND_MODE_DARKEN = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_DARKEN");

        public static final Mode SVG_FEBLEND_MODE_DIFFERENCE = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_DIFFERENCE");


        public static final Mode SVG_FEBLEND_MODE_EXCLUSION = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_EXCLUSION");

        public static final Mode SVG_FEBLEND_MODE_HARD_LIGHT = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_HARD_LIGHT");


        public static final Mode SVG_FEBLEND_MODE_HUE = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_HUE");


        public static final Mode SVG_FEBLEND_MODE_LIGHTEN = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_LIGHTEN");

        public static final Mode SVG_FEBLEND_MODE_LUMINOSITY = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_LUMINOSITY");


        public static final Mode SVG_FEBLEND_MODE_MULTIPLY = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_MULTIPLY");


        public static final Mode SVG_FEBLEND_MODE_NORMAL = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_NORMAL");


        public static final Mode SVG_FEBLEND_MODE_OVERLAY = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_OVERLAY");


        public static final Mode SVG_FEBLEND_MODE_SATURATION = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_SATURATION");


        public static final Mode SVG_FEBLEND_MODE_SCREEN = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_SCREEN");


        public static final Mode SVG_FEBLEND_MODE_SOFT_LIGHT = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_SOFT_LIGHT");


        public static final Mode SVG_FEBLEND_MODE_UNKNOWN = JsEnum.from("return SVGFEBlendElement.SVG_FEBLEND_MODE_UNKNOWN");
    }

}
