package js.web.canvas;

import js.extras.JsEnum;

 //"readonly" | "readwrite" | "versionchange";
        public abstract class ImageSmoothingQuality extends JsEnum {
        public static final ImageSmoothingQuality LOW = JsEnum.of("low");
        public static final ImageSmoothingQuality MEDIUM = JsEnum.of("medium");
        public static final ImageSmoothingQuality HIGH = JsEnum.of("high");

}
