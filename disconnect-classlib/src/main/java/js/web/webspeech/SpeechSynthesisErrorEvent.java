package js.web.webspeech;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SpeechSynthesisErrorEvent extends SpeechSynthesisEvent {
        @JSProperty
        SpeechSynthesisErrorCode getError();

        @JSBody(script = "return SpeechSynthesisErrorEvent.prototype")
        static SpeechSynthesisErrorEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechSynthesisErrorEvent()")
        static SpeechSynthesisErrorEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
