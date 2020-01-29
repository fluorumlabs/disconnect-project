package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCDtlsTransportState extends JsEnum {
    public static final RTCDtlsTransportState NEW = JsEnum.of("new");

    public static final RTCDtlsTransportState CONNECTING = JsEnum.of("connecting");

    public static final RTCDtlsTransportState CONNECTED = JsEnum.of("connected");

    public static final RTCDtlsTransportState CLOSED = JsEnum.of("closed");

    public static final RTCDtlsTransportState FAILED = JsEnum.of("failed");

}
