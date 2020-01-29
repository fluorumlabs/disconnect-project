package js.web.webrtc;

import js.extras.JsEnum;

 //"udp" | "tcp";
        public abstract class RTCIceRole extends JsEnum {
  public static final RTCIceRole CONTROLLING = JsEnum.of("controlling");
  public static final RTCIceRole CONTROLLED = JsEnum.of("controlled");

}
