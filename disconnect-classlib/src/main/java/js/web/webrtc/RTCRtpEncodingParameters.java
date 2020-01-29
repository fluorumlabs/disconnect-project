package js.web.webrtc;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRtpEncodingParameters extends RTCRtpCodingParameters {
    @JSProperty
    boolean isActive();

    @JSProperty
    void setActive(boolean active);

    @JSProperty
    int getCodecPayloadType();

    @JSProperty
    void setCodecPayloadType(int codecPayloadType);

    @JSProperty
    @Nullable
    RTCDtxStatus getDtx();

    @JSProperty
    void setDtx(RTCDtxStatus dtx);

    @JSProperty
    int getMaxBitrate();

    @JSProperty
    void setMaxBitrate(int maxBitrate);

    @JSProperty
    double getMaxFramerate();

    @JSProperty
    void setMaxFramerate(double maxFramerate);

    @JSProperty
    @Nullable
    RTCPriorityType getPriority();

    @JSProperty
    void setPriority(RTCPriorityType priority);

    @JSProperty
    double getPtime();

    @JSProperty
    void setPtime(double ptime);

    @JSProperty
    double getScaleResolutionDownBy();

    @JSProperty
    void setScaleResolutionDownBy(double scaleResolutionDownBy);

}
