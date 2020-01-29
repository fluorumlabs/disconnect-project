package js.web.canvas;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface CanvasShadowStyles extends Any {
    @JSProperty
    double getShadowBlur();

    @JSProperty
    void setShadowBlur(double shadowBlur);

    @JSProperty
    String getShadowColor();

    @JSProperty
    void setShadowColor(String shadowColor);

    @JSProperty
    double getShadowOffsetX();

    @JSProperty
    void setShadowOffsetX(double shadowOffsetX);

    @JSProperty
    double getShadowOffsetY();

    @JSProperty
    void setShadowOffsetY(double shadowOffsetY);

}
