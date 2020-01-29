package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegCurvetoQuadraticSmoothAbs extends SVGPathSeg {
    @JSBody(script = "return SVGPathSegCurvetoQuadraticSmoothAbs.prototype")
    static SVGPathSegCurvetoQuadraticSmoothAbs prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPathSegCurvetoQuadraticSmoothAbs()")
    static SVGPathSegCurvetoQuadraticSmoothAbs create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getX();

    @JSProperty
    void setX(double x);

    @JSProperty
    double getY();

    @JSProperty
    void setY(double y);

}
