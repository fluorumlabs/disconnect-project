package js.web.webaudio;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The Web Audio API events that occur when a ScriptProcessorNode input buffer is ready to be processed.
 */
public interface AudioProcessingEvent extends Event {
    @JSBody(script = "return AudioProcessingEvent.prototype")
    static AudioProcessingEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new AudioProcessingEvent(type, eventInitDict)")
    static AudioProcessingEvent create(String type, AudioProcessingEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    AudioBuffer getInputBuffer();

    @JSProperty
    AudioBuffer getOutputBuffer();

    @JSProperty
    double getPlaybackTime();


    interface AudioProcessingEventInit extends EventInit {
        @JSProperty
        AudioBuffer getInputBuffer();

        @JSProperty
        void setInputBuffer(AudioBuffer inputBuffer);

        @JSProperty
        AudioBuffer getOutputBuffer();

        @JSProperty
        void setOutputBuffer(AudioBuffer outputBuffer);

        @JSProperty
        double getPlaybackTime();

        @JSProperty
        void setPlaybackTime(double playbackTime);

    }
}
