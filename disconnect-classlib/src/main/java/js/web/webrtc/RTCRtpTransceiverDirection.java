package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCRtpTransceiverDirection extends JsEnum {
    public static final RTCRtpTransceiverDirection SEND_RECV = JsEnum.of("sendrecv");

    public static final RTCRtpTransceiverDirection SEND_ONLY = JsEnum.of("sendonly");

    public static final RTCRtpTransceiverDirection RECV_ONLY = JsEnum.of("recvonly");

    public static final RTCRtpTransceiverDirection INACTIVE = JsEnum.of("inactive");

}
