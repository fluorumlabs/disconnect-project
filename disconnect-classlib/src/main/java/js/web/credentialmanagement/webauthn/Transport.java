package js.web.credentialmanagement.webauthn;

import js.extras.JsEnum;

public abstract class Transport extends JsEnum {
    public static final Transport USB = JsEnum.of("usb");

    public static final Transport NFC = JsEnum.of("nfc");

    public static final Transport BLE = JsEnum.of("ble");
}
