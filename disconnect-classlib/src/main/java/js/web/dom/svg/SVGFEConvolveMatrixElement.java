package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;feConvolveMatrix&gt; element.
 */
public interface SVGFEConvolveMatrixElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEConvolveMatrixElement.prototype")
    static SVGFEConvolveMatrixElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEConvolveMatrixElement()")
    static SVGFEConvolveMatrixElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedNumber getBias();

    @JSProperty
    SVGAnimatedNumber getDivisor();

    @JSProperty
    SVGAnimatedEnumeration<EdgeMode> getEdgeMode();

    @JSProperty
    SVGAnimatedString getIn1();

    @JSProperty
    SVGAnimatedNumberList getKernelMatrix();

    @JSProperty
    SVGAnimatedNumber getKernelUnitLengthX();

    @JSProperty
    SVGAnimatedNumber getKernelUnitLengthY();

    @JSProperty
    SVGAnimatedInteger getOrderX();

    @JSProperty
    SVGAnimatedInteger getOrderY();

    @JSProperty
    SVGAnimatedBoolean getPreserveAlpha();

    @JSProperty
    SVGAnimatedInteger getTargetX();

    @JSProperty
    SVGAnimatedInteger getTargetY();

    abstract class EdgeMode extends JsEnum {
        public static final EdgeMode SVG_EDGEMODE_DUPLICATE = JsEnum.from("SVGFEConvolveMatrixElement.SVG_EDGEMODE_DUPLICATE");


        public static final EdgeMode SVG_EDGEMODE_NONE = JsEnum.from("SVGFEConvolveMatrixElement.SVG_EDGEMODE_NONE");


        public static final EdgeMode SVG_EDGEMODE_UNKNOWN = JsEnum.from("SVGFEConvolveMatrixElement.SVG_EDGEMODE_UNKNOWN");


        public static final EdgeMode SVG_EDGEMODE_WRAP = JsEnum.from("SVGFEConvolveMatrixElement.SVG_EDGEMODE_WRAP");
    }

}
