package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the <feTurbulence> element.
 */
public interface SVGFETurbulenceElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFETurbulenceElement.prototype")
    static SVGFETurbulenceElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFETurbulenceElement()")
    static SVGFETurbulenceElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedNumber getBaseFrequencyX();

    @JSProperty
    SVGAnimatedNumber getBaseFrequencyY();

    @JSProperty
    SVGAnimatedInteger getNumOctaves();

    @JSProperty
    SVGAnimatedNumber getSeed();

    @JSProperty
    SVGAnimatedEnumeration<StitchType> getStitchTiles();

    @JSProperty
    SVGAnimatedEnumeration<Type> getType();

    abstract class StitchType extends JsEnum {
        public static final StitchType SVG_STITCHTYPE_NOSTITCH = JsEnum.from("SVGFETurbulenceElement.SVG_STITCHTYPE_NOSTITCH");


        public static final StitchType SVG_STITCHTYPE_STITCH = JsEnum.from("SVGFETurbulenceElement.SVG_STITCHTYPE_STITCH");


        public static final StitchType SVG_STITCHTYPE_UNKNOWN = JsEnum.from("SVGFETurbulenceElement.SVG_STITCHTYPE_UNKNOWN");
    }

    abstract class Type extends JsEnum {
        public static final Type SVG_TURBULENCE_TYPE_FRACTALNOISE = JsEnum.from("SVGFETurbulenceElement.SVG_TURBULENCE_TYPE_FRACTALNOISE");


        public static final Type SVG_TURBULENCE_TYPE_TURBULENCE = JsEnum.from("SVGFETurbulenceElement.SVG_TURBULENCE_TYPE_TURBULENCE");


        public static final Type SVG_TURBULENCE_TYPE_UNKNOWN = JsEnum.from("SVGFETurbulenceElement.SVG_TURBULENCE_TYPE_UNKNOWN");
    }

}
