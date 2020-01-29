package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.util.buffers.Float32Array;
import js.util.buffers.Uint8Array;

/** A node able to provide real-time frequency and time-domain analysis information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you to take the generated data, process it, and create audio visualizations. */
public interface AnalyserNode extends AudioNode {
    @JSProperty
    int getFftSize();

    @JSProperty
    void setFftSize(int fftSize);

    @JSProperty
    int getFrequencyBinCount();

    @JSProperty
    double getMaxDecibels();

    @JSProperty
    void setMaxDecibels(double maxDecibels);

    @JSProperty
    double getMinDecibels();

    @JSProperty
    void setMinDecibels(double minDecibels);

    @JSProperty
    double getSmoothingTimeConstant();

    @JSProperty
    void setSmoothingTimeConstant(double smoothingTimeConstant);

    void getByteFrequencyData(Uint8Array array);
    void getByteTimeDomainData(Uint8Array array);
    void getFloatFrequencyData(Float32Array array);
    void getFloatTimeDomainData(Float32Array array);

    @JSBody(params={"context","options"}, script = "return new AnalyserNode(context, options)")
    static AnalyserNode create(BaseAudioContext context, AnalyserOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context"}, script = "return new AnalyserNode(context)")
    static AnalyserNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return AnalyserNode.prototype")
    static AnalyserNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
