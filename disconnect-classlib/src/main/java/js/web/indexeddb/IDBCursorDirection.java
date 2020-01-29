package js.web.indexeddb;

import js.extras.JsEnum;

public abstract class IDBCursorDirection extends JsEnum {
    public static final IDBCursorDirection NEXT = JsEnum.of("next");

    public static final IDBCursorDirection NEXT_UNIQUE = JsEnum.of("nextunique");

    public static final IDBCursorDirection PREV = JsEnum.of("prev");

    public static final IDBCursorDirection PREV_UNIQUE = JsEnum.of("prevunique");

}
