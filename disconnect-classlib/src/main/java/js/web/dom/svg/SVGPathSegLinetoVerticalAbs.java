package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegLinetoVerticalAbs extends SVGPathSeg {
    @JSBody(script = "return SVGPathSegLinetoVerticalAbs.prototype")
    static SVGPathSegLinetoVerticalAbs prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPathSegLinetoVerticalAbs()")
    static SVGPathSegLinetoVerticalAbs create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getY();

    @JSProperty
    void setY(double y);

}
