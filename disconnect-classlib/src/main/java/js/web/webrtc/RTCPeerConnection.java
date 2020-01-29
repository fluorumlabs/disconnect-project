package js.web.webrtc;

import js.lang.Promise;
import js.lang.StringPromise;
import js.lang.VoidPromise;
import js.util.collections.Array;
import js.web.dom.*;
import js.web.mediastreams.MediaStream;
import js.web.mediastreams.MediaStreamTrack;
import js.web.webcrypto.Algorithm;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A WebRTC connection between the local computer and a remote peer. It provides methods to connect to a remote peer, maintain and monitor the connection, and close the connection once it's no longer needed.
 */
public interface RTCPeerConnection extends EventTarget {
    @JSBody(script = "return RTCPeerConnection.prototype")
    static RTCPeerConnection prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCPeerConnection()")
    static RTCPeerConnection create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "configuration", script = "return new RTCPeerConnection(configuration)")
    static RTCPeerConnection create(RTCConfiguration configuration) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "keygenAlgorithm", script = "return RTCPeerConnection.generateCertificate(configuration)")
    static Promise<RTCCertificate> generateCertificate(String keygenAlgorithm) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "keygenAlgorithm", script = "return RTCPeerConnection.generateCertificate(configuration)")
    static Promise<RTCCertificate> generateCertificate(Algorithm keygenAlgorithm) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return RTCPeerConnection.getDefaultIceServers()")
    static Array<RTCIceServer> getDefaultIceServers() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isCanTrickleIceCandidates();

    @JSProperty
    RTCPeerConnectionState getConnectionState();

    @JSProperty
    @Nullable
    RTCSessionDescription getCurrentLocalDescription();

    @JSProperty
    @Nullable
    RTCSessionDescription getCurrentRemoteDescription();

    @JSProperty
    RTCIceConnectionState getIceConnectionState();

    @JSProperty
    RTCIceGatheringState getIceGatheringState();

    @JSProperty
    @Nullable
    String getIdpErrorInfo();

    @JSProperty
    @Nullable
    String getIdpLoginUrl();

    @JSProperty
    @Nullable
    RTCSessionDescription getLocalDescription();

    @JSProperty
    @Nullable
    EventListener<Event> getOnconnectionstatechange();

    @JSProperty
    void setOnconnectionstatechange(EventListener<Event> onconnectionstatechange);

    default void addConnectionStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("connectionstatechange", listener, options);
    }

    default void addConnectionStateChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("connectionstatechange", listener, options);
    }

    default void addConnectionStateChangeEventListener(EventListener<Event> listener) {
        addEventListener("connectionstatechange", listener);
    }

    default void removeConnectionStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("connectionstatechange", listener, options);
    }

    default void removeConnectionStateChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("connectionstatechange", listener, options);
    }

    default void removeConnectionStateChangeEventListener(EventListener<Event> listener) {
        removeEventListener("connectionstatechange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<RTCDataChannelEvent> getOndatachannel();

    @JSProperty
    void setOndatachannel(EventListener<RTCDataChannelEvent> ondatachannel);

    default void addDataChannelEventListener(EventListener<RTCDataChannelEvent> listener, AddEventListenerOptions options) {
        addEventListener("datachannel", listener, options);
    }

    default void addDataChannelEventListener(EventListener<RTCDataChannelEvent> listener, boolean options) {
        addEventListener("datachannel", listener, options);
    }

    default void addDataChannelEventListener(EventListener<RTCDataChannelEvent> listener) {
        addEventListener("datachannel", listener);
    }

    default void removeDataChannelEventListener(EventListener<RTCDataChannelEvent> listener, EventListenerOptions options) {
        removeEventListener("datachannel", listener, options);
    }

    default void removeDataChannelEventListener(EventListener<RTCDataChannelEvent> listener, boolean options) {
        removeEventListener("datachannel", listener, options);
    }

    default void removeDataChannelEventListener(EventListener<RTCDataChannelEvent> listener) {
        removeEventListener("datachannel", listener);
    }

    @JSProperty
    @Nullable
    EventListener<RTCPeerConnectionIceEvent> getOnicecandidate();

    @JSProperty
    void setOnicecandidate(EventListener<RTCPeerConnectionIceEvent> onicecandidate);

    default void addIceCandidateEventListener(EventListener<RTCPeerConnectionIceEvent> listener, AddEventListenerOptions options) {
        addEventListener("icecandidate", listener, options);
    }

    default void addIceCandidateEventListener(EventListener<RTCPeerConnectionIceEvent> listener, boolean options) {
        addEventListener("icecandidate", listener, options);
    }

    default void addIceCandidateEventListener(EventListener<RTCPeerConnectionIceEvent> listener) {
        addEventListener("icecandidate", listener);
    }

    default void removeIceCandidateEventListener(EventListener<RTCPeerConnectionIceEvent> listener, EventListenerOptions options) {
        removeEventListener("icecandidate", listener, options);
    }

    default void removeIceCandidateEventListener(EventListener<RTCPeerConnectionIceEvent> listener, boolean options) {
        removeEventListener("icecandidate", listener, options);
    }

    default void removeIceCandidateEventListener(EventListener<RTCPeerConnectionIceEvent> listener) {
        removeEventListener("icecandidate", listener);
    }

    @JSProperty
    @Nullable
    EventListener<RTCPeerConnectionIceErrorEvent> getOnicecandidateerror();

    @JSProperty
    void setOnicecandidateerror(EventListener<RTCPeerConnectionIceErrorEvent> onicecandidateerror);

    default void addIceCandidateErrorEventListener(EventListener<RTCPeerConnectionIceErrorEvent> listener, AddEventListenerOptions options) {
        addEventListener("icecandidateerror", listener, options);
    }

    default void addIceCandidateErrorEventListener(EventListener<RTCPeerConnectionIceErrorEvent> listener, boolean options) {
        addEventListener("icecandidateerror", listener, options);
    }

    default void addIceCandidateErrorEventListener(EventListener<RTCPeerConnectionIceErrorEvent> listener) {
        addEventListener("icecandidateerror", listener);
    }

    default void removeIceCandidateErrorEventListener(EventListener<RTCPeerConnectionIceErrorEvent> listener, EventListenerOptions options) {
        removeEventListener("icecandidateerror", listener, options);
    }

    default void removeIceCandidateErrorEventListener(EventListener<RTCPeerConnectionIceErrorEvent> listener, boolean options) {
        removeEventListener("icecandidateerror", listener, options);
    }

    default void removeIceCandidateErrorEventListener(EventListener<RTCPeerConnectionIceErrorEvent> listener) {
        removeEventListener("icecandidateerror", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOniceconnectionstatechange();

    @JSProperty
    void setOniceconnectionstatechange(EventListener<Event> oniceconnectionstatechange);

    default void addIceConnectionStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("iceconnectionstatechange", listener, options);
    }

    default void addIceConnectionStateChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("iceconnectionstatechange", listener, options);
    }

    default void addIceConnectionStateChangeEventListener(EventListener<Event> listener) {
        addEventListener("iceconnectionstatechange", listener);
    }

    default void removeIceConnectionStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("iceconnectionstatechange", listener, options);
    }

    default void removeIceConnectionStateChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("iceconnectionstatechange", listener, options);
    }

    default void removeIceConnectionStateChangeEventListener(EventListener<Event> listener) {
        removeEventListener("iceconnectionstatechange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnicegatheringstatechange();

    @JSProperty
    void setOnicegatheringstatechange(EventListener<Event> onicegatheringstatechange);

    default void addIceGatheringStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("icegatheringstatechange", listener, options);
    }

    default void addIceGatheringStateChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("icegatheringstatechange", listener, options);
    }

    default void addIceGatheringStateChangeEventListener(EventListener<Event> listener) {
        addEventListener("icegatheringstatechange", listener);
    }

    default void removeIceGatheringStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("icegatheringstatechange", listener, options);
    }

    default void removeIceGatheringStateChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("icegatheringstatechange", listener, options);
    }

    default void removeIceGatheringStateChangeEventListener(EventListener<Event> listener) {
        removeEventListener("icegatheringstatechange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnnegotiationneeded();

    @JSProperty
    void setOnnegotiationneeded(EventListener<Event> onnegotiationneeded);

    default void addNegotiationNeededEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("negotiationneeded", listener, options);
    }

    default void addNegotiationNeededEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("negotiationneeded", listener, options);
    }

    default void addNegotiationNeededEventListener(EventListener<Event> listener) {
        addEventListener("negotiationneeded", listener);
    }

    default void removeNegotiationNeededEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("negotiationneeded", listener, options);
    }

    default void removeNegotiationNeededEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("negotiationneeded", listener, options);
    }

    default void removeNegotiationNeededEventListener(EventListener<Event> listener) {
        removeEventListener("negotiationneeded", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnsignalingstatechange();

    @JSProperty
    void setOnsignalingstatechange(EventListener<Event> onsignalingstatechange);

    default void addSignalingStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("signalingstatechange", listener, options);
    }

    default void addSignalingStateChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("signalingstatechange", listener, options);
    }

    default void addSignalingStateChangeEventListener(EventListener<Event> listener) {
        addEventListener("signalingstatechange", listener);
    }

    default void removeSignalingStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("signalingstatechange", listener, options);
    }

    default void removeSignalingStateChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("signalingstatechange", listener, options);
    }

    default void removeSignalingStateChangeEventListener(EventListener<Event> listener) {
        removeEventListener("signalingstatechange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<RTCStatsEvent> getOnstatsended();

    @JSProperty
    void setOnstatsended(EventListener<RTCStatsEvent> onstatsended);

    default void addStatSendedEventListener(EventListener<RTCStatsEvent> listener, AddEventListenerOptions options) {
        addEventListener("statsended", listener, options);
    }

    default void addStatSendedEventListener(EventListener<RTCStatsEvent> listener, boolean options) {
        addEventListener("statsended", listener, options);
    }

    default void addStatSendedEventListener(EventListener<RTCStatsEvent> listener) {
        addEventListener("statsended", listener);
    }

    default void removeStatSendedEventListener(EventListener<RTCStatsEvent> listener, EventListenerOptions options) {
        removeEventListener("statsended", listener, options);
    }

    default void removeStatSendedEventListener(EventListener<RTCStatsEvent> listener, boolean options) {
        removeEventListener("statsended", listener, options);
    }

    default void removeStatSendedEventListener(EventListener<RTCStatsEvent> listener) {
        removeEventListener("statsended", listener);
    }

    @JSProperty
    @Nullable
    EventListener<RTCTrackEvent> getOntrack();

    @JSProperty
    void setOntrack(EventListener<RTCTrackEvent> ontrack);

    default void addTrackEventListener(EventListener<RTCTrackEvent> listener, AddEventListenerOptions options) {
        addEventListener("track", listener, options);
    }

    default void addTrackEventListener(EventListener<RTCTrackEvent> listener, boolean options) {
        addEventListener("track", listener, options);
    }

    default void addTrackEventListener(EventListener<RTCTrackEvent> listener) {
        addEventListener("track", listener);
    }

    default void removeTrackEventListener(EventListener<RTCTrackEvent> listener, EventListenerOptions options) {
        removeEventListener("track", listener, options);
    }

    default void removeTrackEventListener(EventListener<RTCTrackEvent> listener, boolean options) {
        removeEventListener("track", listener, options);
    }

    default void removeTrackEventListener(EventListener<RTCTrackEvent> listener) {
        removeEventListener("track", listener);
    }

    @JSProperty
    Promise<RTCIdentityAssertion> getPeerIdentity();

    @JSProperty
    @Nullable
    RTCSessionDescription getPendingLocalDescription();

    @JSProperty
    @Nullable
    RTCSessionDescription getPendingRemoteDescription();

    @JSProperty
    @Nullable
    RTCSessionDescription getRemoteDescription();

    @JSProperty
    @Nullable
    RTCSctpTransport getSctp();

    @JSProperty
    RTCSignalingState getSignalingState();

    VoidPromise addIceCandidate(RTCIceCandidateInit candidate);

    VoidPromise addIceCandidate(RTCIceCandidate candidate);

    RTCRtpSender addTrack(MediaStreamTrack track, @JSByRef MediaStream... streams);

    RTCRtpSender addTrack(MediaStreamTrack track, Array<MediaStream> streams);

    RTCRtpTransceiver addTransceiver(MediaStreamTrack trackOrKind, RTCRtpTransceiverInit init);

    RTCRtpTransceiver addTransceiver(String trackOrKind, RTCRtpTransceiverInit init);

    RTCRtpTransceiver addTransceiver(MediaStreamTrack trackOrKind);

    RTCRtpTransceiver addTransceiver(String trackOrKind);

    void close();

    Promise<RTCSessionDescriptionInit> createAnswer(RTCOfferOptions options);

    Promise<RTCSessionDescriptionInit> createAnswer();

    RTCDataChannel createDataChannel(String label, RTCDataChannelInit dataChannelDict);

    RTCDataChannel createDataChannel(String label);

    Promise<RTCSessionDescriptionInit> createOffer(RTCOfferOptions options);

    Promise<RTCSessionDescriptionInit> createOffer();

    RTCConfiguration getConfiguration();

    void setConfiguration(RTCConfiguration configuration);

    StringPromise getIdentityAssertion();

    Array<RTCRtpReceiver> getReceivers();

    Array<RTCRtpSender> getSenders();

    Promise<RTCStatsReport> getStats(@Nullable MediaStreamTrack selector);

    Array<RTCRtpTransceiver> getTransceivers();

    void removeTrack(RTCRtpSender sender);

    void setIdentityProvider(String provider, RTCIdentityProviderOptions options);

    void setIdentityProvider(String provider);

    VoidPromise setLocalDescription(RTCSessionDescriptionInit description);

    VoidPromise setRemoteDescription(RTCSessionDescriptionInit description);

}
