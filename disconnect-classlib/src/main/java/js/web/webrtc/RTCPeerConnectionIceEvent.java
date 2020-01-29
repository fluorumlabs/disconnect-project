package js.web.webrtc;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Events that occurs in relation to ICE candidates with the target, usually an RTCPeerConnection. Only one event is of this icecandidate type. */
        public interface RTCPeerConnectionIceEvent extends Event {
        @JSProperty
        @Nullable
        RTCIceCandidate  getCandidate();

        @JSProperty
        @Nullable
        String  getUrl();

        @JSBody(script = "return RTCPeerConnectionIceEvent.prototype")
        static RTCPeerConnectionIceEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new RTCPeerConnectionIceEvent(type, eventInitDict)")
        static RTCPeerConnectionIceEvent create(String type, RTCPeerConnectionIceEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new RTCPeerConnectionIceEvent(type)")
        static RTCPeerConnectionIceEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        interface RTCPeerConnectionIceEventInit extends EventInit {
            @JSProperty
            @Nullable
            RTCIceCandidate  getCandidate();

            @JSProperty
            void setCandidate(RTCIceCandidate candidate);

            @JSProperty
            @Nullable
            String  getUrl();

            @JSProperty
            void setUrl(String url);

        }
}
