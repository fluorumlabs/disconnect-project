package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface FocusOptions extends Any {
    @JSProperty
    boolean isPreventScroll();

    @JSProperty
    void setPreventScroll(boolean preventScroll);

}
