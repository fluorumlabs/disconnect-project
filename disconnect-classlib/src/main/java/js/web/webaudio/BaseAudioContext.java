package js.web.webaudio;

import js.lang.Promise;
import js.util.buffers.ArrayBuffer;
import js.util.buffers.Float32Array;
import js.util.function.JsConsumer;
import js.util.iterable.DoubleIterable;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface BaseAudioContext extends EventTarget {
    @JSProperty
    AudioWorklet getAudioWorklet();

    @JSProperty
    double getCurrentTime();

    @JSProperty
    AudioDestinationNode getDestination();

    @JSProperty
    AudioListener getListener();

    @JSProperty
    int getSampleRate();

    @JSProperty
    AudioContextState getState();

    AnalyserNode createAnalyser();
    BiquadFilterNode createBiquadFilter();
    AudioBuffer createBuffer(int numberOfChannels, int length, int sampleRate);
    AudioBufferSourceNode createBufferSource();
    ChannelMergerNode createChannelMerger(int numberOfInputs);
    ChannelMergerNode createChannelMerger();
    ChannelSplitterNode createChannelSplitter(int numberOfOutputs);
    ChannelSplitterNode createChannelSplitter();
    ConstantSourceNode createConstantSource();
    ConvolverNode createConvolver();
    DelayNode createDelay(double maxDelayTime);
    DelayNode createDelay();
    DynamicsCompressorNode createDynamicsCompressor();
    GainNode createGain();
    IIRFilterNode createIIRFilter(@JSByRef double[] feedforward, @JSByRef double[] feedback);
    IIRFilterNode createIIRFilter(@JSByRef DoubleIterable feedforward, @JSByRef DoubleIterable feedback);
    OscillatorNode createOscillator();
    PannerNode createPanner();
    PeriodicWave createPeriodicWave(@JSByRef double[] real, @JSByRef double[] imag, PeriodicWaveConstraints constraints);
    PeriodicWave createPeriodicWave(Float32Array real, Float32Array imag, PeriodicWaveConstraints constraints);
    PeriodicWave createPeriodicWave(DoubleIterable real, DoubleIterable imag, PeriodicWaveConstraints constraints);
    PeriodicWave createPeriodicWave(@JSByRef double[] real, @JSByRef double[] imag);
    PeriodicWave createPeriodicWave(Float32Array real, Float32Array imag);
    PeriodicWave createPeriodicWave(DoubleIterable real, DoubleIterable imag);
    ScriptProcessorNode createScriptProcessor(int bufferSize, int numberOfInputChannels, int numberOfOutputChannels);
    ScriptProcessorNode createScriptProcessor(int bufferSize, int numberOfInputChannels);
    ScriptProcessorNode createScriptProcessor(int bufferSize);
    ScriptProcessorNode createScriptProcessor();
    StereoPannerNode createStereoPanner();
    WaveShaperNode createWaveShaper();
    Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData, JsConsumer<AudioBuffer> successCallback, JsConsumer<DOMException> errorCallback);
    Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData, JsConsumer<AudioBuffer> successCallback);
    Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData);

    @JSProperty
    @Nullable
    EventListener<Event> getOnstatechange();

    @JSProperty
    void setOnstatechange(EventListener<Event> onstatechange);

    default void addStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("statechange", listener, options);
    }
    default void addStateChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("statechange", listener, options);
    }
    default void addStateChangeEventListener(EventListener<Event> listener) {
        addEventListener("statechange", listener);
    }

    default void removeStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("statechange", listener, options);
    }
    default void removeStateChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("statechange", listener, options);
    }
    default void removeStateChangeEventListener(EventListener<Event> listener) {
        removeEventListener("statechange", listener);
    }

    @JSBody(script = "return BaseAudioContext.prototype")
    static BaseAudioContext prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new BaseAudioContext()")
    static BaseAudioContext create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
