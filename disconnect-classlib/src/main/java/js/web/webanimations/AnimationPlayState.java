package js.web.webanimations;

import js.extras.JsEnum;


public abstract class AnimationPlayState extends JsEnum {
        public static final AnimationPlayState IDLE = JsEnum.of("idle");

        public static final AnimationPlayState RUNNING = JsEnum.of("running");

        public static final AnimationPlayState PAUSED = JsEnum.of("paused");

        public static final AnimationPlayState FINISHED = JsEnum.of("finished");

}
