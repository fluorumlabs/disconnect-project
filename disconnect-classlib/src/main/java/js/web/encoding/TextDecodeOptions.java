package js.web.encoding;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface TextDecodeOptions extends Any {
    @JSProperty
    boolean isStream();

    @JSProperty
    void setStream(boolean stream);

}
