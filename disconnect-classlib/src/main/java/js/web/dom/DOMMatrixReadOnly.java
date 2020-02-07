package js.web.dom;

import js.lang.Any;
import js.util.buffers.Float32Array;
import js.util.buffers.Float64Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;


public interface DOMMatrixReadOnly extends Any {
    @JSBody(script = "return DOMMatrixReadOnly.prototype")
    static DOMMatrixReadOnly prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new DOMMatrixReadOnly(init)")
    static DOMMatrixReadOnly create(String init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new DOMMatrixReadOnly(init)")
    static DOMMatrixReadOnly create(double... init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMMatrixReadOnly()")
    static DOMMatrixReadOnly create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "array32", script = "return DOMMatrixReadOnly.fromFloat32Array(array32)")
    static DOMMatrixReadOnly fromFloat32Array(Float32Array array32) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "array64", script = "return DOMMatrixReadOnly.fromFloat64Array(array64)")
    static DOMMatrixReadOnly fromFloat64Array(Float64Array array64) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "other", script = "return DOMMatrixReadOnly.fromMatrix(other)")
    static DOMMatrixReadOnly fromMatrix(DOMMatrixInit other) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return DOMMatrixReadOnly.fromMatrix()")
    static DOMMatrixReadOnly fromMatrix() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getA();

    @JSProperty
    double getB();

    @JSProperty
    double getC();

    @JSProperty
    double getD();

    @JSProperty
    double getE();

    @JSProperty
    double getF();

    @JSProperty
    boolean isIs2D();

    @JSProperty
    boolean isIsIdentity();

    @JSProperty
    double getM11();

    @JSProperty
    double getM12();

    @JSProperty
    double getM13();

    @JSProperty
    double getM14();

    @JSProperty
    double getM21();

    @JSProperty
    double getM22();

    @JSProperty
    double getM23();

    @JSProperty
    double getM24();

    @JSProperty
    double getM31();

    @JSProperty
    double getM32();

    @JSProperty
    double getM33();

    @JSProperty
    double getM34();

    @JSProperty
    double getM41();

    @JSProperty
    double getM42();

    @JSProperty
    double getM43();

    @JSProperty
    double getM44();

    DOMMatrix flipX();

    DOMMatrix flipY();

    DOMMatrix inverse();

    DOMMatrix multiply(DOMMatrixInit other);

    DOMMatrix multiply();

    DOMMatrix rotate(double rotX, double rotY, double rotZ);

    DOMMatrix rotate(double rotX, double rotY);

    DOMMatrix rotate(double rotX);

    DOMMatrix rotate();

    DOMMatrix rotateAxisAngle(double x, double y, double z, double angle);

    DOMMatrix rotateAxisAngle(double x, double y, double z);

    DOMMatrix rotateAxisAngle(double x, double y);

    DOMMatrix rotateAxisAngle(double x);

    DOMMatrix rotateAxisAngle();

    DOMMatrix rotateFromVector(double x, double y);

    DOMMatrix rotateFromVector(double x);

    DOMMatrix rotateFromVector();

    DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX, double originY, double originZ);

    DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX, double originY);

    DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX);

    DOMMatrix scale(double scaleX, double scaleY, double scaleZ);

    DOMMatrix scale(double scaleX, double scaleY);

    DOMMatrix scale(double scaleX);

    DOMMatrix scale();

    DOMMatrix scale3d(double scale, double originX, double originY, double originZ);

    DOMMatrix scale3d(double scale, double originX, double originY);

    DOMMatrix scale3d(double scale, double originX);

    DOMMatrix scale3d(double scale);

    DOMMatrix scale3d();

    @Deprecated
    DOMMatrix scaleNonUniform(double scaleX, double scaleY);

    @Deprecated
    DOMMatrix scaleNonUniform(double scaleX);

    @Deprecated
    DOMMatrix scaleNonUniform();

    DOMMatrix skewX(double sx);

    DOMMatrix skewX();

    DOMMatrix skewY(double sy);

    DOMMatrix skewY();

    Float32Array toFloat32Array();

    Float64Array toFloat64Array();

    Any toJSON();

    DOMPoint transformPoint(DOMPointInit point);

    DOMPoint transformPoint();

    DOMMatrix translate(double tx, double ty, double tz);

    DOMMatrix translate(double tx, double ty);

    DOMMatrix translate(double tx);

    DOMMatrix translate();

}
