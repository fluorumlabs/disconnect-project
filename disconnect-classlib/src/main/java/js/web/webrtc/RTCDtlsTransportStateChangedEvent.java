package js.web.webrtc;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.Event;


public interface RTCDtlsTransportStateChangedEvent extends Event {
        @JSProperty
        RTCDtlsTransportState getState();

        @JSBody(script = "return RTCDtlsTransportStateChangedEvent.prototype")
        static RTCDtlsTransportStateChangedEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new RTCDtlsTransportStateChangedEvent()")
        static RTCDtlsTransportStateChangedEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
