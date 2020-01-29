package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegCurvetoQuadraticRel extends SVGPathSeg {
    @JSBody(script = "return SVGPathSegCurvetoQuadraticRel.prototype")
    static SVGPathSegCurvetoQuadraticRel prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPathSegCurvetoQuadraticRel()")
    static SVGPathSegCurvetoQuadraticRel create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getX();

    @JSProperty
    void setX(double x);

    @JSProperty
    double getX1();

    @JSProperty
    void setX1(double x1);

    @JSProperty
    double getY();

    @JSProperty
    void setY(double y);

    @JSProperty
    double getY1();

    @JSProperty
    void setY1(double y1);

}
