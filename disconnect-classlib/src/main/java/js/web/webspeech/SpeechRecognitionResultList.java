package js.web.webspeech;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;


public interface SpeechRecognitionResultList extends ArrayLike<SpeechRecognitionResult> {

         SpeechRecognitionResult item(int index);

    @JSBody(script = "return SpeechRecognitionResultList.prototype")
    static SpeechRecognitionResultList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechRecognitionResultList()")
        static SpeechRecognitionResultList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
