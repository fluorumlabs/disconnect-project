package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRtpCodingParameters extends Any {
    @JSProperty
    @Nullable
    String getRid();

    @JSProperty
    void setRid(String rid);

}
