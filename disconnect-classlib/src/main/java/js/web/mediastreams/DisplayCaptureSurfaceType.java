package js.web.mediastreams;

import js.extras.JsEnum;


public abstract class DisplayCaptureSurfaceType extends JsEnum {
        public static final DisplayCaptureSurfaceType MONITOR = JsEnum.of("monitor");
        public static final DisplayCaptureSurfaceType WINDOW = JsEnum.of("window");
        public static final DisplayCaptureSurfaceType APPLICATION = JsEnum.of("application");
        public static final DisplayCaptureSurfaceType BROWSER = JsEnum.of("browser");

}
