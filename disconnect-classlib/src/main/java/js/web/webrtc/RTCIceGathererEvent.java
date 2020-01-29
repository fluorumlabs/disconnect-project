package js.web.webrtc;

import js.lang.Unknown;
import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface RTCIceGathererEvent extends Event {
    @JSBody(script = "return RTCIceGathererEvent.prototype")
    static RTCIceGathererEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCIceGathererEvent()")
    static RTCIceGathererEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Unknown getCandidate();

}
