package js.web.webaudio;

import js.util.buffers.Float32Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers.
 */
public interface BiquadFilterNode extends AudioNode {
    @JSBody(script = "return BiquadFilterNode.prototype")
    static BiquadFilterNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"context", "options"}, script = "return new BiquadFilterNode(context, options)")
    static BiquadFilterNode create(BaseAudioContext context, BiquadFilterOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "context", script = "return new BiquadFilterNode(context)")
    static BiquadFilterNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    AudioParam getQ();

    @JSProperty
    AudioParam getDetune();

    @JSProperty
    AudioParam getFrequency();

    @JSProperty
    AudioParam getGain();

    @JSProperty
    BiquadFilterType getType();

    @JSProperty
    void setType(BiquadFilterType type);

    void getFrequencyResponse(Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse);

}
