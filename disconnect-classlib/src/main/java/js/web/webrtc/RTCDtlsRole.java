package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCDtlsRole extends JsEnum {
    public static final RTCDtlsRole AUTO = JsEnum.of("auto");

    public static final RTCDtlsRole CLIENT = JsEnum.of("client");

    public static final RTCDtlsRole SERVER = JsEnum.of("server");

}
