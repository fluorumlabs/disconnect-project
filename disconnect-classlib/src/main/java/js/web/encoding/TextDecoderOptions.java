package js.web.encoding;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface TextDecoderOptions extends Any {
    @JSProperty
    boolean isFatal();

    @JSProperty
    void setFatal(boolean fatal);

    @JSProperty
    boolean isIgnoreBOM();

    @JSProperty
    void setIgnoreBOM(boolean ignoreBOM);

}
