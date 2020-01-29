package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCIceGatheringState extends JsEnum {
    public static final RTCIceGatheringState NEW = JsEnum.of("new");

    public static final RTCIceGatheringState GATHERING = JsEnum.of("gathering");

    public static final RTCIceGatheringState COMPLETE = JsEnum.of("complete");

}
