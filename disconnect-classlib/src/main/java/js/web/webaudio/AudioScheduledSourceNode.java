package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;


public interface AudioScheduledSourceNode extends AudioNode {
    @JSProperty
    @Nullable
    EventListener<Event> getOnended();

    @JSProperty
    void setOnended(EventListener<Event> onended);

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

    void start(double when);
    void start();
    void stop(double when);
    void stop();

    @JSBody(script = "return AudioScheduledSourceNode.prototype")
    static AudioScheduledSourceNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioScheduledSourceNode()")
    static AudioScheduledSourceNode create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
