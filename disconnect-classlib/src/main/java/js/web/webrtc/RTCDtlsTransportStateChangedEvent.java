package js.web.webrtc;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface RTCDtlsTransportStateChangedEvent extends Event {
    @JSBody(script = "return RTCDtlsTransportStateChangedEvent.prototype")
    static RTCDtlsTransportStateChangedEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCDtlsTransportStateChangedEvent()")
    static RTCDtlsTransportStateChangedEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    RTCDtlsTransportState getState();

}
