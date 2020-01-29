package js.web.webvr;

import js.extras.JsEnum;

 //"required" | "preferred" | "discouraged";
        public abstract class VRDisplayEventReason extends JsEnum {
        public static final VRDisplayEventReason MOUNTED = JsEnum.of("mounted");
        public static final VRDisplayEventReason NAVIGATION = JsEnum.of("navigation");
        public static final VRDisplayEventReason REQUESTED = JsEnum.of("requested");
        public static final VRDisplayEventReason UNMOUNTED = JsEnum.of("unmounted");

}
