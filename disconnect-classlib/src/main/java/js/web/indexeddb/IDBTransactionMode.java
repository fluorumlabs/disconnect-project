package js.web.indexeddb;

import js.extras.JsEnum;

 //"pending" | "done";
        public abstract class IDBTransactionMode extends JsEnum {
        public static final IDBTransactionMode READONLY = JsEnum.of("readonly");
        public static final IDBTransactionMode READ_WRITE = JsEnum.of("readwrite");

        public static final IDBTransactionMode VERSION_CHANGE = JsEnum.of("versionchange");


}
