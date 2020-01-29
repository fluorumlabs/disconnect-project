package js.web.encoding;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface TextEncoderEncodeIntoResult extends Any {
    @JSProperty
    int getRead();

    @JSProperty
    void setRead(int read);

    @JSProperty
    int getWritten();

    @JSProperty
    void setWritten(int written);

}
