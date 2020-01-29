package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCIceCredentialType extends JsEnum {
    public static final RTCIceCredentialType PASSWORD = JsEnum.of("password");

    public static final RTCIceCredentialType OAUTH = JsEnum.of("oauth");

}
