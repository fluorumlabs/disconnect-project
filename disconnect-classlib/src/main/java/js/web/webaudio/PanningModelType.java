package js.web.webaudio;

import js.extras.JsEnum;

 //"none" | "2x" | "4x";
        public abstract class PanningModelType extends JsEnum {
        public static final PanningModelType EQUAL_POWER = JsEnum.of("equalpower");

        public static final PanningModelType HRTF = JsEnum.of("HRTF");


}
