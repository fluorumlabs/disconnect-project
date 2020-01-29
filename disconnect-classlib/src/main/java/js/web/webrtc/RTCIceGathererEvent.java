package js.web.webrtc;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Unknown;
import js.web.dom.Event;


public interface RTCIceGathererEvent extends Event {
        @JSProperty
        Unknown getCandidate();

        @JSBody(script = "return RTCIceGathererEvent.prototype")
        static RTCIceGathererEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new RTCIceGathererEvent()")
        static RTCIceGathererEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
