package js.web.credentialmanagement.webauthn;

import js.extras.JsEnum;

 //"usb" | "nfc" | "ble";
        public abstract class UserVerificationRequirement extends JsEnum {
 public static final UserVerificationRequirement REQUIRED = JsEnum.of("required");
 public static final UserVerificationRequirement PREFERRED = JsEnum.of("preferred");
 public static final UserVerificationRequirement DISCOURAGED = JsEnum.of("discouraged");

}
