package js.web.webrtc;

import js.extras.JsEnum;

 //"data-channel-failure" | "dtls-failure" | "fingerprint-failure" |
//        "idp-bad-script-failure" | "idp-execution-failure" |
//        "idp-load-failure" | "idp-need-login" |
//        "idp-timeout" | "idp-tls-failure" |
//        "idp-token-expired" | "idp-token-invalid" |
//        "sctp-failure" | "sdp-syntax-error" |
//        "hardware-encoder-not-available" | "hardware-encoder-error";
        public abstract class RTCIceCandidateType extends JsEnum {
        public static final RTCIceCandidateType HOST = JsEnum.of("host");
        public static final RTCIceCandidateType SRFLX = JsEnum.of("srflx");
        public static final RTCIceCandidateType PRFLX = JsEnum.of("prflx");
        public static final RTCIceCandidateType RELAY = JsEnum.of("relay");

}
