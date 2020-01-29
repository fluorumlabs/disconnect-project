package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface RTCIceParameters extends Any {
    @JSProperty
    @Nullable
    String getPassword();

    @JSProperty
    void setPassword(String password);

    @JSProperty
    @Nullable
    String getUsernameFragment();

    @JSProperty
    void setUsernameFragment(String usernameFragment);

}
