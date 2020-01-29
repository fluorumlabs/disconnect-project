package js.web.webrtc;

import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRtpSendParameters extends RTCRtpParameters {
    @JSProperty
    @Nullable
    RTCDegradationPreference getDegradationPreference();

    @JSProperty
    void setDegradationPreference(RTCDegradationPreference degradationPreference);

    @JSProperty
    Array<RTCRtpEncodingParameters> getEncodings();

    @JSProperty
    void setEncodings(@JSByRef RTCRtpEncodingParameters... encodings);

    @JSProperty
    void setEncodings(Array<RTCRtpEncodingParameters> encodings);

    @JSProperty
    String getTransactionId();

    @JSProperty
    void setTransactionId(String transactionId);

}
