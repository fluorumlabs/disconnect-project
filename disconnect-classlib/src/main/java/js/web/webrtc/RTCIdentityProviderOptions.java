package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface RTCIdentityProviderOptions extends Any {
    @JSProperty
    @Nullable
    String getPeerIdentity();

    @JSProperty
    void setPeerIdentity(String peerIdentity);

    @JSProperty
    @Nullable
    String getProtocol();

    @JSProperty
    void setProtocol(String protocol);

    @JSProperty
    @Nullable
    String getUsernameHint();

    @JSProperty
    void setUsernameHint(String usernameHint);

}
