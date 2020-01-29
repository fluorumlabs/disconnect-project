package js.web.webspeech;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.Event;


public interface SpeechRecognitionError extends Event {
        @JSProperty
        SpeechRecognitionErrorCode getError();

        @JSProperty
        String getMessage();

        @JSBody(script = "return SpeechRecognitionError.prototype")
        static SpeechRecognitionError prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechRecognitionError()")
        static SpeechRecognitionError create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
