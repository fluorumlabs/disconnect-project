package js.web.dom;


import org.teavm.jso.JSProperty;


public interface ScrollToOptions extends ScrollOptions {
    @JSProperty
    double getLeft();

    @JSProperty
    void setLeft(double left);

    @JSProperty
    double getTop();

    @JSProperty
    void setTop(double top);

}
