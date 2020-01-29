package js.web.webrtc;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCConfiguration extends Any {
    @JSProperty
    @Nullable
    RTCBundlePolicy getBundlePolicy();

    @JSProperty
    void setBundlePolicy(RTCBundlePolicy bundlePolicy);

    @JSProperty
    @Nullable
    Array<RTCCertificate> getCertificates();

    @JSProperty
    void setCertificates(@JSByRef RTCCertificate... certificates);

    @JSProperty
    void setCertificates(Array<RTCCertificate> certificates);

    @JSProperty
    int getIceCandidatePoolSize();

    @JSProperty
    void setIceCandidatePoolSize(int iceCandidatePoolSize);

    @JSProperty
    @Nullable
    Array<RTCIceServer> getIceServers();

    @JSProperty
    void setIceServers(@JSByRef RTCIceServer... iceServers);

    @JSProperty
    void setIceServers(Array<RTCIceServer> iceServers);

    @JSProperty
    @Nullable
    RTCIceTransportPolicy getIceTransportPolicy();

    @JSProperty
    void setIceTransportPolicy(RTCIceTransportPolicy iceTransportPolicy);

    @JSProperty
    @Nullable
    String getPeerIdentity();

    @JSProperty
    void setPeerIdentity(String peerIdentity);

    @JSProperty
    @Nullable
    RTCRtcpMuxPolicy getRtcpMuxPolicy();

    @JSProperty
    void setRtcpMuxPolicy(RTCRtcpMuxPolicy rtcpMuxPolicy);

}
