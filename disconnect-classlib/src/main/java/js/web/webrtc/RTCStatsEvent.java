package js.web.webrtc;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.Event;


public interface RTCStatsEvent extends Event {
        @JSProperty
        RTCStatsReport getReport();

        @JSBody(script = "return RTCStatsEvent.prototype")
        static RTCStatsEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new RTCStatsEvent(type, eventInitDict)")
        static RTCStatsEvent create(String type, RTCStatsEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new RTCStatsEvent(type)")
        static RTCStatsEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


    interface RTCStatsEventInit extends EventInit {
        @JSProperty
        RTCStatsReport getReport();

        @JSProperty
        void setReport(RTCStatsReport report);

    }
}
