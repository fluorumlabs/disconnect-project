package js.web.dom;

import org.teavm.jso.JSProperty;


public interface AddEventListenerOptions extends EventListenerOptions {
    @JSProperty
    boolean isOnce();

    @JSProperty
    void setOnce(boolean once);

    @JSProperty
    boolean isPassive();

    @JSProperty
    void setPassive(boolean passive);
}
