package js.web.webrtc;

import js.lang.Promise;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;


public interface RTCStatsProvider extends EventTarget {
    @JSBody(script = "return RTCStatsProvider.prototype")
    static RTCStatsProvider prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCStatsProvider()")
    static RTCStatsProvider create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    Promise<RTCStatsReport> getStats();

    Promise<RTCStatsReport> msGetStats();

}
