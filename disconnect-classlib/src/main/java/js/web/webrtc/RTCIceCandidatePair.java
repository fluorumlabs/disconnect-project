package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


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
