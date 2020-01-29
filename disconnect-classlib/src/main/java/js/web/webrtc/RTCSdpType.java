package js.web.webrtc;

import js.extras.JsEnum;

 //"connecting" | "connected" | "closed";
        public abstract class RTCSdpType extends JsEnum {
  public static final RTCSdpType OFFER = JsEnum.of("offer");
  public static final RTCSdpType PRANSWER = JsEnum.of("pranswer");
  public static final RTCSdpType ANSWER = JsEnum.of("answer");
  public static final RTCSdpType ROLLBACK = JsEnum.of("rollback");

}
