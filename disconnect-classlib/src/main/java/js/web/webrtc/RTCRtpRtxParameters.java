package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface RTCRtpRtxParameters extends Any {
    @JSProperty
    int getSsrc();

    @JSProperty
    void setSsrc(int ssrc);

}
