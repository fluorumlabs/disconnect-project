package js.web.dom;

import org.teavm.jso.JSProperty;


public interface DOMMatrixInit extends DOMMatrix2DInit {
    @JSProperty
    boolean isIs2D();

    @JSProperty
    void setIs2D(boolean is2D);

    @JSProperty
    double getM13();

    @JSProperty
    void setM13(double m13);

    @JSProperty
    double getM14();

    @JSProperty
    void setM14(double m14);

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
    double getM43();

    @JSProperty
    void setM43(double m43);

    @JSProperty
    double getM44();

    @JSProperty
    void setM44(double m44);

}
