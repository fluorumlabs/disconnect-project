package js.web.webrtc;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;


public interface RTCRtpCapabilities extends Any {
    @JSProperty
    Array<RTCRtpCodecCapability> getCodecs();

    @JSProperty
    void setCodecs(@JSByRef RTCRtpCodecCapability... codecs);

    @JSProperty
    void setCodecs(Array<RTCRtpCodecCapability> codecs);

    @JSProperty
    Array<RTCRtpHeaderExtensionCapability> getHeaderExtensions();

    @JSProperty
    void setHeaderExtensions(@JSByRef RTCRtpHeaderExtensionCapability... headerExtensions);

    @JSProperty
    void setHeaderExtensions(Array<RTCRtpHeaderExtensionCapability> headerExtensions);

}
