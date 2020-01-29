package js.web.webaudio;

import js.lang.Promise;
import js.lang.VoidPromise;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** An AudioContext interface representing an audio-processing graph built from linked together AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext doesn't render the audio to the device hardware; instead, it generates it, as fast as it can, and outputs the result to an AudioBuffer. */
        public interface OfflineAudioContext extends BaseAudioContext {
        @JSProperty
        int getLength();

        @JSProperty
        @Nullable
        EventListener<OfflineAudioCompletionEvent> getOncomplete();

        @JSProperty
        void setOncomplete(EventListener<OfflineAudioCompletionEvent> oncomplete);

        default void addCompleteEventListener(EventListener<OfflineAudioCompletionEvent> listener, AddEventListenerOptions options) {
            addEventListener("complete", listener, options);
        }
        default void addCompleteEventListener(EventListener<OfflineAudioCompletionEvent> listener, boolean options) {
            addEventListener("complete", listener, options);
        }
        default void addCompleteEventListener(EventListener<OfflineAudioCompletionEvent> listener) {
            addEventListener("complete", listener);
        }

        default void removeCompleteEventListener(EventListener<OfflineAudioCompletionEvent> listener, EventListenerOptions options) {
            removeEventListener("complete", listener, options);
        }
        default void removeCompleteEventListener(EventListener<OfflineAudioCompletionEvent> listener, boolean options) {
            removeEventListener("complete", listener, options);
        }
        default void removeCompleteEventListener(EventListener<OfflineAudioCompletionEvent> listener) {
            removeEventListener("complete", listener);
        }
        VoidPromise resume();
        Promise<AudioBuffer> startRendering();
        VoidPromise suspend(double suspendTime);

        @JSBody(script = "return OfflineAudioContext.prototype")
        static OfflineAudioContext prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="contextOptions", script = "return new OfflineAudioContext(contextOptions)")
        static OfflineAudioContext create(OfflineAudioContextOptions contextOptions) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"numberOfChannels","length","sampleRate"}, script = "return new OfflineAudioContext(numberOfChannels, length, sampleRate)")
        static OfflineAudioContext create(int numberOfChannels, int length, int sampleRate) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
