package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


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
