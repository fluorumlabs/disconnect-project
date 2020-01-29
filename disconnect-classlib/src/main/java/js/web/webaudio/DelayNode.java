package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** A delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data and its propagation to the output. */
public interface DelayNode extends AudioNode {
    @JSProperty
    AudioParam getDelayTime();

    @JSBody(script = "return DelayNode.prototype")
    static DelayNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context","options"}, script = "return new DelayNode(context, options)")
    static DelayNode create(BaseAudioContext context, DelayOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="context", script = "return new DelayNode(context)")
    static DelayNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
