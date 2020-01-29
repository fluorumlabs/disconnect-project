package js.web.encoding;

import org.teavm.jso.JSProperty;

import js.lang.Any;


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
