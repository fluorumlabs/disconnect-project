package js.web.webrtc;

import js.extras.JsEnum;

 //"very-low" | "low" | "medium" | "high";
        public abstract class RTCRtcpMuxPolicy extends JsEnum {
public static final RTCRtcpMuxPolicy NEGOTIATE = JsEnum.of("negotiate");
public static final RTCRtcpMuxPolicy REQUIRE = JsEnum.of("require");

}
