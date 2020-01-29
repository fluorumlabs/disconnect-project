package js.web.credentialmanagement.webauthn;

import js.extras.JsEnum;


public abstract class AttestationConveyancePreference extends JsEnum {
    public static final AttestationConveyancePreference NONE = JsEnum.of("none");

    public static final AttestationConveyancePreference INDIRECT = JsEnum.of("indirect");

    public static final AttestationConveyancePreference DIRECT = JsEnum.of("direct");
}
