package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the <feMorphology> element.
 */
public interface SVGFEMorphologyElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEMorphologyElement.prototype")
    static SVGFEMorphologyElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEMorphologyElement()")
    static SVGFEMorphologyElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedString getIn1();

    @JSProperty
    SVGAnimatedEnumeration getOperator();

    @JSProperty
    SVGAnimatedNumber getRadiusX();

    @JSProperty
    SVGAnimatedNumber getRadiusY();

    abstract class Operator extends JsEnum {

        public static final Operator SVG_MORPHOLOGY_OPERATOR_DILATE = JsEnum.from("SVGFEMorphologyElement.SVG_MORPHOLOGY_OPERATOR_DILATE");


        public static final Operator SVG_MORPHOLOGY_OPERATOR_ERODE = JsEnum.from("SVGFEMorphologyElement.SVG_MORPHOLOGY_OPERATOR_ERODE");


        public static final Operator SVG_MORPHOLOGY_OPERATOR_UNKNOWN = JsEnum.from("SVGFEMorphologyElement.SVG_MORPHOLOGY_OPERATOR_UNKNOWN");
    }

}
