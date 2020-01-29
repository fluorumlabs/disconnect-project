package js.web.webspeech;

import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This Web Speech API interface represents a speech request. It contains the content the speech service should read and information about how to read it (e.g. language, pitch and volume.) */
        public interface SpeechSynthesisUtterance extends EventTarget {
        @JSProperty
        String getLang();

        @JSProperty
        void setLang(String lang);

        @JSProperty
        @Nullable
        EventListener<SpeechSynthesisEvent> getOnboundary();

        @JSProperty
        void setOnboundary(EventListener<SpeechSynthesisEvent> onboundary);

        default void addBoundaryEventListener(EventListener<SpeechSynthesisEvent> listener, AddEventListenerOptions options) {
            addEventListener("boundary", listener, options);
        }
        default void addBoundaryEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            addEventListener("boundary", listener, options);
        }
        default void addBoundaryEventListener(EventListener<SpeechSynthesisEvent> listener) {
            addEventListener("boundary", listener);
        }

        default void removeBoundaryEventListener(EventListener<SpeechSynthesisEvent> listener, EventListenerOptions options) {
            removeEventListener("boundary", listener, options);
        }
        default void removeBoundaryEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            removeEventListener("boundary", listener, options);
        }
        default void removeBoundaryEventListener(EventListener<SpeechSynthesisEvent> listener) {
            removeEventListener("boundary", listener);
        }
        @JSProperty
        @Nullable
        EventListener<SpeechSynthesisEvent> getOnend();

        @JSProperty
        void setOnend(EventListener<SpeechSynthesisEvent> onend);

        default void addEndEventListener(EventListener<SpeechSynthesisEvent> listener, AddEventListenerOptions options) {
            addEventListener("end", listener, options);
        }
        default void addEndEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            addEventListener("end", listener, options);
        }
        default void addEndEventListener(EventListener<SpeechSynthesisEvent> listener) {
            addEventListener("end", listener);
        }

        default void removeEndEventListener(EventListener<SpeechSynthesisEvent> listener, EventListenerOptions options) {
            removeEventListener("end", listener, options);
        }
        default void removeEndEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            removeEventListener("end", listener, options);
        }
        default void removeEndEventListener(EventListener<SpeechSynthesisEvent> listener) {
            removeEventListener("end", listener);
        }
        @JSProperty
        @Nullable
        EventListener<SpeechSynthesisErrorEvent> getOnerror();

        @JSProperty
        void setOnerror(EventListener<SpeechSynthesisErrorEvent> onerror);

        default void addErrorEventListener(EventListener<SpeechSynthesisErrorEvent> listener, AddEventListenerOptions options) {
            addEventListener("error", listener, options);
        }
        default void addErrorEventListener(EventListener<SpeechSynthesisErrorEvent> listener, boolean options) {
            addEventListener("error", listener, options);
        }
        default void addErrorEventListener(EventListener<SpeechSynthesisErrorEvent> listener) {
            addEventListener("error", listener);
        }

        default void removeErrorEventListener(EventListener<SpeechSynthesisErrorEvent> listener, EventListenerOptions options) {
            removeEventListener("error", listener, options);
        }
        default void removeErrorEventListener(EventListener<SpeechSynthesisErrorEvent> listener, boolean options) {
            removeEventListener("error", listener, options);
        }
        default void removeErrorEventListener(EventListener<SpeechSynthesisErrorEvent> listener) {
            removeEventListener("error", listener);
        }
        @JSProperty
        @Nullable
        EventListener<SpeechSynthesisEvent> getOnmark();

        @JSProperty
        void setOnmark(EventListener<SpeechSynthesisEvent> onmark);

        default void addMarkEventListener(EventListener<SpeechSynthesisEvent> listener, AddEventListenerOptions options) {
            addEventListener("mark", listener, options);
        }
        default void addMarkEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            addEventListener("mark", listener, options);
        }
        default void addMarkEventListener(EventListener<SpeechSynthesisEvent> listener) {
            addEventListener("mark", listener);
        }

        default void removeMarkEventListener(EventListener<SpeechSynthesisEvent> listener, EventListenerOptions options) {
            removeEventListener("mark", listener, options);
        }
        default void removeMarkEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            removeEventListener("mark", listener, options);
        }
        default void removeMarkEventListener(EventListener<SpeechSynthesisEvent> listener) {
            removeEventListener("mark", listener);
        }
        @JSProperty
        @Nullable
        EventListener<SpeechSynthesisEvent> getOnpause();

        @JSProperty
        void setOnpause(EventListener<SpeechSynthesisEvent> onpause);

        default void addPauseEventListener(EventListener<SpeechSynthesisEvent> listener, AddEventListenerOptions options) {
            addEventListener("pause", listener, options);
        }
        default void addPauseEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            addEventListener("pause", listener, options);
        }
        default void addPauseEventListener(EventListener<SpeechSynthesisEvent> listener) {
            addEventListener("pause", listener);
        }

        default void removePauseEventListener(EventListener<SpeechSynthesisEvent> listener, EventListenerOptions options) {
            removeEventListener("pause", listener, options);
        }
        default void removePauseEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            removeEventListener("pause", listener, options);
        }
        default void removePauseEventListener(EventListener<SpeechSynthesisEvent> listener) {
            removeEventListener("pause", listener);
        }
        @JSProperty
        @Nullable
        EventListener<SpeechSynthesisEvent> getOnresume();

        @JSProperty
        void setOnresume(EventListener<SpeechSynthesisEvent> onresume);

        default void addResumeEventListener(EventListener<SpeechSynthesisEvent> listener, AddEventListenerOptions options) {
            addEventListener("resume", listener, options);
        }
        default void addResumeEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            addEventListener("resume", listener, options);
        }
        default void addResumeEventListener(EventListener<SpeechSynthesisEvent> listener) {
            addEventListener("resume", listener);
        }

        default void removeResumeEventListener(EventListener<SpeechSynthesisEvent> listener, EventListenerOptions options) {
            removeEventListener("resume", listener, options);
        }
        default void removeResumeEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            removeEventListener("resume", listener, options);
        }
        default void removeResumeEventListener(EventListener<SpeechSynthesisEvent> listener) {
            removeEventListener("resume", listener);
        }
        @JSProperty
        @Nullable
        EventListener<SpeechSynthesisEvent> getOnstart();

        @JSProperty
        void setOnstart(EventListener<SpeechSynthesisEvent> onstart);

        default void addStartEventListener(EventListener<SpeechSynthesisEvent> listener, AddEventListenerOptions options) {
            addEventListener("start", listener, options);
        }
        default void addStartEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            addEventListener("start", listener, options);
        }
        default void addStartEventListener(EventListener<SpeechSynthesisEvent> listener) {
            addEventListener("start", listener);
        }

        default void removeStartEventListener(EventListener<SpeechSynthesisEvent> listener, EventListenerOptions options) {
            removeEventListener("start", listener, options);
        }
        default void removeStartEventListener(EventListener<SpeechSynthesisEvent> listener, boolean options) {
            removeEventListener("start", listener, options);
        }
        default void removeStartEventListener(EventListener<SpeechSynthesisEvent> listener) {
            removeEventListener("start", listener);
        }
        @JSProperty
        double getPitch();

        @JSProperty
        void setPitch(double pitch);

        @JSProperty
        double getRate();

        @JSProperty
        void setRate(double rate);

        @JSProperty
        String getText();

        @JSProperty
        void setText(String text);

        @JSProperty
        SpeechSynthesisVoice getVoice();

        @JSProperty
        void setVoice(SpeechSynthesisVoice voice);

        @JSProperty
        double getVolume();

        @JSProperty
        void setVolume(double volume);

        @JSBody(script = "return SpeechSynthesisUtterance.prototype")
        static SpeechSynthesisUtterance prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechSynthesisUtterance()")
        static SpeechSynthesisUtterance create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="text", script = "return new SpeechSynthesisUtterance(text)")
        static SpeechSynthesisUtterance create(String text) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
