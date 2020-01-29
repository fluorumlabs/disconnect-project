package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


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
