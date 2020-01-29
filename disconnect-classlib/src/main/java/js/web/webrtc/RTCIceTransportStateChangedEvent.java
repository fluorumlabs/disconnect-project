package js.web.webrtc;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface RTCIceTransportStateChangedEvent extends Event {
    @JSBody(script = "return RTCIceTransportStateChangedEvent.prototype")
    static RTCIceTransportStateChangedEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCIceTransportStateChangedEvent()")
    static RTCIceTransportStateChangedEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    RTCIceTransportState getState();

}
