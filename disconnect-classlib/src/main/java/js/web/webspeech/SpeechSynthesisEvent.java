package js.web.webspeech;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This Web Speech API interface contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service.
 */
public interface SpeechSynthesisEvent extends Event {
    @JSBody(script = "return SpeechSynthesisEvent.prototype")
    static SpeechSynthesisEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SpeechSynthesisEvent()")
    static SpeechSynthesisEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getCharIndex();

    @JSProperty
    double getElapsedTime();

    @JSProperty
    String getName();

    @JSProperty
    SpeechSynthesisUtterance getUtterance();

}
