package js.web.webrtc;

import js.extras.JsEnum;

 //"connecting" | "open" | "closing" | "closed";
        public abstract class RTCDegradationPreference extends JsEnum {
  public static final RTCDegradationPreference MAINTAIN_FRAMERATE = JsEnum.of("maintain-framerate");

  public static final RTCDegradationPreference MAINTAIN_RESOLUTION = JsEnum.of("maintain-resolution");

  public static final RTCDegradationPreference BALANCED = JsEnum.of("balanced");

}
