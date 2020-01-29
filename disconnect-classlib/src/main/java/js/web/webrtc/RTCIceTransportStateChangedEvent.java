package js.web.webrtc;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.Event;


public interface RTCIceTransportStateChangedEvent extends Event {
        @JSProperty
        RTCIceTransportState getState();

        @JSBody(script = "return RTCIceTransportStateChangedEvent.prototype")
        static RTCIceTransportStateChangedEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new RTCIceTransportStateChangedEvent()")
        static RTCIceTransportStateChangedEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
