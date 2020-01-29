package js.web.webanimations;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface EffectTiming extends Any {
    @JSProperty
    double getDelay();

    @JSProperty
    void setDelay(double delay);

    @JSProperty
    @Nullable
    PlaybackDirection getDirection();

    @JSProperty
    void setDirection(PlaybackDirection direction);

    @JSProperty
    @Nullable
    Unknown getDuration();

    @JSProperty
    void setDuration(double duration);

    @JSProperty
    void setDuration(String duration);

    @JSProperty
    @Nullable
    String getEasing();

    @JSProperty
    void setEasing(String easing);

    @JSProperty
    @Nullable
    double getEndDelay();

    @JSProperty
    void setEndDelay(double endDelay);

    @JSProperty
    @Nullable
    FillMode getFill();

    @JSProperty
    void setFill(FillMode fill);

    @JSProperty
    int getIterationStart();

    @JSProperty
    void setIterationStart(int iterationStart);

    @JSProperty
    int getIterations();

    @JSProperty
    void setIterations(int iterations);

}
