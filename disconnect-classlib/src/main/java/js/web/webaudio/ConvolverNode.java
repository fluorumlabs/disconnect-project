package js.web.webaudio;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** An AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to achieve a reverb effect. A ConvolverNode always has exactly one input and one output. */
public interface ConvolverNode extends AudioNode {
    @JSProperty
    @Nullable
    AudioBuffer  getBuffer();

    @JSProperty
    void setBuffer(AudioBuffer buffer);

    @JSProperty
    boolean isNormalize();

    @JSProperty
    void setNormalize(boolean normalize);

    @JSBody(script = "return ConvolverNode.prototype")
    static ConvolverNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context","options"}, script = "return new ConvolverNode(context, options)")
    static ConvolverNode create(BaseAudioContext context, ConvolverOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="context", script = "return new ConvolverNode(context)")
    static ConvolverNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
