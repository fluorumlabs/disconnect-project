package js.web.webrtc;

import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.lang.Promise;
import js.web.mediastreams.MediaStreamTrack;

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
        public interface RTCRtpReceiver extends Any {
        @JSProperty
        @Nullable
        RTCDtlsTransport getRtcpTransport();

        @JSProperty
        MediaStreamTrack getTrack();

        @JSProperty
        @Nullable
        RTCDtlsTransport  getTransport();

        Array<RTCRtpContributingSource> getContributingSources();
        RTCRtpReceiveParameters getParameters();
        Promise<RTCStatsReport> getStats();
        Array<RTCRtpSynchronizationSource> getSynchronizationSources();

        @JSBody(script = "return RTCRtpReceiver.prototype")
        static RTCRtpReceiver prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new RTCRtpReceiver()")
        static RTCRtpReceiver create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="kind", script = "return RTCRtpReceiver.getCapabilities(kind)")
        static @Nullable RTCRtpCapabilities getCapabilities(String kind) {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }

}
