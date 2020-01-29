package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


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
