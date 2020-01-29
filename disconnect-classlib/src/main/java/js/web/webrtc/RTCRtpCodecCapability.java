package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface RTCRtpCodecCapability extends Any {
    @JSProperty
    int getChannels();

    @JSProperty
    void setChannels(int channels);

    @JSProperty
    double getClockRate();

    @JSProperty
    void setClockRate(double clockRate);

    @JSProperty
    String getMimeType();

    @JSProperty
    void setMimeType(String mimeType);

    @JSProperty
    @Nullable
    String getSdpFmtpLine();

    @JSProperty
    void setSdpFmtpLine(String sdpFmtpLine);

}
