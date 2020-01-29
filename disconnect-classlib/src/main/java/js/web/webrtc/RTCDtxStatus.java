package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCDtxStatus extends JsEnum {
    public static final RTCDtxStatus DISABLED = JsEnum.of("disabled");

    public static final RTCDtxStatus ENABLED = JsEnum.of("enabled");

}
