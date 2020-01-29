package js.web.webcomponents;

import org.teavm.jso.JSProperty;

import js.lang.Any;


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
