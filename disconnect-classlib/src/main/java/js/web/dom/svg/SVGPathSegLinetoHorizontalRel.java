package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegLinetoHorizontalRel extends SVGPathSeg {
    @JSBody(script = "return SVGPathSegLinetoHorizontalRel.prototype")
    static SVGPathSegLinetoHorizontalRel prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPathSegLinetoHorizontalRel()")
    static SVGPathSegLinetoHorizontalRel create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getX();

    @JSProperty
    void setX(double x);

}
