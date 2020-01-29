package js.web.webrtc;

import org.teavm.jso.JSProperty;

import js.util.collections.Array;
import org.teavm.jso.JSByRef;


public interface RTCRtpReceiveParameters extends RTCRtpParameters {
    @JSProperty
    Array<RTCRtpDecodingParameters> getEncodings();

    @JSProperty
    void setEncodings(Array<RTCRtpDecodingParameters> encodings);
    @JSProperty
    void setEncodings(@JSByRef RTCRtpDecodingParameters... encodings);

}
