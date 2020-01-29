package js.web.webaudio;

import js.extras.JsEnum;

 //"sine" | "square" | "sawtooth" | "triangle" | "custom";
        public abstract class OverSampleType extends JsEnum {
        public static final OverSampleType NONE = JsEnum.of("none");
        public static final OverSampleType OVERSAMPLE_2X = JsEnum.of("2x");

        public static final OverSampleType OVERSAMPLE_4X = JsEnum.of("4x");

}
