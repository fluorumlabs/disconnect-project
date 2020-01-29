package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface RTCRtcpFeedback extends Any {
    @JSProperty
    @Nullable
    String getParameter();

    @JSProperty
    void setParameter(String parameter);

    @JSProperty
    @Nullable
    String getType();

    @JSProperty
    void setType(String type);

}
