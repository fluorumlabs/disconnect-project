package js.web.console;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface WindowConsole extends Any {
    @JSProperty
    Console getConsole();

}
