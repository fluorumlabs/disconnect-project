package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCBundlePolicy extends JsEnum {
    public static final RTCBundlePolicy BALANCED = JsEnum.of("balanced");

    public static final RTCBundlePolicy MAX_COMPAT = JsEnum.of("max-compat");

    public static final RTCBundlePolicy MAX_BUNDLE = JsEnum.of("max-bundle");

}
