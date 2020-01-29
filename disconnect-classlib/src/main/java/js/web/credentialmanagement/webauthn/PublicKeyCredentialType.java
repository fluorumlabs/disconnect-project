package js.web.credentialmanagement.webauthn;

import js.extras.JsEnum;

public abstract class PublicKeyCredentialType extends JsEnum {
    public static final PublicKeyCredentialType PUBLIC_KEY = JsEnum.of("public-key");
}
