package js.web.webrtc;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;


public interface RTCRtpParameters extends Any {
    @JSProperty
    Array<RTCRtpCodecParameters> getCodecs();

    @JSProperty
    void setCodecs(@JSByRef RTCRtpCodecParameters... codecs);

    @JSProperty
    void setCodecs(Array<RTCRtpCodecParameters> codecs);

    @JSProperty
    Array<RTCRtpHeaderExtensionParameters> getHeaderExtensions();

    @JSProperty
    void setHeaderExtensions(@JSByRef RTCRtpHeaderExtensionParameters... headerExtensions);

    @JSProperty
    void setHeaderExtensions(Array<RTCRtpHeaderExtensionParameters> headerExtensions);

    @JSProperty
    RTCRtcpParameters getRtcp();

    @JSProperty
    void setRtcp(RTCRtcpParameters rtcp);

}
