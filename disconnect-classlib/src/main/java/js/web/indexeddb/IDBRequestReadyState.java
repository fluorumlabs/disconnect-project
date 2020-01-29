package js.web.indexeddb;

import js.extras.JsEnum;

 //"next" | "nextunique" | "prev" | "prevunique";
        public abstract class IDBRequestReadyState extends JsEnum {
        public static final IDBRequestReadyState PENDING = JsEnum.of("pending");
        public static final IDBRequestReadyState DONE = JsEnum.of("done");

}
