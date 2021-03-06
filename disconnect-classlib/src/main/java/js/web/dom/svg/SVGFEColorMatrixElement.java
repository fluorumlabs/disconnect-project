package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;feColorMatrix&gt; element.
 */
public interface SVGFEColorMatrixElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEColorMatrixElement.prototype")
    static SVGFEColorMatrixElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEColorMatrixElement()")
    static SVGFEColorMatrixElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedString getIn1();

    @JSProperty
    SVGAnimatedEnumeration<Type> getType();

    @JSProperty
    SVGAnimatedNumberList getValues();

    abstract class Type extends JsEnum {
        public static final Type SVG_FECOLORMATRIX_TYPE_HUEROTATE = JsEnum.from("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_HUEROTATE");


        public static final Type SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA = JsEnum.from("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA");


        public static final Type SVG_FECOLORMATRIX_TYPE_MATRIX = JsEnum.from("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_MATRIX");


        public static final Type SVG_FECOLORMATRIX_TYPE_SATURATE = JsEnum.from("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_SATURATE");


        public static final Type SVG_FECOLORMATRIX_TYPE_UNKNOWN = JsEnum.from("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_UNKNOWN");
    }

}
