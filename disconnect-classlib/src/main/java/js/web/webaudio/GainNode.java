package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** A change in volume. It is an AudioNode audio-processing module that causes a given gain to be applied to the input data before its propagation to the output. A GainNode always has exactly one input and one output, both with the same number of channels. */
public interface GainNode extends AudioNode {
    @JSProperty
    AudioParam getGain();

    @JSBody(script = "return GainNode.prototype")
    static GainNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context","options"}, script = "return new GainNode(context, options)")
    static GainNode create(BaseAudioContext context, GainOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="context", script = "return new GainNode(context)")
    static GainNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
