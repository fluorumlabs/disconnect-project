package js.web.webaudio;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface BiquadFilterOptions extends AudioNodeOptions {
    @JSProperty
    double getQ();

    @JSProperty
    void setQ(double Q);

    @JSProperty
    double getDetune();

    @JSProperty
    void setDetune(double detune);

    @JSProperty
    double getFrequency();

    @JSProperty
    void setFrequency(double frequency);

    @JSProperty
    double getGain();

    @JSProperty
    void setGain(double gain);

    @JSProperty
    @Nullable
    BiquadFilterType getType();

    @JSProperty
    void setType(BiquadFilterType type);

}
