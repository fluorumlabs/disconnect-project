package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRtpUnhandled extends Any {
    @JSProperty
    @Nullable
    String getMuxId();

    @JSProperty
    void setMuxId(String muxId);

    @JSProperty
    int getPayloadType();

    @JSProperty
    void setPayloadType(int payloadType);

    @JSProperty
    int getSsrc();

    @JSProperty
    void setSsrc(int ssrc);

}
