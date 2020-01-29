package js.web.credentialmanagement.webauthn;

import js.extras.JsEnum;

 //"basic" | "cors" | "default" | "error" | "opaque" | "opaqueredirect";
        public abstract class ScopedCredentialType extends JsEnum {
        public static final ScopedCredentialType SCOPED_CRED = JsEnum.of("ScopedCred");

}
