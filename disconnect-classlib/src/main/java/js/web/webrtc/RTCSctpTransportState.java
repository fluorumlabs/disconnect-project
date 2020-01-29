package js.web.webrtc;

import js.extras.JsEnum;

 //"sendrecv" | "sendonly" | "recvonly" | "inactive";
        public abstract class RTCSctpTransportState extends JsEnum {
  public static final RTCSctpTransportState CONNECTING = JsEnum.of("connecting");
  public static final RTCSctpTransportState CONNECTED = JsEnum.of("connected");
  public static final RTCSctpTransportState CLOSED = JsEnum.of("closed");

}
