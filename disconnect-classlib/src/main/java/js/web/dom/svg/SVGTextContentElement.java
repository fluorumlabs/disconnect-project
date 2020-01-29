package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement.
 */
public interface SVGTextContentElement extends SVGGraphicsElement {
    @JSBody(script = "return SVGTextContentElement.prototype")
    static SVGTextContentElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGTextContentElement()")
    static SVGTextContentElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedEnumeration<LengthAdjust> getLengthAdjust();

    @JSProperty
    SVGAnimatedLength getTextLength();

    int getCharNumAtPosition(SVGPoint point);

    double getComputedTextLength();

    SVGPoint getEndPositionOfChar(int charnum);

    SVGRect getExtentOfChar(int charnum);

    int getNumberOfChars();

    double getRotationOfChar(int charnum);

    SVGPoint getStartPositionOfChar(int charnum);

    double getSubStringLength(int charnum, int nchars);

    void selectSubString(int charnum, int nchars);

    abstract class LengthAdjust extends JsEnum {
        public static final LengthAdjust LENGTHADJUST_SPACING = JsEnum.from("return SVGTextContentElement.LENGTHADJUST_SPACING");


        public static final LengthAdjust LENGTHADJUST_SPACINGANDGLYPHS = JsEnum.from("return SVGTextContentElement.LENGTHADJUST_SPACINGANDGLYPHS");


        public static final LengthAdjust LENGTHADJUST_UNKNOWN = JsEnum.from("return SVGTextContentElement.LENGTHADJUST_UNKNOWN");
    }

}
