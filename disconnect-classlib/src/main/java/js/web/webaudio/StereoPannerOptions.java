package js.web.webaudio;


import org.teavm.jso.JSProperty;


public interface StereoPannerOptions extends AudioNodeOptions {
    @JSProperty
    double getPan();

    @JSProperty
    void setPan(double pan);

}
