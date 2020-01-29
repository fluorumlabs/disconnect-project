package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection.
 */
public interface RTCIceCandidate extends Any {
    @JSBody(script = "return RTCIceCandidate.prototype")
    static RTCIceCandidate prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCIceCandidate()")
    static RTCIceCandidate create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "candidateInitDict", script = "return new RTCIceCandidate(candidateInitDict)")
    static RTCIceCandidate create(RTCIceCandidateInit candidateInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getCandidate();

    @JSProperty
    @Nullable
    RTCIceComponent getComponent();

    @JSProperty
    @Nullable
    String getFoundation();

    @JSProperty
    @Nullable
    String getIp();

    @JSProperty
    @Nullable
    int getPort();

    @JSProperty
    @Nullable
    int getPriority();

    @JSProperty
    @Nullable
    RTCIceProtocol getProtocol();

    @JSProperty
    @Nullable
    String getRelatedAddress();

    @JSProperty
    @Nullable
    int getRelatedPort();

    @JSProperty
    @Nullable
    int getSdpMLineIndex();

    @JSProperty
    @Nullable
    String getSdpMid();

    @JSProperty
    @Nullable
    RTCIceTcpCandidateType getTcpType();

    @JSProperty
    @Nullable
    RTCIceCandidateType getType();

    @JSProperty
    @Nullable
    String getUsernameFragment();

    RTCIceCandidateInit toJSON();

}
