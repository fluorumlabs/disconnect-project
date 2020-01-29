package js.web.indexeddb;

import js.extras.JsEnum;

public abstract class IDBRequestReadyState extends JsEnum {
    public static final IDBRequestReadyState PENDING = JsEnum.of("pending");

    public static final IDBRequestReadyState DONE = JsEnum.of("done");

}
