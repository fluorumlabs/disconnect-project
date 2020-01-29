package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCIceCandidateType extends JsEnum {
    public static final RTCIceCandidateType HOST = JsEnum.of("host");

    public static final RTCIceCandidateType SRFLX = JsEnum.of("srflx");

    public static final RTCIceCandidateType PRFLX = JsEnum.of("prflx");

    public static final RTCIceCandidateType RELAY = JsEnum.of("relay");

}
