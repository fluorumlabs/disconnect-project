package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface RTCSessionDescriptionInit extends Any {
    @JSProperty
    @Nullable
    String getSdp();

    @JSProperty
    void setSdp(String sdp);

    @JSProperty
    RTCSdpType getType();

    @JSProperty
    void setType(RTCSdpType type);

}
