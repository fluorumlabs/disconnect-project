package js.web.encoding;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
