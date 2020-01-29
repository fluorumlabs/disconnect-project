package js.web.webrtc;

import js.web.dom.EventListener;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
* Created by Artem Godin on 1/22/2020.
*/
public interface RTCSctpTransport extends EventTarget {
@JSProperty
@Nullable
int  getMaxChannels();

@JSProperty
int getMaxMessageSize();

@JSProperty
@Nullable
EventListener<Event> getOnstatechange();

@JSProperty
void setOnstatechange(EventListener<Event> onstatechange);

default void addStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
    addEventListener("statechange", listener, options);
}
default void addStateChangeEventListener(EventListener<Event> listener, boolean options) {
    addEventListener("statechange", listener, options);
}
default void addStateChangeEventListener(EventListener<Event> listener) {
    addEventListener("statechange", listener);
}

default void removeStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
    removeEventListener("statechange", listener, options);
}
default void removeStateChangeEventListener(EventListener<Event> listener, boolean options) {
    removeEventListener("statechange", listener, options);
}
default void removeStateChangeEventListener(EventListener<Event> listener) {
    removeEventListener("statechange", listener);
}
@JSProperty
RTCSctpTransportState getState();

@JSProperty
RTCDtlsTransport getTransport();

@JSBody(script = "return RTCSctpTransport.prototype")
static RTCSctpTransport prototype() {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

@JSBody(script = "return new RTCSctpTransport()")
static RTCSctpTransport create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

}
