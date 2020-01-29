package js.web.webaudio;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an OfflineAudioContext is terminated. The complete event implements this interface.
 */
public interface OfflineAudioCompletionEvent extends Event {
    @JSBody(script = "return OfflineAudioCompletionEvent.prototype")
    static OfflineAudioCompletionEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new OfflineAudioCompletionEvent(type, eventInitDict)")
    static OfflineAudioCompletionEvent create(String type, OfflineAudioCompletionEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new OfflineAudioCompletionEvent(type)")
    static OfflineAudioCompletionEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    AudioBuffer getRenderedBuffer();


    interface OfflineAudioCompletionEventInit extends EventInit {
        @JSProperty
        AudioBuffer getRenderedBuffer();

        @JSProperty
        void setRenderedBuffer(AudioBuffer renderedBuffer);

    }
}
