package js.web.webrtc;

import js.extras.JsEnum;

 //"new" | "checking" | "connected" | "completed" |
//        "disconnected" | "failed" | "closed";
        public abstract class RTCPeerConnectionState extends JsEnum {
        public static final RTCPeerConnectionState NEW = JsEnum.of("new");
        public static final RTCPeerConnectionState CONNECTING = JsEnum.of("connecting");
        public static final RTCPeerConnectionState CONNECTED = JsEnum.of("connected");
        public static final RTCPeerConnectionState DISCONNECTED = JsEnum.of("disconnected");
        public static final RTCPeerConnectionState FAILED = JsEnum.of("failed");
        public static final RTCPeerConnectionState CLOSED = JsEnum.of("closed");

}
