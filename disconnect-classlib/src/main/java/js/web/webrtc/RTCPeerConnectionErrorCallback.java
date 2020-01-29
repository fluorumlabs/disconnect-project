package js.web.webrtc;

import js.web.dom.DOMException;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
        public interface RTCPeerConnectionErrorCallback extends JSObject {
        void accept(DOMException error);
        }
