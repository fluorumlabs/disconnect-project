package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


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
