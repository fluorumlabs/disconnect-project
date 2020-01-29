package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCIceComponent extends JsEnum {
    public static final RTCIceComponent RTP = JsEnum.of("rtp");

    public static final RTCIceComponent RTCP = JsEnum.of("rtcp");

}
