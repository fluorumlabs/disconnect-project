package js.web.webaudio;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface AudioContextOptions extends Any {
    @JSProperty
    @Nullable
    Unknown getLatencyHint();

    @JSProperty
    void setLatencyHint(AudioContextLatencyCategory latencyHint);

    @JSProperty
    void setLatencyHint(double latencyHint);

    @JSProperty
    int getSampleRate();

    @JSProperty
    void setSampleRate(int sampleRate);

}
