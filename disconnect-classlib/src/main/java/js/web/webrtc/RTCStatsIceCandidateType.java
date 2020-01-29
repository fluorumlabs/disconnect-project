package js.web.webrtc;

import js.extras.JsEnum;

 //"frozen" | "waiting" | "inprogress" | "failed" | "succeeded" |
//        "cancelled";
        public abstract class RTCStatsIceCandidateType extends JsEnum {
        public static final RTCStatsIceCandidateType HOST = JsEnum.of("host");
        public static final RTCStatsIceCandidateType SEVERVER_REFLEXIVE = JsEnum.of("seververreflexive");

        public static final RTCStatsIceCandidateType PEER_REFLEXIVE = JsEnum.of("peerreflexive");

        public static final RTCStatsIceCandidateType RELAYED = JsEnum.of("relayed");

}
