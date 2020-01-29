package js.web.webspeech;

import js.util.collections.Array;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This Web Speech API interface is the controller interface for the speech service; this can be used to retrieve information about the synthesis voices available on the device, start and pause speech, and other commands besides.
 */
public interface SpeechSynthesis extends EventTarget {
    @JSBody(script = "return SpeechSynthesis.prototype")
    static SpeechSynthesis prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SpeechSynthesis()")
    static SpeechSynthesis create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvoiceschanged();

    @JSProperty
    void setOnvoiceschanged(EventListener<Event> onvoiceschanged);

    default void addVoicesChangedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("voiceschanged", listener, options);
    }

    default void addVoicesChangedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("voiceschanged", listener, options);
    }

    default void addVoicesChangedEventListener(EventListener<Event> listener) {
        addEventListener("voiceschanged", listener);
    }

    default void removeVoicesChangedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("voiceschanged", listener, options);
    }

    default void removeVoicesChangedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("voiceschanged", listener, options);
    }

    default void removeVoicesChangedEventListener(EventListener<Event> listener) {
        removeEventListener("voiceschanged", listener);
    }

    @JSProperty
    boolean isPaused();

    @JSProperty
    boolean isPending();

    @JSProperty
    boolean isSpeaking();

    void cancel();

    Array<SpeechSynthesisVoice> getVoices();

    void pause();

    void resume();

    void speak(SpeechSynthesisUtterance utterance);

}
