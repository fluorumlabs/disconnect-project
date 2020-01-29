package js.web.webaudio;


import org.teavm.jso.JSProperty;


public interface AnalyserOptions extends AudioNodeOptions {
    @JSProperty
    int getFftSize();

    @JSProperty
    void setFftSize(double fftSize);

    @JSProperty
    double getMaxDecibels();

    @JSProperty
    void setMaxDecibels(double maxDecibels);

    @JSProperty
    double getMinDecibels();

    @JSProperty
    void setMinDecibels(double minDecibels);

    @JSProperty
    double getSmoothingTimeConstant();

    @JSProperty
    void setSmoothingTimeConstant(double smoothingTimeConstant);

}
