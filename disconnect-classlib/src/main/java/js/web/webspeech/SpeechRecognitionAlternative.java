package js.web.webspeech;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SpeechRecognitionAlternative extends Any {
    @JSBody(script = "return SpeechRecognitionAlternative.prototype")
    static SpeechRecognitionAlternative prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SpeechRecognitionAlternative()")
    static SpeechRecognitionAlternative create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getConfidence();

    @JSProperty
    String getTranscript();

}
