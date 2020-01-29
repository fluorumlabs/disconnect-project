package js.web.mediastreams;

import js.extras.JsEnum;

public abstract class ReadyState extends JsEnum {
    public static final ReadyState CLOSED = JsEnum.of("closed");

    public static final ReadyState OPEN = JsEnum.of("open");

    public static final ReadyState ENDED = JsEnum.of("ended");

}
