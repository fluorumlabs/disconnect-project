package js.web.webrtc;

import js.lang.Unknown;
import js.util.collections.ReadonlyStringMap;
import org.teavm.jso.JSBody;


public interface RTCStatsReport extends ReadonlyStringMap<Unknown> {
    @JSBody(script = "return RTCStatsReport.prototype")
    static RTCStatsReport prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCStatsReport()")
    static RTCStatsReport create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
