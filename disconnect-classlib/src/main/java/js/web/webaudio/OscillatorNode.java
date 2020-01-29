package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone.
 */
public interface OscillatorNode extends AudioScheduledSourceNode {
    @JSBody(script = "return OscillatorNode.prototype")
    static OscillatorNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"context", "options"}, script = "return new OscillatorNode(context, options)")
    static OscillatorNode create(BaseAudioContext context, OscillatorOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "context", script = "return new OscillatorNode(context)")
    static OscillatorNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    AudioParam getDetune();

    @JSProperty
    AudioParam getFrequency();

    @JSProperty
    OscillatorType getType();

    @JSProperty
    void setType(OscillatorType type);

    void setPeriodicWave(PeriodicWave periodicWave);

}
