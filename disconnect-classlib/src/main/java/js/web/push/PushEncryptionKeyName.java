package js.web.push;

import js.extras.JsEnum;

public abstract class PushEncryptionKeyName extends JsEnum {
    public static final PushEncryptionKeyName P256DH = JsEnum.of("p256dh");

    public static final PushEncryptionKeyName AUTH = JsEnum.of("auth");

}
