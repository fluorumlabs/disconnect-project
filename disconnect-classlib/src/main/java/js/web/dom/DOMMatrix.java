package js.web.dom;

import js.util.buffers.Float32Array;
import js.util.buffers.Float64Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;


public interface DOMMatrix extends DOMMatrixReadOnly {
    @JSBody(script = "return DOMMatrix.prototype")
    static DOMMatrix prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new DOMMatrix(init)")
    static DOMMatrix create(String init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new DOMMatrix(init)")
    static DOMMatrix create(double... init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMMatrix()")
    static DOMMatrix create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "array32", script = "return DOMMatrix.fromFloat32Array(array32)")
    static DOMMatrix fromFloat32Array(Float32Array array32) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "array64", script = "return DOMMatrix.fromFloat64Array(array64)")
    static DOMMatrix fromFloat64Array(Float64Array array64) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "other", script = "return DOMMatrix.fromMatrix(other)")
    static DOMMatrix fromMatrix(DOMMatrixInit other) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return DOMMatrix.fromMatrix()")
    static DOMMatrix fromMatrix() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getA();

    @JSProperty
    void setA(double a);

    @JSProperty
    double getB();

    @JSProperty
    void setB(double b);

    @JSProperty
    double getC();

    @JSProperty
    void setC(double c);

    @JSProperty
    double getD();

    @JSProperty
    void setD(double d);

    @JSProperty
    double getE();

    @JSProperty
    void setE(double e);

    @JSProperty
    double getF();

    @JSProperty
    void setF(double f);

    @JSProperty
    double getM11();

    @JSProperty
    void setM11(double m11);

    @JSProperty
    double getM12();

    @JSProperty
    void setM12(double m12);

    @JSProperty
    double getM13();

    @JSProperty
    void setM13(double m13);

    @JSProperty
    double getM14();

    @JSProperty
    void setM14(double m14);

    @JSProperty
    double getM21();

    @JSProperty
    void setM21(double m21);

    @JSProperty
    double getM22();

    @JSProperty
    void setM22(double m22);

    @JSProperty
    double getM23();

    @JSProperty
    void setM23(double m23);

    @JSProperty
    double getM24();

    @JSProperty
    void setM24(double m24);

    @JSProperty
    double getM31();

    @JSProperty
    void setM31(double m31);

    @JSProperty
    double getM32();

    @JSProperty
    void setM32(double m32);

    @JSProperty
    double getM33();

    @JSProperty
    void setM33(double m33);

    @JSProperty
    double getM34();

    @JSProperty
    void setM34(double m34);

    @JSProperty
    double getM41();

    @JSProperty
    void setM41(double m41);

    @JSProperty
    double getM42();

    @JSProperty
    void setM42(double m42);

    @JSProperty
    double getM43();

    @JSProperty
    void setM43(double m43);

    @JSProperty
    double getM44();

    @JSProperty
    void setM44(double m44);

    DOMMatrix invertSelf();

    DOMMatrix multiplySelf(DOMMatrixInit other);

    DOMMatrix multiplySelf();

    DOMMatrix preMultiplySelf(DOMMatrixInit other);

    DOMMatrix preMultiplySelf();

    DOMMatrix rotateAxisAngleSelf(double x, double y, double z, double angle);

    DOMMatrix rotateAxisAngleSelf(double x, double y, double z);

    DOMMatrix rotateAxisAngleSelf(double x, double y);

    DOMMatrix rotateAxisAngleSelf(double x);

    DOMMatrix rotateAxisAngleSelf();

    DOMMatrix rotateFromVectorSelf(double x, double y);

    DOMMatrix rotateFromVectorSelf(double x);

    DOMMatrix rotateFromVectorSelf();

    DOMMatrix rotateSelf(double rotX, double rotY, double rotZ);

    DOMMatrix rotateSelf(double rotX, double rotY);

    DOMMatrix rotateSelf(double rotX);

    DOMMatrix rotateSelf();

    DOMMatrix scale3dSelf(double scale, double originX, double originY, double originZ);

    DOMMatrix scale3dSelf(double scale, double originX, double originY);

    DOMMatrix scale3dSelf(double scale, double originX);

    DOMMatrix scale3dSelf(double scale);

    DOMMatrix scale3dSelf();

    DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX, double originY, double originZ);

    DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX, double originY);

    DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX);

    DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ);

    DOMMatrix scaleSelf(double scaleX, double scaleY);

    DOMMatrix scaleSelf(double scaleX);

    DOMMatrix scaleSelf();

    DOMMatrix setMatrixValue(String transformList);

    DOMMatrix skewXSelf(double sx);

    DOMMatrix skewXSelf();

    DOMMatrix skewYSelf(double sy);

    DOMMatrix skewYSelf();

    DOMMatrix translateSelf(double tx, double ty, double tz);

    DOMMatrix translateSelf(double tx, double ty);

    DOMMatrix translateSelf(double tx);

    DOMMatrix translateSelf();
}
