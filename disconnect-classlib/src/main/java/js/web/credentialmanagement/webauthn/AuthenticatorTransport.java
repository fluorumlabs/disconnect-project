package js.web.credentialmanagement.webauthn;

import js.extras.JsEnum;


public abstract class AuthenticatorTransport extends JsEnum {
    public static final AuthenticatorTransport USB = JsEnum.of("usb");

    public static final AuthenticatorTransport NFC = JsEnum.of("nfc");

    public static final AuthenticatorTransport BLE = JsEnum.of("ble");

    public static final AuthenticatorTransport INTERNAL = JsEnum.of("internal");
}
