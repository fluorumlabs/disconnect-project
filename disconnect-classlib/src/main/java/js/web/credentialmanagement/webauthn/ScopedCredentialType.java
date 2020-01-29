package js.web.credentialmanagement.webauthn;

import js.extras.JsEnum;

public abstract class ScopedCredentialType extends JsEnum {
    public static final ScopedCredentialType SCOPED_CRED = JsEnum.of("ScopedCred");
}
