package js.web.webanimations;


import org.teavm.jso.JSProperty;


public interface ComputedEffectTiming extends EffectTiming {
    @JSProperty
    double getActiveDuration();

    @JSProperty
    void setActiveDuration(double activeDuration);

    @JSProperty
    int getCurrentIteration();

    @JSProperty
    void setCurrentIteration(int currentIteration);

    @JSProperty
    double getEndTime();

    @JSProperty
    void setEndTime(double endTime);

    @JSProperty
    double getLocalTime();

    @JSProperty
    void setLocalTime(double localTime);

    @JSProperty
    double getProgress();

    @JSProperty
    void setProgress(double progress);

}
