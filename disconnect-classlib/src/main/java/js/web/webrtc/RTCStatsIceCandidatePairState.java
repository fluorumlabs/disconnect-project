package js.web.webrtc;

import js.extras.JsEnum;

 //"stable" | "have-local-offer" | "have-remote-offer" |
//        "have-local-pranswer" | "have-remote-pranswer" | "closed";
        public abstract class RTCStatsIceCandidatePairState extends JsEnum {
        public static final RTCStatsIceCandidatePairState FROZEN = JsEnum.of("frozen");
        public static final RTCStatsIceCandidatePairState WAITING = JsEnum.of("waiting");
        public static final RTCStatsIceCandidatePairState IN_PROGRESS = JsEnum.of("inprogress");

        public static final RTCStatsIceCandidatePairState FAILED = JsEnum.of("failed");
        public static final RTCStatsIceCandidatePairState SUCCEEDED = JsEnum.of("succeeded");

        public static final RTCStatsIceCandidatePairState CAMCELLED = JsEnum.of("camcelled");

}
