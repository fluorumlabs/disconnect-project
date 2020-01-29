package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Corresponds to the <feColorMatrix> element. */
        public interface SVGFEColorMatrixElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
        @JSProperty
        SVGAnimatedString getIn1();

        @JSProperty
        SVGAnimatedEnumeration<Type> getType();

        @JSProperty
        SVGAnimatedNumberList getValues();

        abstract class Type extends JsEnum {
        public static final Type SVG_FECOLORMATRIX_TYPE_HUEROTATE = JsEnum.from("return SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_HUEROTATE");


        public static final Type SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA = JsEnum.from("return SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA");


        public static final Type SVG_FECOLORMATRIX_TYPE_MATRIX = JsEnum.from("return SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_MATRIX");


        public static final Type SVG_FECOLORMATRIX_TYPE_SATURATE = JsEnum.from("return SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_SATURATE");


        public static final Type SVG_FECOLORMATRIX_TYPE_UNKNOWN = JsEnum.from("return SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_UNKNOWN");}

        @JSBody(script = "return SVGFEColorMatrixElement.prototype")
        static SVGFEColorMatrixElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGFEColorMatrixElement()")
        static SVGFEColorMatrixElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
