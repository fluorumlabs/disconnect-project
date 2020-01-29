package js.web.dom;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface FocusNavigationOrigin extends Any {
    @JSProperty
    double getOriginHeight();

    @JSProperty
    void setOriginHeight(double originHeight);

    @JSProperty
    double getOriginLeft();

    @JSProperty
    void setOriginLeft(double originLeft);

    @JSProperty
    double getOriginTop();

    @JSProperty
    void setOriginTop(double originTop);

    @JSProperty
    double getOriginWidth();

    @JSProperty
    void setOriginWidth(double originWidth);

}
