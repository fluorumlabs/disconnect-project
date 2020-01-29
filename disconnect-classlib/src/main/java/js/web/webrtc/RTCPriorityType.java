package js.web.webrtc;

import js.extras.JsEnum;

 //"new" | "connecting" | "connected" | "disconnected" |
//        "failed" | "closed";
        public abstract class RTCPriorityType extends JsEnum {
        public static final RTCPriorityType VERY_LOW = JsEnum.of("very-low");
        public static final RTCPriorityType LOW = JsEnum.of("low");
        public static final RTCPriorityType MEDIUM = JsEnum.of("medium");
        public static final RTCPriorityType HIGH = JsEnum.of("high");

}
