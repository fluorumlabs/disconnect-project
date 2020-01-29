package js.web.webcrypto;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface Algorithm extends Any {
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

}
