package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegMovetoAbs extends SVGPathSeg {
    @JSBody(script = "return SVGPathSegMovetoAbs.prototype")
    static SVGPathSegMovetoAbs prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPathSegMovetoAbs()")
    static SVGPathSegMovetoAbs create() {
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
