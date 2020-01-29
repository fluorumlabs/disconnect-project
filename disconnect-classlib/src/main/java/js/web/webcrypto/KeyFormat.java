package js.web.webcrypto;

import js.extras.JsEnum;

public abstract class KeyFormat extends JsEnum {
    public static final KeyFormat RAW = JsEnum.of("raw");

    public static final KeyFormat SPKI = JsEnum.of("spki");

    public static final KeyFormat PKCS8 = JsEnum.of("pkcs8");

    public static final KeyFormat JWK = JsEnum.of("jwk");

}
