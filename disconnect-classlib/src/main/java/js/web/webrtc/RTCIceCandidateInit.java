package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCIceCandidateInit extends Any {
    @JSProperty
    @Nullable
    String getCandidate();

    @JSProperty
    void setCandidate(String candidate);

    @JSProperty
    int getSdpMLineIndex();

    @JSProperty
    void setSdpMLineIndex(int sdpMLineIndex);

    @JSProperty
    @Nullable
    String getSdpMid();

    @JSProperty
    void setSdpMid(String sdpMid);

    @JSProperty
    @Nullable
    String getUsernameFragment();

    @JSProperty
    void setUsernameFragment(String usernameFragment);

}
