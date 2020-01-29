package js.web.webrtc;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCErrorEvent extends Event {
    @JSBody(script = "return RTCErrorEvent.prototype")
    static RTCErrorEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new RTCErrorEvent(type, eventInitDict)")
    static RTCErrorEvent create(String type, RTCErrorEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new RTCErrorEvent(type)")
    static RTCErrorEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    RTCError getError();


    interface RTCErrorEventInit extends EventInit {
        @JSProperty
        @Nullable
        RTCError getError();

        @JSProperty
        void setError(RTCError error);

    }
}
