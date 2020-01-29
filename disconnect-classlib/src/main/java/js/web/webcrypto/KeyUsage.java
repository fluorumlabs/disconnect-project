package js.web.webcrypto;

import js.extras.JsEnum;

public abstract class KeyUsage extends JsEnum {
    public static final KeyUsage ENCRYPT = JsEnum.of("encrypt");

    public static final KeyUsage DECRYPT = JsEnum.of("decrypt");

    public static final KeyUsage SIGN = JsEnum.of("sign");

    public static final KeyUsage VERIFY = JsEnum.of("verify");

    public static final KeyUsage DERIVE_KEY = JsEnum.of("deriveKey");

    public static final KeyUsage DERIVE_BITS = JsEnum.of("deriveBits");

    public static final KeyUsage WRAP_KEY = JsEnum.of("wrapKey");

    public static final KeyUsage UNWRAP_KEY = JsEnum.of("unwrapKey");

}
