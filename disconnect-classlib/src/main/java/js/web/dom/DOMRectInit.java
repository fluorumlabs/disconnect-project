package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface DOMRectInit extends Any {
    @JSProperty
    double getHeight();

    @JSProperty
    void setHeight(double height);

    @JSProperty
    double getWidth();

    @JSProperty
    void setWidth(double width);

    @JSProperty
    double getX();

    @JSProperty
    void setX(double x);

    @JSProperty
    double getY();

    @JSProperty
    void setY(double y);

}
