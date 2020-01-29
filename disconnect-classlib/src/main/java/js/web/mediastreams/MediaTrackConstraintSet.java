package js.web.mediastreams;

import js.lang.Any;
import js.lang.Unknown;
import js.web.mediastreams.mediastreams.ConstrainBooleanParameters;
import js.web.mediastreams.mediastreams.ConstrainDOMStringParameters;
import js.web.mediastreams.mediastreams.ConstrainDoubleRange;
import js.web.mediastreams.mediastreams.ConstrainULongRange;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaTrackConstraintSet extends Any {
    @JSProperty
    @Nullable
    Unknown getAspectRatio();

    @JSProperty
    void setAspectRatio(ConstrainDoubleRange aspectRatio);

    @JSProperty
    void setAspectRatio(double aspectRatio);

    @JSProperty
    @Nullable
    Unknown getAutoGainControl();

    @JSProperty
    void setAutoGainControl(ConstrainBooleanParameters autoGainControl);

    @JSProperty
    void setAutoGainControl(boolean autoGainControl);

    @JSProperty
    @Nullable
    Unknown getChannelCount();

    @JSProperty
    void setChannelCount(ConstrainULongRange channelCount);

    @JSProperty
    void setChannelCount(int channelCount);

    @JSProperty
    @Nullable
    Unknown getDeviceId();

    @JSProperty
    void setDeviceId(ConstrainDOMStringParameters deviceId);

    @JSProperty
    void setDeviceId(String deviceId);

    @JSProperty
    void setDeviceId(@JSByRef String... deviceId);

    @JSProperty
    @Nullable
    Unknown getEchoCancellation();

    @JSProperty
    void setEchoCancellation(ConstrainBooleanParameters echoCancellation);

    @JSProperty
    void setEchoCancellation(boolean echoCancellation);

    @JSProperty
    @Nullable
    Unknown getFacingMode();

    @JSProperty
    void setFacingMode(ConstrainDOMStringParameters facingMode);

    @JSProperty
    void setFacingMode(String facingMode);

    @JSProperty
    void setFacingMode(@JSByRef String... facingMode);

    @JSProperty
    @Nullable
    Unknown getFrameRate();

    @JSProperty
    void setFrameRate(ConstrainDoubleRange frameRate);

    @JSProperty
    void setFrameRate(double frameRate);

    @JSProperty
    @Nullable
    Unknown getGroupId();

    @JSProperty
    void setGroupId(ConstrainDOMStringParameters groupId);

    @JSProperty
    void setGroupId(String groupId);

    @JSProperty
    void setGroupId(@JSByRef String... groupId);

    @JSProperty
    @Nullable
    Unknown getHeight();

    @JSProperty
    void setHeight(ConstrainULongRange height);

    @JSProperty
    void setHeight(int height);

    @JSProperty
    @Nullable
    Unknown getLatency();

    @JSProperty
    void setLatency(ConstrainDoubleRange latency);

    @JSProperty
    void setLatency(double latency);

    @JSProperty
    @Nullable
    Unknown getNoiseSuppression();

    @JSProperty
    void setNoiseSuppression(ConstrainBooleanParameters noiseSuppression);

    @JSProperty
    void setNoiseSuppression(boolean noiseSuppression);

    @JSProperty
    @Nullable
    Unknown getResizeMode();

    @JSProperty
    void setResizeMode(ConstrainDOMStringParameters resizeMode);

    @JSProperty
    void setResizeMode(String resizeMode);

    @JSProperty
    void setResizeMode(@JSByRef String... resizeMode);

    @JSProperty
    @Nullable
    Unknown getSampleRate();

    @JSProperty
    void setSampleRate(ConstrainULongRange sampleRate);

    @JSProperty
    void setSampleRate(int sampleRate);

    @JSProperty
    @Nullable
    Unknown getSampleSize();

    @JSProperty
    void setSampleSize(ConstrainULongRange sampleSize);

    @JSProperty
    void setSampleSize(int sampleSize);

    @JSProperty
    @Nullable
    Unknown getWidth();

    @JSProperty
    void setWidth(ConstrainULongRange width);

    @JSProperty
    void setWidth(int width);

}
