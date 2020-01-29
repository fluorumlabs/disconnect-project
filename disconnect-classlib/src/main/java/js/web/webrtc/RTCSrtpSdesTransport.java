package js.web.webrtc;

import js.util.collections.Array;
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
public interface RTCSrtpSdesTransport extends EventTarget, RTCTransport {
@JSProperty
@Nullable
EventListener<Event> getOnerror();

@JSProperty
void setOnerror(EventListener<Event> onerror);

default void addErrorEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
    addEventListener("error", listener, options);
}
default void addErrorEventListener(EventListener<Event> listener, boolean options) {
    addEventListener("error", listener, options);
}
default void addErrorEventListener(EventListener<Event> listener) {
    addEventListener("error", listener);
}

default void removeErrorEventListener(EventListener<Event> listener, EventListenerOptions options) {
    removeEventListener("error", listener, options);
}
default void removeErrorEventListener(EventListener<Event> listener, boolean options) {
    removeEventListener("error", listener, options);
}
default void removeErrorEventListener(EventListener<Event> listener) {
    removeEventListener("error", listener);
}
@JSProperty
RTCIceTransport getTransport();

@JSBody(script = "return RTCSrtpSdesTransport.prototype")
static RTCSrtpSdesTransport prototype() {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

@JSBody(params={"transport","encryptParameters","decryptParameters"}, script = "return new RTCSrtpSdesTransport(transport, encryptParameters, decryptParameters)")
static RTCSrtpSdesTransport create(RTCIceTransport transport, RTCSrtpSdesParameters encryptParameters, RTCSrtpSdesParameters decryptParameters) {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

        @JSBody(script = "return RTCSrtpSdesTransport.getLocalParameters()")
        static Array<RTCSrtpSdesParameters> getLocalParameters() {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }

}
