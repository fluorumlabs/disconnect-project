package js.web.webcomponents;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface ShadowRootInit extends Any {
    @JSProperty
    boolean isDelegatesFocus();

    @JSProperty
    void setDelegatesFocus(boolean delegatesFocus);

    @JSProperty
    ShadowRootMode getMode();

    @JSProperty
    void setMode(ShadowRootMode mode);

}
