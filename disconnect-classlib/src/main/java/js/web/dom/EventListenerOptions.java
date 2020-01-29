package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface EventListenerOptions extends Any {
    @JSProperty
    boolean isCapture();

    @JSProperty
    void setCapture(boolean capture);

}
