package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCIceGatherPolicy extends JsEnum {
    public static final RTCIceGatherPolicy ALL = JsEnum.of("all");

    public static final RTCIceGatherPolicy NO_HOST = JsEnum.of("nohost");

    public static final RTCIceGatherPolicy RELAY = JsEnum.of("relay");

}
