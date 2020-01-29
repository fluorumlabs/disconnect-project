package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRtpFecParameters extends Any {
    @JSProperty
    @Nullable
    String getMechanism();

    @JSProperty
    void setMechanism(String mechanism);

    @JSProperty
    int getSsrc();

    @JSProperty
    void setSsrc(int ssrc);

}
