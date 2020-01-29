package js.web.webrtc;

import org.teavm.jso.JSProperty;

import js.lang.Any;


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
