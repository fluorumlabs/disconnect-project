package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRtpHeaderExtension extends Any {
    @JSProperty
    @Nullable
    String getKind();

    @JSProperty
    void setKind(String kind);

    @JSProperty
    boolean isPreferredEncrypt();

    @JSProperty
    void setPreferredEncrypt(boolean preferredEncrypt);

    @JSProperty
    int getPreferredId();

    @JSProperty
    void setPreferredId(int preferredId);

    @JSProperty
    @Nullable
    String getUri();

    @JSProperty
    void setUri(String uri);

}
