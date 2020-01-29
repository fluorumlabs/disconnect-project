package js.web.webrtc;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.Event;


public interface RTCIceCandidatePairChangedEvent extends Event {
        @JSProperty
        RTCIceCandidatePair getPair();

        @JSBody(script = "return RTCIceCandidatePairChangedEvent.prototype")
        static RTCIceCandidatePairChangedEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new RTCIceCandidatePairChangedEvent()")
        static RTCIceCandidatePairChangedEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
