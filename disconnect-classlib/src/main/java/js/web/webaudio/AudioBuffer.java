package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.util.buffers.Float32Array;

/** A short audio asset residing in memory, created from an audio file using the AudioContext.decodeAudioData() method, or from raw data using AudioContext.createBuffer(). Once put into an AudioBuffer, the audio can then be played by being passed into an AudioBufferSourceNode. */
public interface AudioBuffer extends Any {
    @JSProperty
    double getDuration();

    @JSProperty
    int getLength();

    @JSProperty
    int getNumberOfChannels();

    @JSProperty
    int getSampleRate();

    void copyFromChannel(Float32Array destination, int channelNumber, int startInChannel);
    void copyFromChannel(Float32Array destination, int channelNumber);
    void copyToChannel(Float32Array source, int channelNumber, int startInChannel);
    void copyToChannel(Float32Array source, int channelNumber);
    Float32Array getChannelData(int channel);

    @JSBody(script = "return AudioBuffer.prototype")
    static AudioBuffer prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="options", script = "return new AudioBuffer(options)")
    static AudioBuffer create(AudioBufferOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
