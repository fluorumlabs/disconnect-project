package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface RTCRtpHeaderExtensionCapability extends Any {
    @JSProperty
    @Nullable
    String getUri();

    @JSProperty
    void setUri(String uri);

}
