package js.web.webrtc;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
        public interface RTCSessionDescriptionCallback extends JSObject {
        void accept(RTCSessionDescriptionInit description);
        }
