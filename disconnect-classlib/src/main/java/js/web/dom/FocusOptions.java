package js.web.dom;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface FocusOptions extends Any {
    @JSProperty
    boolean isPreventScroll();

    @JSProperty
    void setPreventScroll(boolean preventScroll);

}
