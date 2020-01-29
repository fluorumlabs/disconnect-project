package js.web.webrtc;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface RTCRtpRtxParameters extends Any {
    @JSProperty
    int getSsrc();

    @JSProperty
    void setSsrc(int ssrc);

}
