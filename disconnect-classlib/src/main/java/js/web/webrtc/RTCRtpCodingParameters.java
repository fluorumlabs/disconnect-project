package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface RTCRtpCodingParameters extends Any {
    @JSProperty
    @Nullable
    String getRid();

    @JSProperty
    void setRid(String rid);

}
