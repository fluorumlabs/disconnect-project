package js.web.permissions;

import js.extras.JsEnum;

 //"geolocation" | "notifications" | "push" | "midi" |
//        "camera" | "microphone" | "speaker" | "device-info" |
//        "background-sync" | "bluetooth" | "persistent-storage" |
//        "ambient-light-sensor" | "accelerometer" | "gyroscope" |
//        "magnetometer" | "clipboard";
        public abstract class PermissionState extends JsEnum {
        public static final PermissionState GRANTED = JsEnum.of("granted");
        public static final PermissionState DENIED = JsEnum.of("denied");
        public static final PermissionState PROMPT = JsEnum.of("prompt");

}
