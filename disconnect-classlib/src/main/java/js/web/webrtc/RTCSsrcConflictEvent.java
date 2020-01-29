package js.web.webrtc;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.Event;


public interface RTCSsrcConflictEvent extends Event {
        @JSProperty
        double getSsrc();

        @JSBody(script = "return RTCSsrcConflictEvent.prototype")
        static RTCSsrcConflictEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new RTCSsrcConflictEvent()")
        static RTCSsrcConflictEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
