package js.web.webspeech;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.Event;

/** This Web Speech API interface contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service. */
        public interface SpeechSynthesisEvent extends Event {
        @JSProperty
        int getCharIndex();

        @JSProperty
        double getElapsedTime();

        @JSProperty
        String getName();

        @JSProperty
        SpeechSynthesisUtterance getUtterance();

        @JSBody(script = "return SpeechSynthesisEvent.prototype")
        static SpeechSynthesisEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechSynthesisEvent()")
        static SpeechSynthesisEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
