package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
