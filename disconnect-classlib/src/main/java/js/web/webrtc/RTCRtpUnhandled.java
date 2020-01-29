package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


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
