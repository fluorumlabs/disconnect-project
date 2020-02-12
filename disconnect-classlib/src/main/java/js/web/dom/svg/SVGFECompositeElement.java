package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the <feComposite> element.
 */
public interface SVGFECompositeElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFECompositeElement.prototype")
    static SVGFECompositeElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFECompositeElement()")
    static SVGFECompositeElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedString getIn1();

    @JSProperty
    SVGAnimatedString getIn2();

    @JSProperty
    SVGAnimatedNumber getK1();

    @JSProperty
    SVGAnimatedNumber getK2();

    @JSProperty
    SVGAnimatedNumber getK3();

    @JSProperty
    SVGAnimatedNumber getK4();

    @JSProperty
    SVGAnimatedEnumeration<Operator> getOperator();

    abstract class Operator extends JsEnum {

        public static final Operator SVG_FECOMPOSITE_OPERATOR_ARITHMETIC = JsEnum.from("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_ARITHMETIC");


        public static final Operator SVG_FECOMPOSITE_OPERATOR_ATOP = JsEnum.from("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_ATOP");


        public static final Operator SVG_FECOMPOSITE_OPERATOR_IN = JsEnum.from("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_IN");


        public static final Operator SVG_FECOMPOSITE_OPERATOR_OUT = JsEnum.from("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_OUT");


        public static final Operator SVG_FECOMPOSITE_OPERATOR_OVER = JsEnum.from("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_OVER");

        public static final Operator SVG_FECOMPOSITE_OPERATOR_UNKNOWN = JsEnum.from("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_UNKNOWN");


        public static final Operator SVG_FECOMPOSITE_OPERATOR_XOR = JsEnum.from("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_XOR");
    }

}
