package js.web.webaudio;

import js.web.dom.EventListener;
import js.web.channelmessaging.MessagePort;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListenerOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface AudioWorkletNode extends AudioNode {

    @JSProperty
    @Nullable
    EventListener<Event> getOnprocessorerror();

    @JSProperty
    void setOnprocessorerror(EventListener<Event> onprocessorerror);

    default void addProcessorErrorEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("processorerror", listener, options);
    }
    default void addProcessorErrorEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("processorerror", listener, options);
    }
    default void addProcessorErrorEventListener(EventListener<Event> listener) {
        addEventListener("processorerror", listener);
    }

    default void removeProcessorErrorEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("processorerror", listener, options);
    }
    default void removeProcessorErrorEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("processorerror", listener, options);
    }
    default void removeProcessorErrorEventListener(EventListener<Event> listener) {
        removeEventListener("processorerror", listener);
    }
    @JSProperty
    AudioParamMap getParameters();

    @JSProperty
    MessagePort getPort();

    @JSBody(script = "return AudioWorkletNode.prototype")
    static AudioWorkletNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context","name","options"}, script = "return new AudioWorkletNode(context, name, options)")
    static AudioWorkletNode create(BaseAudioContext context, String name, AudioWorkletNodeOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context","name"}, script = "return new AudioWorkletNode(context, name)")
    static AudioWorkletNode create(BaseAudioContext context, String name) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
