package js.web.encoding;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface TextDecodeOptions extends Any {
    @JSProperty
    boolean isStream();

    @JSProperty
    void setStream(boolean stream);

}
