package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCIceTransportPolicy extends JsEnum {
    public static final RTCIceTransportPolicy RELAY = JsEnum.of("relay");

    public static final RTCIceTransportPolicy ALL = JsEnum.of("all");

}
