package js.web.dom;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface EventListenerOptions extends Any {
    @JSProperty
    boolean isCapture();

    @JSProperty
    void setCapture(boolean capture);

}
