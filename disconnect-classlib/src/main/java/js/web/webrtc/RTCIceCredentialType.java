package js.web.webrtc;

import js.extras.JsEnum;

 //"new" | "checking" | "connected" | "completed" |
//        "disconnected" | "failed" | "closed";
        public abstract class RTCIceCredentialType extends JsEnum {
        public static final RTCIceCredentialType PASSWORD = JsEnum.of("password");
        public static final RTCIceCredentialType OAUTH = JsEnum.of("oauth");

}
