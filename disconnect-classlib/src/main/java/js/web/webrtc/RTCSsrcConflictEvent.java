package js.web.webrtc;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface RTCSsrcConflictEvent extends Event {
    @JSBody(script = "return RTCSsrcConflictEvent.prototype")
    static RTCSsrcConflictEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCSsrcConflictEvent()")
    static RTCSsrcConflictEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getSsrc();

}
