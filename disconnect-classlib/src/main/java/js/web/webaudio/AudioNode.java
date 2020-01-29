package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.EventTarget;

/** A generic interface for representing an audio processing module. Examples include: */
public interface AudioNode extends EventTarget {
    @JSProperty
    double getChannelCount();

    @JSProperty
    void setChannelCount(double channelCount);

    @JSProperty
    ChannelCountMode getChannelCountMode();

    @JSProperty
    void setChannelCountMode(ChannelCountMode channelCountMode);

    @JSProperty
    ChannelInterpretation getChannelInterpretation();

    @JSProperty
    void setChannelInterpretation(ChannelInterpretation channelInterpretation);

    @JSProperty
    BaseAudioContext getContext();

    @JSProperty
    int getNumberOfInputs();

    @JSProperty
    int getNumberOfOutputs();

    AudioNode connect(AudioNode destinationNode, int output, int input);
    AudioNode connect(AudioNode destinationNode, int output);
    AudioNode connect(AudioNode destinationNode);
    void connect(AudioParam destinationParam, int output);
    void connect(AudioParam destinationParam);
    void disconnect();
    void disconnect(int output);
    void disconnect(AudioNode destinationNode);
    void disconnect(AudioNode destinationNode, int output);
    void disconnect(AudioNode destinationNode, int output, int input);
    void disconnect(AudioParam destinationParam);
    void disconnect(AudioParam destinationParam, int output);

    @JSBody(script = "return AudioNode.prototype")
    static AudioNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioNode()")
    static AudioNode create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
