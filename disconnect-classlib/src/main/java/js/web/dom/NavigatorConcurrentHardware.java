package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface NavigatorConcurrentHardware extends Any {
    @JSProperty
    int getHardwareConcurrency();

}
