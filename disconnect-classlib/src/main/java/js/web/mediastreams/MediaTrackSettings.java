package js.web.mediastreams;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface MediaTrackSettings extends Any {
    @JSProperty
    double getAspectRatio();

    @JSProperty
    void setAspectRatio(double aspectRatio);

    @JSProperty
    boolean isAutoGainControl();

    @JSProperty
    void setAutoGainControl(boolean autoGainControl);

    @JSProperty
    int getChannelCount();

    @JSProperty
    void setChannelCount(int channelCount);

    @JSProperty
    @Nullable
    String getDeviceId();

    @JSProperty
    void setDeviceId(String deviceId);

    @JSProperty
    boolean isEchoCancellation();

    @JSProperty
    void setEchoCancellation(boolean echoCancellation);

    @JSProperty
    @Nullable
    String getFacingMode();

    @JSProperty
    void setFacingMode(String facingMode);

    @JSProperty
    double getFrameRate();

    @JSProperty
    void setFrameRate(double frameRate);

    @JSProperty
    @Nullable
    String getGroupId();

    @JSProperty
    void setGroupId(String groupId);

    @JSProperty
    int getHeight();

    @JSProperty
    void setHeight(int height);

    @JSProperty
    double getLatency();

    @JSProperty
    void setLatency(double latency);

    @JSProperty
    boolean isNoiseSuppression();

    @JSProperty
    void setNoiseSuppression(boolean noiseSuppression);

    @JSProperty
    @Nullable
    String getResizeMode();

    @JSProperty
    void setResizeMode(String resizeMode);

    @JSProperty
    int getSampleRate();

    @JSProperty
    void setSampleRate(int sampleRate);

    @JSProperty
    int getSampleSize();

    @JSProperty
    void setSampleSize(int sampleSize);

    @JSProperty
    int getWidth();

    @JSProperty
    void setWidth(int width);

}
