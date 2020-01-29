package js.web.webrtc;

import js.lang.Any;
import js.lang.Promise;
import js.lang.VoidPromise;
import js.util.collections.Array;
import js.web.mediastreams.MediaStream;
import js.web.mediastreams.MediaStreamTrack;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer.
 */
public interface RTCRtpSender extends Any {
    @JSBody(script = "return RTCRtpSender.prototype")
    static RTCRtpSender prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCRtpSender()")
    static RTCRtpSender create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "kind", script = "return RTCRtpSender.getCapabilities(kind)")
    static RTCRtpCapabilities getCapabilities(String kind) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    RTCDTMFSender getDtmf();

    @JSProperty
    @Nullable
    RTCDtlsTransport getRtcpTransport();

    @JSProperty
    @Nullable
    MediaStreamTrack getTrack();

    @JSProperty
    @Nullable
    RTCDtlsTransport getTransport();

    RTCRtpSendParameters getParameters();

    Promise<RTCStatsReport> getStats();

    VoidPromise replaceTrack(@Nullable MediaStreamTrack withTrack);

    VoidPromise setParameters(RTCRtpSendParameters parameters);

    void setStreams(@JSByRef MediaStream... streams);

    void setStreams(Array<MediaStream> streams);

}
