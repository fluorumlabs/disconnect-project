package js.web.webrtc;

import js.extras.JsEnum;

 //"host" | "srflx" | "prflx" | "relay";
        public abstract class RTCIceComponent extends JsEnum {
  public static final RTCIceComponent RTP = JsEnum.of("rtp");
  public static final RTCIceComponent RTCP = JsEnum.of("rtcp");

}
