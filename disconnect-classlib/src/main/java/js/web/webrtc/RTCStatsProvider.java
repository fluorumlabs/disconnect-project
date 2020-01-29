package js.web.webrtc;

import org.teavm.jso.JSBody;

import js.lang.Promise;
import js.web.dom.EventTarget;


public interface RTCStatsProvider extends EventTarget {
        Promise<RTCStatsReport> getStats();
        Promise<RTCStatsReport> msGetStats();

        @JSBody(script = "return RTCStatsProvider.prototype")
        static RTCStatsProvider prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new RTCStatsProvider()")
        static RTCStatsProvider create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
