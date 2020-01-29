package js.web.webspeech;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SpeechRecognitionResult extends ArrayLike<SpeechRecognitionAlternative> {
    @JSBody(script = "return SpeechRecognitionResult.prototype")
    static SpeechRecognitionResult prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SpeechRecognitionResult()")
    static SpeechRecognitionResult create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isIsFinal();

    SpeechRecognitionAlternative item(int index);

}
