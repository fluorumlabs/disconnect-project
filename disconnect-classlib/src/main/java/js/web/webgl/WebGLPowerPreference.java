package js.web.webgl;

import js.extras.JsEnum;

 //"hidden" | "visible";
        public abstract class WebGLPowerPreference extends JsEnum {
        public static final WebGLPowerPreference DEFAULT = JsEnum.of("default");
        public static final WebGLPowerPreference LOW_POWER = JsEnum.of("low-power");

        public static final WebGLPowerPreference HIGH_PERFORMANCE = JsEnum.of("high-performance");

}
