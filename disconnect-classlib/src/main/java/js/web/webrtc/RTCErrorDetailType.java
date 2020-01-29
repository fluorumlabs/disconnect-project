package js.web.webrtc;

import js.extras.JsEnum;

 //"disabled" | "enabled";
        public abstract class RTCErrorDetailType extends JsEnum {
public static final RTCErrorDetailType DATA_CHANNEL_FAILURE = JsEnum.of("data-channel-failure");

public static final RTCErrorDetailType FTLS_FAILURE = JsEnum.of("ftls-failure");

public static final RTCErrorDetailType FINGERPRINT_FAILURE = JsEnum.of("fingerprint-failure");

public static final RTCErrorDetailType IDP_BAD_SCRIPT_FAILURE = JsEnum.of("idp-bad-script-failure");

public static final RTCErrorDetailType IDP_EXECUTION_FAILURE = JsEnum.of("idp-execution-failure");

public static final RTCErrorDetailType IDP_LOAD_FAILURE = JsEnum.of("idp-load-failure");

public static final RTCErrorDetailType IDP_NEED_LOGIN = JsEnum.of("idp-need-login");

public static final RTCErrorDetailType IDP_TIMEOUT = JsEnum.of("idp-timeout");

public static final RTCErrorDetailType IDP_TLS_FAILURE = JsEnum.of("idp-tls-failure");

public static final RTCErrorDetailType IDP_TOKEN_EXPIRED = JsEnum.of("idp-token-expired");

public static final RTCErrorDetailType IDP_TOKEN_INVALID = JsEnum.of("idp-token-invalid");

public static final RTCErrorDetailType SCTP_FAILURE = JsEnum.of("sctp-failure");

public static final RTCErrorDetailType SDP_SYNTAX_ERROR = JsEnum.of("sdp-syntax-error");

public static final RTCErrorDetailType HARDWARE_ENCODER_NOT_AVAILABLE = JsEnum.of("hardware-encoder-not-available");

public static final RTCErrorDetailType HARDWARE_ENCODER_ERRRO = JsEnum.of("hardware-encoder-errro");

}
