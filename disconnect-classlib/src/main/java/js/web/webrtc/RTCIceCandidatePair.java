package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCIceCandidatePair extends Any {
    @JSProperty
    @Nullable
    RTCIceCandidate getLocal();

    @JSProperty
    void setLocal(RTCIceCandidate local);

    @JSProperty
    @Nullable
    RTCIceCandidate getRemote();

    @JSProperty
    void setRemote(RTCIceCandidate remote);

}
