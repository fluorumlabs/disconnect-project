package js.web.webaudio;

import js.extras.JsEnum;

 //"portrait-primary" | "portrait-secondary" | "landscape-primary" |
//        "landscape-secondary";
        public abstract class OscillatorType extends JsEnum {
        public static final OscillatorType SINE = JsEnum.of("sine");
        public static final OscillatorType SQUARE = JsEnum.of("square");
        public static final OscillatorType SAWTOOTH = JsEnum.of("sawtooth");
        public static final OscillatorType TRIANGLE = JsEnum.of("triangle");
        public static final OscillatorType CUSTOM = JsEnum.of("custom");

}
