package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface RTCCertificateExpiration extends Any {
    @JSProperty
    double getExpires();

    @JSProperty
    void setExpires(double expires);

}
