package js.web.webaudio;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface OscillatorOptions extends AudioNodeOptions {
    @JSProperty
    double getDetune();

    @JSProperty
    void setDetune(double detune);

    @JSProperty
    double getFrequency();

    @JSProperty
    void setFrequency(double frequency);

    @JSProperty
    @Nullable
    PeriodicWave getPeriodicWave();

    @JSProperty
    void setPeriodicWave(PeriodicWave periodicWave);

    @JSProperty
    @Nullable
    OscillatorType getType();

    @JSProperty
    void setType(OscillatorType type);

}
