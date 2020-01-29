package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRtpHeaderExtensionCapability extends Any {
    @JSProperty
    @Nullable
    String getUri();

    @JSProperty
    void setUri(String uri);

}
