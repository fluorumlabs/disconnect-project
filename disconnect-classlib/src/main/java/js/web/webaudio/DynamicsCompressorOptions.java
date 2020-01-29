package js.web.webaudio;


import org.teavm.jso.JSProperty;


public interface DynamicsCompressorOptions extends AudioNodeOptions {
    @JSProperty
    double getAttack();

    @JSProperty
    void setAttack(double attack);

    @JSProperty
    double getKnee();

    @JSProperty
    void setKnee(double knee);

    @JSProperty
    double getRatio();

    @JSProperty
    void setRatio(double ratio);

    @JSProperty
    double getRelease();

    @JSProperty
    void setRelease(double release);

    @JSProperty
    double getThreshold();

    @JSProperty
    void setThreshold(double threshold);

}
