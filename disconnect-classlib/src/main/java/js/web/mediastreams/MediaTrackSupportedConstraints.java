package js.web.mediastreams;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface MediaTrackSupportedConstraints extends Any {
    @JSProperty
    boolean isAspectRatio();

    @JSProperty
    void setAspectRatio(boolean aspectRatio);

    @JSProperty
    boolean isAutoGainControl();

    @JSProperty
    void setAutoGainControl(boolean autoGainControl);

    @JSProperty
    boolean isChannelCount();

    @JSProperty
    void setChannelCount(boolean channelCount);

    @JSProperty
    boolean isDeviceId();

    @JSProperty
    void setDeviceId(boolean deviceId);

    @JSProperty
    boolean isEchoCancellation();

    @JSProperty
    void setEchoCancellation(boolean echoCancellation);

    @JSProperty
    boolean isFacingMode();

    @JSProperty
    void setFacingMode(boolean facingMode);

    @JSProperty
    boolean isFrameRate();

    @JSProperty
    void setFrameRate(boolean frameRate);

    @JSProperty
    boolean isGroupId();

    @JSProperty
    void setGroupId(boolean groupId);

    @JSProperty
    boolean isHeight();

    @JSProperty
    void setHeight(boolean height);

    @JSProperty
    boolean isLatency();

    @JSProperty
    void setLatency(boolean latency);

    @JSProperty
    boolean isNoiseSuppression();

    @JSProperty
    void setNoiseSuppression(boolean noiseSuppression);

    @JSProperty
    boolean isResizeMode();

    @JSProperty
    void setResizeMode(boolean resizeMode);

    @JSProperty
    boolean isSampleRate();

    @JSProperty
    void setSampleRate(boolean sampleRate);

    @JSProperty
    boolean isSampleSize();

    @JSProperty
    void setSampleSize(boolean sampleSize);

    @JSProperty
    boolean isWidth();

    @JSProperty
    void setWidth(boolean width);

}
