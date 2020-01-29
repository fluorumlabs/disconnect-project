package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ScrollOptions extends Any {
    @JSProperty
    @Nullable
    ScrollBehavior getBehavior();

    @JSProperty
    void setBehavior(ScrollBehavior behavior);

}
