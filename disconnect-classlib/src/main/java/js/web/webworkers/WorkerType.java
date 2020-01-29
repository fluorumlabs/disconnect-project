package js.web.webworkers;

import js.extras.JsEnum;

public abstract class WorkerType extends JsEnum {
    public static final WorkerType CLASSIC = JsEnum.of("classic");

    public static final WorkerType MODULE = JsEnum.of("module");

}
