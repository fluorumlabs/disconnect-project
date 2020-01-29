package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface RTCRtcpParameters extends Any {
    @JSProperty
    @Nullable
    String getCname();

    @JSProperty
    void setCname(String cname);

    @JSProperty
    boolean isReducedSize();

    @JSProperty
    void setReducedSize(boolean reducedSize);

}
