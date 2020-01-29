package js.web.webrtc;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCIceServer extends Any {
    @JSProperty
    @Nullable
    Unknown getCredential();

    @JSProperty
    void setCredential(String credential);

    @JSProperty
    void setCredential(RTCOAuthCredential credential);

    @JSProperty
    @Nullable
    RTCIceCredentialType getCredentialType();

    @JSProperty
    void setCredentialType(RTCIceCredentialType credentialType);

    @JSProperty
    Unknown getUrls();

    @JSProperty
    void setUrls(String urls);

    @JSProperty
    void setUrls(@JSByRef String... urls);

    @JSProperty
    @Nullable
    String getUsername();

    @JSProperty
    void setUsername(String username);

}
