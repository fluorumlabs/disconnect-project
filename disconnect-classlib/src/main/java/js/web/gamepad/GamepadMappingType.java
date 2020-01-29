package js.web.gamepad;

import js.extras.JsEnum;

 //"vibration";
        public abstract class GamepadMappingType extends JsEnum {
        public static final GamepadMappingType NONE = JsEnum.of("");
        public static final GamepadMappingType STANDARD = JsEnum.of("standard");

}
