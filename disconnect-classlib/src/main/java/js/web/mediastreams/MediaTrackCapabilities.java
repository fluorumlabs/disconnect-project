package js.web.mediastreams;

import js.lang.Any;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaTrackCapabilities extends Any {
    @JSProperty
    @Nullable
    DoubleRange getAspectRatio();

    @JSProperty
    void setAspectRatio(DoubleRange aspectRatio);

    @JSProperty
    @Nullable
    boolean[] isAutoGainControl();

    @JSProperty
    void setAutoGainControl(boolean... autoGainControl);

    @JSProperty
    @Nullable
    ULongRange getChannelCount();

    @JSProperty
    void setChannelCount(ULongRange channelCount);

    @JSProperty
    @Nullable
    String getDeviceId();

    @JSProperty
    void setDeviceId(String deviceId);

    @JSProperty
    @Nullable
    boolean[] isEchoCancellation();

    @JSProperty
    void setEchoCancellation(boolean... echoCancellation);

    @JSProperty
    @Nullable
    String[] getFacingMode();

    @JSProperty
    void setFacingMode(String... facingMode);

    @JSProperty
    @Nullable
    DoubleRange getFrameRate();

    @JSProperty
    void setFrameRate(DoubleRange frameRate);

    @JSProperty
    @Nullable
    String getGroupId();

    @JSProperty
    void setGroupId(String groupId);

    @JSProperty
    @Nullable
    ULongRange getHeight();

    @JSProperty
    void setHeight(ULongRange height);

    @JSProperty
    @Nullable
    DoubleRange getLatency();

    @JSProperty
    void setLatency(DoubleRange latency);

    @JSProperty
    @Nullable
    boolean[] isNoiseSuppression();

    @JSProperty
    void setNoiseSuppression(boolean... noiseSuppression);

    @JSProperty
    @Nullable
    String[] getResizeMode();

    @JSProperty
    void setResizeMode(String... resizeMode);

    @JSProperty
    @Nullable
    ULongRange getSampleRate();

    @JSProperty
    void setSampleRate(ULongRange sampleRate);

    @JSProperty
    @Nullable
    ULongRange getSampleSize();

    @JSProperty
    void setSampleSize(ULongRange sampleSize);

    @JSProperty
    @Nullable
    ULongRange getWidth();

    @JSProperty
    void setWidth(ULongRange width);

}
