package js.web.webspeech;

import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/23/2020.
 */
public interface SpeechRecognition extends EventTarget {
    @JSBody(script = "return SpeechRecognition.prototype")
    static SpeechRecognition prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SpeechRecognition()")
    static SpeechRecognition create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isContinuous();

    @JSProperty
    void setContinuous(boolean continuous);

    @JSProperty
    SpeechGrammarList getGrammars();

    @JSProperty
    void setGrammars(SpeechGrammarList grammars);

    @JSProperty
    boolean isInterimResults();

    @JSProperty
    void setInterimResults(boolean interimResults);

    @JSProperty
    String getLang();

    @JSProperty
    void setLang(String lang);

    @JSProperty
    double getMaxAlternatives();

    @JSProperty
    void setMaxAlternatives(double maxAlternatives);

    @JSProperty
    @Nullable
    EventListener<Event> getOnaudioend();

    @JSProperty
    void setOnaudioend(EventListener<Event> onaudioend);

    default void addAudioEndEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("audioend", listener, options);
    }

    default void addAudioEndEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("audioend", listener, options);
    }

    default void addAudioEndEventListener(EventListener<Event> listener) {
        addEventListener("audioend", listener);
    }

    default void removeAudioEndEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("audioend", listener, options);
    }

    default void removeAudioEndEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("audioend", listener, options);
    }

    default void removeAudioEndEventListener(EventListener<Event> listener) {
        removeEventListener("audioend", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnaudiostart();

    @JSProperty
    void setOnaudiostart(EventListener<Event> onaudiostart);

    default void addAudioStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("audiostart", listener, options);
    }

    default void addAudioStartEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("audiostart", listener, options);
    }

    default void addAudioStartEventListener(EventListener<Event> listener) {
        addEventListener("audiostart", listener);
    }

    default void removeAudioStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("audiostart", listener, options);
    }

    default void removeAudioStartEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("audiostart", listener, options);
    }

    default void removeAudioStartEventListener(EventListener<Event> listener) {
        removeEventListener("audiostart", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnend();

    @JSProperty
    void setOnend(EventListener<Event> onend);

    default void addEndEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("end", listener, options);
    }

    default void addEndEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("end", listener, options);
    }

    default void addEndEventListener(EventListener<Event> listener) {
        addEventListener("end", listener);
    }

    default void removeEndEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("end", listener, options);
    }

    default void removeEndEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("end", listener, options);
    }

    default void removeEndEventListener(EventListener<Event> listener) {
        removeEventListener("end", listener);
    }

    @JSProperty
    @Nullable
    EventListener<SpeechRecognitionError> getOnerror();

    @JSProperty
    void setOnerror(EventListener<SpeechRecognitionError> onerror);

    default void addErrorEventListener(EventListener<SpeechRecognitionError> listener, AddEventListenerOptions options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<SpeechRecognitionError> listener, boolean options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<SpeechRecognitionError> listener) {
        addEventListener("error", listener);
    }

    default void removeErrorEventListener(EventListener<SpeechRecognitionError> listener, EventListenerOptions options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<SpeechRecognitionError> listener, boolean options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<SpeechRecognitionError> listener) {
        removeEventListener("error", listener);
    }

    @JSProperty
    @Nullable
    EventListener<SpeechRecognitionEvent> getOnresult();

    @JSProperty
    void setOnresult(EventListener<SpeechRecognitionEvent> onresult);

    default void addResultEventListener(EventListener<SpeechRecognitionEvent> listener, AddEventListenerOptions options) {
        addEventListener("result", listener, options);
    }

    default void addResultEventListener(EventListener<SpeechRecognitionEvent> listener, boolean options) {
        addEventListener("result", listener, options);
    }

    default void addResultEventListener(EventListener<SpeechRecognitionEvent> listener) {
        addEventListener("result", listener);
    }

    default void removeResultEventListener(EventListener<SpeechRecognitionEvent> listener, EventListenerOptions options) {
        removeEventListener("result", listener, options);
    }

    default void removeResultEventListener(EventListener<SpeechRecognitionEvent> listener, boolean options) {
        removeEventListener("result", listener, options);
    }

    default void removeResultEventListener(EventListener<SpeechRecognitionEvent> listener) {
        removeEventListener("result", listener);
    }

    @JSProperty
    @Nullable
    EventListener<SpeechRecognitionEvent> getOnnomatch();

    @JSProperty
    void setOnnomatch(EventListener<SpeechRecognitionEvent> onnomatch);

    default void addNoMatchEventListener(EventListener<SpeechRecognitionEvent> listener, AddEventListenerOptions options) {
        addEventListener("nomatch", listener, options);
    }

    default void addNoMatchEventListener(EventListener<SpeechRecognitionEvent> listener, boolean options) {
        addEventListener("nomatch", listener, options);
    }

    default void addNoMatchEventListener(EventListener<SpeechRecognitionEvent> listener) {
        addEventListener("nomatch", listener);
    }

    default void removeNoMatchEventListener(EventListener<SpeechRecognitionEvent> listener, EventListenerOptions options) {
        removeEventListener("nomatch", listener, options);
    }

    default void removeNoMatchEventListener(EventListener<SpeechRecognitionEvent> listener, boolean options) {
        removeEventListener("nomatch", listener, options);
    }

    default void removeNoMatchEventListener(EventListener<SpeechRecognitionEvent> listener) {
        removeEventListener("nomatch", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnsoundend();

    @JSProperty
    void setOnsoundend(EventListener<Event> onsoundend);

    default void addSoundEndEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("soundend", listener, options);
    }

    default void addSoundEndEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("soundend", listener, options);
    }

    default void addSoundEndEventListener(EventListener<Event> listener) {
        addEventListener("soundend", listener);
    }

    default void removeSoundEndEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("soundend", listener, options);
    }

    default void removeSoundEndEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("soundend", listener, options);
    }

    default void removeSoundEndEventListener(EventListener<Event> listener) {
        removeEventListener("soundend", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnsoundstart();

    @JSProperty
    void setOnsoundstart(EventListener<Event> onsoundstart);

    default void addSoundStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("soundstart", listener, options);
    }

    default void addSoundStartEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("soundstart", listener, options);
    }

    default void addSoundStartEventListener(EventListener<Event> listener) {
        addEventListener("soundstart", listener);
    }

    default void removeSoundStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("soundstart", listener, options);
    }

    default void removeSoundStartEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("soundstart", listener, options);
    }

    default void removeSoundStartEventListener(EventListener<Event> listener) {
        removeEventListener("soundstart", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnspeechend();

    @JSProperty
    void setOnspeechend(EventListener<Event> onspeechend);

    default void addSpeechEndEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("speechend", listener, options);
    }

    default void addSpeechEndEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("speechend", listener, options);
    }

    default void addSpeechEndEventListener(EventListener<Event> listener) {
        addEventListener("speechend", listener);
    }

    default void removeSpeechEndEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("speechend", listener, options);
    }

    default void removeSpeechEndEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("speechend", listener, options);
    }

    default void removeSpeechEndEventListener(EventListener<Event> listener) {
        removeEventListener("speechend", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnspeechstart();

    @JSProperty
    void setOnspeechstart(EventListener<Event> onspeechstart);

    default void addSpeechStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("speechstart", listener, options);
    }

    default void addSpeechStartEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("speechstart", listener, options);
    }

    default void addSpeechStartEventListener(EventListener<Event> listener) {
        addEventListener("speechstart", listener);
    }

    default void removeSpeechStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("speechstart", listener, options);
    }

    default void removeSpeechStartEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("speechstart", listener, options);
    }

    default void removeSpeechStartEventListener(EventListener<Event> listener) {
        removeEventListener("speechstart", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnstart();

    @JSProperty
    void setOnstart(EventListener<Event> onstart);

    default void addStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("start", listener, options);
    }

    default void addStartEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("start", listener, options);
    }

    default void addStartEventListener(EventListener<Event> listener) {
        addEventListener("start", listener);
    }

    default void removeStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("start", listener, options);
    }

    default void removeStartEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("start", listener, options);
    }

    default void removeStartEventListener(EventListener<Event> listener) {
        removeEventListener("start", listener);
    }

    @JSProperty
    String getServiceURI();

    @JSProperty
    void setServiceURI(String serviceURI);

    void abort();

    void start();

    void stop();

}
