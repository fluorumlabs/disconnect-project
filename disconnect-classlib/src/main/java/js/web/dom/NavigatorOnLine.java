package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface NavigatorOnLine extends Any {
    @JSProperty
    boolean isOnLine();

}
