package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCStatsType extends JsEnum {
    public static final RTCStatsType INBOUND_RTP = JsEnum.of("inboundrtp");

    public static final RTCStatsType OUTBOUND_RTP = JsEnum.of("outboundrtp");

    public static final RTCStatsType SESSION = JsEnum.of("session");

    public static final RTCStatsType DATA_CHANNEL = JsEnum.of("datachannel");

    public static final RTCStatsType TRACK = JsEnum.of("track");

    public static final RTCStatsType TRANSPORT = JsEnum.of("transport");

    public static final RTCStatsType CANDIDATE_PAIR = JsEnum.of("candidatepair");

    public static final RTCStatsType LOCAL_CANDIDATE = JsEnum.of("localcandidate");

    public static final RTCStatsType REMOVE_CANDIDATE = JsEnum.of("removecandidate");

}
