package js.web.webaudio;

import js.lang.VoidPromise;
import js.web.dom.*;
import js.web.mediastreams.MediaStream;
import js.web.mediastreams.MediaStreamTrack;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** An audio-processing graph built from audio modules linked together, each represented by an AudioNode. */
public interface AudioContext extends BaseAudioContext {
    @JSProperty
    double getBaseLatency();

    @JSProperty
    double getOutputLatency();

    VoidPromise close();
    MediaElementAudioSourceNode createMediaElementSource(HTMLMediaElement mediaElement);
    MediaStreamAudioDestinationNode createMediaStreamDestination();
    MediaStreamAudioSourceNode createMediaStreamSource(MediaStream mediaStream);
    MediaStreamTrackAudioSourceNode createMediaStreamTrackSource(MediaStreamTrack mediaStreamTrack);
    AudioTimestamp getOutputTimestamp();
    VoidPromise resume();
    VoidPromise suspend();

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

    @JSBody(script = "return AudioContext.prototype")
    static AudioContext prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="contextOptions", script = "return new AudioContext(contextOptions)")
    static AudioContext create(AudioContextOptions contextOptions) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioContext()")
    static AudioContext create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
