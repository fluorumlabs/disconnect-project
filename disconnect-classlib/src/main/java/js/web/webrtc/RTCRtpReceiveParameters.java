package js.web.webrtc;

import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;


public interface RTCRtpReceiveParameters extends RTCRtpParameters {
    @JSProperty
    Array<RTCRtpDecodingParameters> getEncodings();

    @JSProperty
    void setEncodings(Array<RTCRtpDecodingParameters> encodings);

    @JSProperty
    void setEncodings(RTCRtpDecodingParameters... encodings);

}
