package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRtpCodecParameters extends Any {
    @JSProperty
    @Nullable
    double getChannels();

    @JSProperty
    void setChannels(double channels);

    @JSProperty
    double getClockRate();

    @JSProperty
    void setClockRate(double clockRate);

    @JSProperty
    String getMimeType();

    @JSProperty
    void setMimeType(String mimeType);

    @JSProperty
    double getPayloadType();

    @JSProperty
    void setPayloadType(double payloadType);

    @JSProperty
    @Nullable
    String getSdpFmtpLine();

    @JSProperty
    void setSdpFmtpLine(String sdpFmtpLine);

}
