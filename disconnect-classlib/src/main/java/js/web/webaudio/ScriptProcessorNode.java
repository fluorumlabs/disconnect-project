package js.web.webaudio;

import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Allows the generation, processing, or analyzing of audio using JavaScript.
 */
public interface ScriptProcessorNode extends AudioNode {
    @JSBody(script = "return ScriptProcessorNode.prototype")
    static ScriptProcessorNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ScriptProcessorNode()")
    static ScriptProcessorNode create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    int getBufferSize();

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<AudioProcessingEvent> getOnaudioprocess();

    @Deprecated
    @JSProperty
    void setOnaudioprocess(EventListener<AudioProcessingEvent> onaudioprocess);

    default void addAudioProcessEventListener(EventListener<AudioProcessingEvent> listener, AddEventListenerOptions options) {
        addEventListener("audioprocess", listener, options);
    }

    default void addAudioProcessEventListener(EventListener<AudioProcessingEvent> listener, boolean options) {
        addEventListener("audioprocess", listener, options);
    }

    default void addAudioProcessEventListener(EventListener<AudioProcessingEvent> listener) {
        addEventListener("audioprocess", listener);
    }

    default void removeAudioProcessEventListener(EventListener<AudioProcessingEvent> listener, EventListenerOptions options) {
        removeEventListener("audioprocess", listener, options);
    }

    default void removeAudioProcessEventListener(EventListener<AudioProcessingEvent> listener, boolean options) {
        removeEventListener("audioprocess", listener, options);
    }

    default void removeAudioProcessEventListener(EventListener<AudioProcessingEvent> listener) {
        removeEventListener("audioprocess", listener);
    }

}
