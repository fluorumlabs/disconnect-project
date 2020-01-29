package js.web.webspeech;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SpeechRecognitionError extends Event {
    @JSBody(script = "return SpeechRecognitionError.prototype")
    static SpeechRecognitionError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SpeechRecognitionError()")
    static SpeechRecognitionError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SpeechRecognitionErrorCode getError();

    @JSProperty
    String getMessage();

}
