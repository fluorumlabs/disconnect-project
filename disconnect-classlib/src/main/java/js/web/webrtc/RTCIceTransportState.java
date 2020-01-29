package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCIceTransportState extends JsEnum {
    public static final RTCIceTransportState NEW = JsEnum.of("new");

    public static final RTCIceTransportState CHECKING = JsEnum.of("checking");

    public static final RTCIceTransportState CONNECTED = JsEnum.of("connected");

    public static final RTCIceTransportState COMPLETED = JsEnum.of("completed");

    public static final RTCIceTransportState DISCONNECTED = JsEnum.of("disconnected");

    public static final RTCIceTransportState FAILED = JsEnum.of("failed");

    public static final RTCIceTransportState CLOSED = JsEnum.of("closed");

}
