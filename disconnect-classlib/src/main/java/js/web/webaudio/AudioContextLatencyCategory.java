package js.web.webaudio;

import js.extras.JsEnum;


public abstract class AudioContextLatencyCategory extends JsEnum {
        public static final AudioContextLatencyCategory BALANCED = JsEnum.of("balanced");

        public static final AudioContextLatencyCategory INTERACTIVE = JsEnum.of("interactive");
        public static final AudioContextLatencyCategory PLAYBACK = JsEnum.of("playback");

}
