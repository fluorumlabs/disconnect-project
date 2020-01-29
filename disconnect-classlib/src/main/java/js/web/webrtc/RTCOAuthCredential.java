package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface RTCOAuthCredential extends Any {
    @JSProperty
    String getAccessToken();

    @JSProperty
    void setAccessToken(String accessToken);

    @JSProperty
    String getMacKey();

    @JSProperty
    void setMacKey(String macKey);

}
