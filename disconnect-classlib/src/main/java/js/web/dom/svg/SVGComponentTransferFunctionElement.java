package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A base interface used by the component transfer function interfaces.
 */
public interface SVGComponentTransferFunctionElement extends SVGElement {
    @JSBody(script = "return SVGComponentTransferFunctionElement.prototype")
    static SVGComponentTransferFunctionElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGComponentTransferFunctionElement()")
    static SVGComponentTransferFunctionElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedNumber getAmplitude();

    @JSProperty
    SVGAnimatedNumber getExponent();

    @JSProperty
    SVGAnimatedNumber getIntercept();

    @JSProperty
    SVGAnimatedNumber getOffset();

    @JSProperty
    SVGAnimatedNumber getSlope();

    @JSProperty
    SVGAnimatedNumberList getTableValues();

    @JSProperty
    SVGAnimatedEnumeration<Type> getType();

    abstract class Type extends JsEnum {
        public static final Type SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE = JsEnum.from("SVGComponentTransferFunctionElement.SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE");

        public static final Type SVG_FECOMPONENTTRANSFER_TYPE_GAMMA = JsEnum.from("SVGComponentTransferFunctionElement.SVG_FECOMPONENTTRANSFER_TYPE_GAMMA");

        public static final Type SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY = JsEnum.from("SVGComponentTransferFunctionElement.SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY");

        public static final Type SVG_FECOMPONENTTRANSFER_TYPE_LINEAR = JsEnum.from("SVGComponentTransferFunctionElement.SVG_FECOMPONENTTRANSFER_TYPE_LINEAR");

        public static final Type SVG_FECOMPONENTTRANSFER_TYPE_TABLE = JsEnum.from("SVGComponentTransferFunctionElement.SVG_FECOMPONENTTRANSFER_TYPE_TABLE");

        public static final Type SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN = JsEnum.from("SVGComponentTransferFunctionElement.SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN");
    }

}
