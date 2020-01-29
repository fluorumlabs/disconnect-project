package js.web.webspeech;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface SpeechRecognitionAlternative extends Any {
        @JSProperty
        double getConfidence();

        @JSProperty
        String getTranscript();

        @JSBody(script = "return SpeechRecognitionAlternative.prototype")
        static SpeechRecognitionAlternative prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechRecognitionAlternative()")
        static SpeechRecognitionAlternative create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
