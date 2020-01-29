package js.web.webaudio;

import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * An AudioScheduledSourceNode which represents an audio source consisting of in-memory audio data, stored in an AudioBuffer. It's especially useful for playing back audio which has particularly stringent timing accuracy requirements, such as for sounds that must match a specific rhythm and can be kept in memory rather than being played from disk or the network.
 */
public interface AudioBufferSourceNode extends AudioScheduledSourceNode {
    @JSBody(script = "return AudioBufferSourceNode.prototype")
    static AudioBufferSourceNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"context", "options"}, script = "return new AudioBufferSourceNode(context, options)")
    static AudioBufferSourceNode create(BaseAudioContext context, AudioBufferSourceOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "context", script = "return new AudioBufferSourceNode(context)")
    static AudioBufferSourceNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    AudioBuffer getBuffer();

    @JSProperty
    void setBuffer(AudioBuffer buffer);

    @JSProperty
    AudioParam getDetune();

    @JSProperty
    boolean isLoop();

    @JSProperty
    void setLoop(boolean loop);

    @JSProperty
    int getLoopEnd();

    @JSProperty
    void setLoopEnd(int loopEnd);

    @JSProperty
    int getLoopStart();

    @JSProperty
    void setLoopStart(int loopStart);

    @JSProperty
    AudioParam getPlaybackRate();

    void start(double when, int offset, double duration);

    void start(double when, int offset);

    void start(double when);

    void start();

    default void addEndedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("ended", listener, options);
    }

    default void addEndedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("ended", listener, options);
    }

    default void addEndedEventListener(EventListener<Event> listener) {
        addEventListener("ended", listener);
    }

    default void removeEndedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("ended", listener, options);
    }

    default void removeEndedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("ended", listener, options);
    }

    default void removeEndedEventListener(EventListener<Event> listener) {
        removeEventListener("ended", listener);
    }

}
