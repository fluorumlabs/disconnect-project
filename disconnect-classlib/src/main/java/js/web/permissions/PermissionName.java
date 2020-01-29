package js.web.permissions;

import js.extras.JsEnum;

 //"shipping" | "delivery" | "pickup";
        public abstract class PermissionName extends JsEnum {
        public static final PermissionName GEOLOCATION = JsEnum.of("geolocation");
        public static final PermissionName NOTIFICATIONS = JsEnum.of("notifications");

        public static final PermissionName PUSH = JsEnum.of("push");
        public static final PermissionName MIDI = JsEnum.of("midi");
        public static final PermissionName CAMERA = JsEnum.of("camera");
        public static final PermissionName MICROPHONE = JsEnum.of("microphone");
        public static final PermissionName SPEAKER = JsEnum.of("speaker");
        public static final PermissionName DEVICE_INFO = JsEnum.of("device-info");

        public static final PermissionName BACKGROUND_SYNC = JsEnum.of("background-sync");

        public static final PermissionName BLUETOOTH = JsEnum.of("bluetooth");
        public static final PermissionName PERSISTENT_STORAGE = JsEnum.of("persistent-storage");

        public static final PermissionName AMBIENT_LIGHT_SENSOR = JsEnum.of("ambient-light-sensor");

        public static final PermissionName ACCELEROMETER = JsEnum.of("accelerometer");
        public static final PermissionName GYROSCOPE = JsEnum.of("gyroscope");
        public static final PermissionName MAGNETOMETER = JsEnum.of("magnetometer");
        public static final PermissionName CLIPBOARD = JsEnum.of("clipboard");

}
