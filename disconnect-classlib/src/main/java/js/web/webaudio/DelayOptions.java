package js.web.webaudio;


import org.teavm.jso.JSProperty;


public interface DelayOptions extends AudioNodeOptions {
    @JSProperty
    double getDelayTime();

    @JSProperty
    void setDelayTime(double delayTime);

    @JSProperty
    double getMaxDelayTime();

    @JSProperty
    void setMaxDelayTime(double maxDelayTime);

}
