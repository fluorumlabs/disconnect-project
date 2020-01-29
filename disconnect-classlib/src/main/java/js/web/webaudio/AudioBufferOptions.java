package js.web.webaudio;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface AudioBufferOptions extends Any {
    @JSProperty
    int getLength();

    @JSProperty
    void setLength(int length);

    @JSProperty
    int getNumberOfChannels();

    @JSProperty
    void setNumberOfChannels(int numberOfChannels);

    @JSProperty
    int getSampleRate();

    @JSProperty
    void setSampleRate(int sampleRate);

}
