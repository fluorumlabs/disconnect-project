package js.web.webrtc;

import js.web.mediastreams.MediaStream;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.util.collections.Array;

import org.teavm.jso.JSByRef;


public interface RTCRtpTransceiverInit extends Any {
    @JSProperty
    @Nullable
    RTCRtpTransceiverDirection getDirection();

    @JSProperty
    void setDirection(RTCRtpTransceiverDirection direction);

    @JSProperty
    @Nullable
    Array<RTCRtpEncodingParameters> getSendEncodings();

    @JSProperty
    void setSendEncodings(@JSByRef RTCRtpEncodingParameters... sendEncodings);
    @JSProperty
    void setSendEncodings(Array<RTCRtpEncodingParameters> sendEncodings);

    @JSProperty
    @Nullable
    Array<MediaStream> getStreams();

    @JSProperty
    void setStreams(@JSByRef MediaStream... streams);
    @JSProperty
    void setStreams(Array<MediaStream> streams);

}
