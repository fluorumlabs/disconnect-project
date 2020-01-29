package js.web.webcrypto;

import js.extras.JsEnum;

public abstract class KeyType extends JsEnum {
    public static final KeyType PUBLIC = JsEnum.of("public");

    public static final KeyType PRIVATE = JsEnum.of("private");

    public static final KeyType SECRET = JsEnum.of("secret");

}
