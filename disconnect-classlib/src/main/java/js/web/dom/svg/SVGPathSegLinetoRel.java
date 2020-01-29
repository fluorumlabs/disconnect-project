package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegLinetoRel extends SVGPathSeg {
    @JSBody(script = "return SVGPathSegLinetoRel.prototype")
    static SVGPathSegLinetoRel prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPathSegLinetoRel()")
    static SVGPathSegLinetoRel create() {
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
