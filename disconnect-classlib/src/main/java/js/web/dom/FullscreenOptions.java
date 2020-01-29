package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface FullscreenOptions extends Any {
    @JSProperty
    @Nullable
    FullscreenNavigationUI getNavigationUI();

    @JSProperty
    void setNavigationUI(FullscreenNavigationUI navigationUI);

}
