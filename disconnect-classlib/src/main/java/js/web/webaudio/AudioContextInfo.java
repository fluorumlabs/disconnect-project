package js.web.webaudio;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
