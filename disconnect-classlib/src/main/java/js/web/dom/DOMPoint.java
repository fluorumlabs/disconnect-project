package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface DOMPoint extends DOMPointReadOnly {
    @JSBody(script = "return DOMPoint.prototype")
    static DOMPoint prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMPoint()")
    static DOMPoint create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"x", "y", "z", "w"}, script = "return new DOMPoint(x,y,z,w)")
    static DOMPoint create(double x, double y, double z, double w) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"x", "y", "z"}, script = "return new DOMPoint(x,y,z)")
    static DOMPoint create(double x, double y, double z) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"x", "y"}, script = "return new DOMPoint(x,y)")
    static DOMPoint create(double x, double y) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"x"}, script = "return new DOMPoint(x)")
    static DOMPoint create(double x) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"other"}, script = "return DOMPoint.fromPoint(other)")
    static DOMPoint fromPoint(DOMPointInit other) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return DOMPoint.fromPoint()")
    static DOMPoint fromPoint() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getW();

    @JSProperty
    void setW(double w);

    @JSProperty
    double getX();

    @JSProperty
    void setX(double x);

    @JSProperty
    double getY();

    @JSProperty
    void setY(double y);

    @JSProperty
    double getZ();

    @JSProperty
    void setZ(double z);

}
