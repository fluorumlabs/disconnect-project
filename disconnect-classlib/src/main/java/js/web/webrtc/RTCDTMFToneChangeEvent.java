package js.web.webrtc;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Events sent to indicate that DTMF tones have started or finished playing. This interface is used by the tonechange event.
 */
public interface RTCDTMFToneChangeEvent extends Event {
    @JSBody(script = "return RTCDTMFToneChangeEvent.prototype")
    static RTCDTMFToneChangeEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new RTCDTMFToneChangeEvent(type, eventInitDict)")
    static RTCDTMFToneChangeEvent create(String type, RTCDTMFToneChangeEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new RTCDTMFToneChangeEvent(type)")
    static RTCDTMFToneChangeEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getTone();


    interface RTCDTMFToneChangeEventInit extends EventInit {
        @JSProperty
        String getTone();

        @JSProperty
        void setTone(String tone);

    }
}
