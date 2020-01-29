package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


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
