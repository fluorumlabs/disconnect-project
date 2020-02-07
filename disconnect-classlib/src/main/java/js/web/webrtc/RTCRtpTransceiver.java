package js.web.webrtc;

import js.lang.Any;
import js.util.collections.Array;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRtpTransceiver extends Any {
    @JSBody(script = "return RTCRtpTransceiver.prototype")
    static RTCRtpTransceiver prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCRtpTransceiver()")
    static RTCRtpTransceiver create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    RTCRtpTransceiverDirection getCurrentDirection();

    @JSProperty
    RTCRtpTransceiverDirection getDirection();

    @JSProperty
    void setDirection(RTCRtpTransceiverDirection direction);

    @JSProperty
    @Nullable
    String getMid();

    @JSProperty
    RTCRtpReceiver getReceiver();

    @JSProperty
    RTCRtpSender getSender();

    @JSProperty
    boolean isStopped();

    void setCodecPreferences(RTCRtpCodecCapability... codecs);

    void setCodecPreferences(Array<RTCRtpCodecCapability> codecs);

    void setCodecPreferences(JsIterable<RTCRtpCodecCapability> codecs);

    void stop();

}
