package js.web.webworkers;

import js.extras.JsEnum;


public abstract class ClientTypes extends JsEnum {
    public static final ClientTypes WINDOW = JsEnum.of("window");

    public static final ClientTypes WORKER = JsEnum.of("worker");

    public static final ClientTypes SHARED_WORKER = JsEnum.of("sharedworker");

    public static final ClientTypes ALL = JsEnum.of("all");

}
