package js.web.mediastreams;

import js.extras.JsEnum;


public abstract class EndOfStreamError extends JsEnum {
    public static final EndOfStreamError NETWORK = JsEnum.of("network");

    public static final EndOfStreamError DECODE = JsEnum.of("decode");

}
