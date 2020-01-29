package js.web.serviceworker;

import js.extras.JsEnum;

 //"select" | "start" | "end" | "preserve";
        public abstract class ServiceWorkerState extends JsEnum {
        public static final ServiceWorkerState INSTALLING = JsEnum.of("installing");
        public static final ServiceWorkerState INSTALLED = JsEnum.of("installed");
        public static final ServiceWorkerState ACTIVATING = JsEnum.of("activating");
        public static final ServiceWorkerState ACTIVATED = JsEnum.of("activated");
        public static final ServiceWorkerState REDUNTANT = JsEnum.of("reduntant");

}
