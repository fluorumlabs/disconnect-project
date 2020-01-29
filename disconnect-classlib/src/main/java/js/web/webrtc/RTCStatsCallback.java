package js.web.webrtc;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
        public interface RTCStatsCallback extends JSObject {
        void accept(RTCStatsReport report);
        }
