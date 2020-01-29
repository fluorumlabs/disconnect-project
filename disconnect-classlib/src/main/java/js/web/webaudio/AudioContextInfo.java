package js.web.webaudio;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface AudioContextInfo extends Any {
    @JSProperty
    double getCurrentTime();

    @JSProperty
    void setCurrentTime(double currentTime);

    @JSProperty
    int getSampleRate();

    @JSProperty
    void setSampleRate(int sampleRate);

}
