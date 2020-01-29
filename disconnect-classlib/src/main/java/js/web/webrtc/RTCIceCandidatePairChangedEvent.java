package js.web.webrtc;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface RTCIceCandidatePairChangedEvent extends Event {
    @JSBody(script = "return RTCIceCandidatePairChangedEvent.prototype")
    static RTCIceCandidatePairChangedEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCIceCandidatePairChangedEvent()")
    static RTCIceCandidatePairChangedEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    RTCIceCandidatePair getPair();

}
