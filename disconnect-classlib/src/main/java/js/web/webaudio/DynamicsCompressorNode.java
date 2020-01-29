package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Inherits properties from its parent, AudioNode. */
public interface DynamicsCompressorNode extends AudioNode {
    @JSProperty
    AudioParam getAttack();

    @JSProperty
    AudioParam getKnee();

    @JSProperty
    AudioParam getRatio();

    @JSProperty
    double getReduction();

    @JSProperty
    AudioParam getRelease();

    @JSProperty
    AudioParam getThreshold();

    @JSBody(script = "return DynamicsCompressorNode.prototype")
    static DynamicsCompressorNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context","options"}, script = "return new DynamicsCompressorNode(context, options)")
    static DynamicsCompressorNode create(BaseAudioContext context, DynamicsCompressorOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="context", script = "return new DynamicsCompressorNode(context)")
    static DynamicsCompressorNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


}
