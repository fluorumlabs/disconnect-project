package js.web.websocket;

import js.extras.JsEnum;


public abstract class BinaryType extends JsEnum {
    public static final BinaryType BLOB = JsEnum.of("blob");

    public static final BinaryType ARRAYBUFFER = JsEnum.of("arraybuffer");

}
