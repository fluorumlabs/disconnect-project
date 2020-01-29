package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface RTCRtpHeaderExtensionParameters extends Any {
    @JSProperty
    boolean isEncrypted();

    @JSProperty
    void setEncrypted(boolean encrypted);

    @JSProperty
    int getId();

    @JSProperty
    void setId(int id);

    @JSProperty
    String getUri();

    @JSProperty
    void setUri(String uri);

}
