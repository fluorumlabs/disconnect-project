package js.web.webaudio;


import org.teavm.jso.JSProperty;


public interface GainOptions extends AudioNodeOptions {
    @JSProperty
    double getGain();

    @JSProperty
    void setGain(double gain);

}
