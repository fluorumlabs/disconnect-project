package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCIceConnectionState extends JsEnum {
    public static final RTCIceConnectionState NEW = JsEnum.of("new");

    public static final RTCIceConnectionState CHECKING = JsEnum.of("checking");

    public static final RTCIceConnectionState CONNECTED = JsEnum.of("connected");

    public static final RTCIceConnectionState COMPLETED = JsEnum.of("completed");

    public static final RTCIceConnectionState DISCONNECTED = JsEnum.of("disconnected");

    public static final RTCIceConnectionState FAILED = JsEnum.of("failed");

    public static final RTCIceConnectionState CLOSED = JsEnum.of("closed");

}
