package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the <path> element.
 */
public interface SVGPathElement extends SVGGraphicsElement {
    @JSBody(script = "return SVGPathElement.prototype")
    static SVGPathElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPathElement()")
    static SVGPathElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    SVGPathSegList getPathSegList();

    @Deprecated
    SVGPathSegArcAbs createSVGPathSegArcAbs(double x, double y, double r1, double r2, double angle, boolean largeArcFlag, boolean sweepFlag);

    @Deprecated
    SVGPathSegArcRel createSVGPathSegArcRel(double x, double y, double r1, double r2, double angle, boolean largeArcFlag, boolean sweepFlag);

    @Deprecated
    SVGPathSegClosePath createSVGPathSegClosePath();

    @Deprecated
    SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(double x, double y, double x1, double y1, double x2, double y2);

    @Deprecated
    SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(double x, double y, double x1, double y1, double x2, double y2);

    @Deprecated
    SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(double x, double y, double x2, double y2);

    @Deprecated
    SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(double x, double y, double x2, double y2);

    @Deprecated
    SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(double x, double y, double x1, double y1);

    @Deprecated
    SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(double x, double y, double x1, double y1);

    @Deprecated
    SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(double x, double y);

    @Deprecated
    SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(double x, double y);

    @Deprecated
    SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(double x, double y);

    @Deprecated
    SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(double x);

    @Deprecated
    SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(double x);

    @Deprecated
    SVGPathSegLinetoRel createSVGPathSegLinetoRel(double x, double y);

    @Deprecated
    SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(double y);

    @Deprecated
    SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(double y);

    @Deprecated
    SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(double x, double y);

    @Deprecated
    SVGPathSegMovetoRel createSVGPathSegMovetoRel(double x, double y);

    @Deprecated
    double getPathSegAtLength(double distance);

    SVGPoint getPointAtLength(double distance);

    double getTotalLength();

}
