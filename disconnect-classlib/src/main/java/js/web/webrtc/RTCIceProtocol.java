package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCIceProtocol extends JsEnum {
    public static final RTCIceProtocol UDP = JsEnum.of("udp");

    public static final RTCIceProtocol TCP = JsEnum.of("tcp");

}
