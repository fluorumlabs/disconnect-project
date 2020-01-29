package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * AudioDestinationNode has no output (as it is the output, no more AudioNode can be linked after it in the audio graph) and one input. The number of channels in the input must be between 0 and the maxChannelCount value or an exception is raised.
 */
public interface AudioDestinationNode extends AudioNode {
    @JSBody(script = "return AudioDestinationNode.prototype")
    static AudioDestinationNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioDestinationNode()")
    static AudioDestinationNode create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getMaxChannelCount();


}
