package js.web.webrtc;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface RTCCertificateExpiration extends Any {
    @JSProperty
    double getExpires();

    @JSProperty
    void setExpires(double expires);

}
