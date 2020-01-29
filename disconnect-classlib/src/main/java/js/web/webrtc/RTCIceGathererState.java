package js.web.webrtc;

import js.extras.JsEnum;

 //"all" | "nohost" | "relay";
        public abstract class RTCIceGathererState extends JsEnum {
 public static final RTCIceGathererState NEW = JsEnum.of("new");
 public static final RTCIceGathererState GATHERING = JsEnum.of("gathering");
 public static final RTCIceGathererState COMPLETE = JsEnum.of("complete");

}
