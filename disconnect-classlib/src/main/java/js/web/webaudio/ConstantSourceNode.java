package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;


public interface ConstantSourceNode extends AudioScheduledSourceNode {
    @JSProperty
    AudioParam getOffset();

    default void addEndedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("ended", listener, options);
    }
    default void addEndedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("ended", listener, options);
    }
    default void addEndedEventListener(EventListener<Event> listener) {
        addEventListener("ended", listener);
    }

    default void removeEndedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("ended", listener, options);
    }
    default void removeEndedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("ended", listener, options);
    }
    default void removeEndedEventListener(EventListener<Event> listener) {
        removeEventListener("ended", listener);
    }

    @JSBody(script = "return ConstantSourceNode.prototype")
    static ConstantSourceNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context","options"}, script = "return new ConstantSourceNode(context, options)")
    static ConstantSourceNode create(BaseAudioContext context, ConstantSourceOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="context", script = "return new ConstantSourceNode(context)")
    static ConstantSourceNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
