package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCDataChannelState extends JsEnum {
    public static final RTCDataChannelState CONNECTING = JsEnum.of("connecting");

    public static final RTCDataChannelState OPEN = JsEnum.of("open");

    public static final RTCDataChannelState CLOSING = JsEnum.of("closing");

    public static final RTCDataChannelState CLOSED = JsEnum.of("closed");

}
