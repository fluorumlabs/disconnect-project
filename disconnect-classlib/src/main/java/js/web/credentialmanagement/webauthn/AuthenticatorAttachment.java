package js.web.credentialmanagement.webauthn;

import js.extras.JsEnum;


public abstract class AuthenticatorAttachment extends JsEnum {
        public static final AuthenticatorAttachment PLATFORM = JsEnum.of("platform");

        public static final AuthenticatorAttachment CROSS_PLATFORM = JsEnum.of("cross-platform");

}
