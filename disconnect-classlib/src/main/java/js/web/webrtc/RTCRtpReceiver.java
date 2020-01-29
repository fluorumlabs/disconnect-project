package js.web.webrtc;

import js.lang.Any;
import js.lang.Promise;
import js.util.collections.Array;
import js.web.mediastreams.MediaStreamTrack;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection.
 */
public interface RTCRtpReceiver extends Any {
    @JSBody(script = "return RTCRtpReceiver.prototype")
    static RTCRtpReceiver prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCRtpReceiver()")
    static RTCRtpReceiver create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "kind", script = "return RTCRtpReceiver.getCapabilities(kind)")
    static @Nullable
    RTCRtpCapabilities getCapabilities(String kind) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    RTCDtlsTransport getRtcpTransport();

    @JSProperty
    MediaStreamTrack getTrack();

    @JSProperty
    @Nullable
    RTCDtlsTransport getTransport();

    Array<RTCRtpContributingSource> getContributingSources();

    RTCRtpReceiveParameters getParameters();

    Promise<RTCStatsReport> getStats();

    Array<RTCRtpSynchronizationSource> getSynchronizationSources();

}
