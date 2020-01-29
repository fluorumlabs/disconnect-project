package js.web.webrtc;

import js.extras.JsEnum;

 //"controlling" | "controlled";
        public abstract class RTCIceTcpCandidateType extends JsEnum {
  public static final RTCIceTcpCandidateType ACTIVE = JsEnum.of("active");
  public static final RTCIceTcpCandidateType PASSIVE = JsEnum.of("passive");
  public static final RTCIceTcpCandidateType SO = JsEnum.of("so");

}
