package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface DOMPointReadOnly extends Any {
    @JSBody(script = "return DOMPointReadOnly.prototype")
    static DOMPointReadOnly prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMPointReadOnly()")
    static DOMPointReadOnly create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"x", "y", "z", "w"}, script = "return new DOMPointReadOnly(x,y,z,w)")
    static DOMPointReadOnly create(double x, double y, double z, double w) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"x", "y", "z"}, script = "return new DOMPointReadOnly(x,y,z)")
    static DOMPointReadOnly create(double x, double y, double z) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"x", "y"}, script = "return new DOMPointReadOnly(x,y)")
    static DOMPointReadOnly create(double x, double y) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"x"}, script = "return new DOMPointReadOnly(x)")
    static DOMPointReadOnly create(double x) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"other"}, script = "return DOMPointReadOnly.fromPoint(other)")
    static DOMPointReadOnly fromPoint(DOMPointInit other) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return DOMPointReadOnly.fromPoint()")
    static DOMPointReadOnly fromPoint() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getW();

    @JSProperty
    double getX();

    @JSProperty
    double getY();

    @JSProperty
    double getZ();

    DOMPoint matrixTransform(DOMMatrixInit matrix);

    DOMPoint matrixTransform();

    Any toJSON();

}
