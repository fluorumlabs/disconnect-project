package js.web.webaudio;

import js.extras.JsEnum;


public abstract class AudioContextState extends JsEnum {
        public static final AudioContextState SUSPENDED = JsEnum.of("suspended");

        public static final AudioContextState RUNNING = JsEnum.of("running");

        public static final AudioContextState CLOSED = JsEnum.of("closed");

}
