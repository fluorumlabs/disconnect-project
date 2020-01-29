package js.web.webspeech;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Unknown;
import js.web.dom.Document;
import js.web.dom.Event;


public interface SpeechRecognitionEvent extends Event {
        @JSProperty
        @Nullable
        Document getEmma();

        @JSProperty
        Unknown getInterpretation();

        @JSProperty
        double getResultIndex();

        @JSProperty
        SpeechRecognitionResultList getResults();

        @JSBody(script = "return SpeechRecognitionEvent.prototype")
        static SpeechRecognitionEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechRecognitionEvent()")
        static SpeechRecognitionEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
