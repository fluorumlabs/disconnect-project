package js.web.webrtc;

import js.extras.JsEnum;

public abstract class RTCSignalingState extends JsEnum {
    public static final RTCSignalingState STABLE = JsEnum.of("stable");

    public static final RTCSignalingState HAVE_LOCAL_OFFER = JsEnum.of("have-local-offer");

    public static final RTCSignalingState HAVE_REMOTE_OFFER = JsEnum.of("have-remote-offer");

    public static final RTCSignalingState HAVE_LOCAL_PRANSWER = JsEnum.of("have-local-pranswer");

    public static final RTCSignalingState HAVE_REMOTE_PRANSWER = JsEnum.of("have-remote-pranswer");

    public static final RTCSignalingState CLOSED = JsEnum.of("closed");


}
