package js.web.webrtc;


import js.util.errors.JsError;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/22/2020.
 */
public interface RTCError extends JsError {
    @JSBody(script = "return RTCError.prototype")
    static RTCError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCError()")
    static RTCError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "errorDetail", script = "return new RTCError(errorDetail)")
    static RTCError create(String errorDetail) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"errorDetail", "message"}, script = "return new RTCError(errorDetail, message)")
    static RTCError create(String errorDetail, String message) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getErrorDetail();

    @JSProperty
    void setErrorDetail(String errorDetail);

    @JSProperty
    int getHttpRequestStatusCode();

    @JSProperty
    void setHttpRequestStatusCode(int httpRequestStatusCode);

    @JSProperty
    String getMessage();

    @JSProperty
    void setMessage(String message);

    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    @JSProperty
    @Nullable
    int getReceivedAlert();

    @JSProperty
    void setReceivedAlert(int receivedAlert);

    @JSProperty
    int getSctpCauseCode();

    @JSProperty
    void setSctpCauseCode(int sctpCauseCode);

    @JSProperty
    int getSdpLineNumber();

    @JSProperty
    void setSdpLineNumber(int sdpLineNumber);

    @JSProperty
    @Nullable
    int getSentAlert();

    @JSProperty
    void setSentAlert(int sentAlert);

}
