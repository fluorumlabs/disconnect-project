package js.web.webrtc;

import org.teavm.jso.JSBody;


public interface webkitRTCPeerConnection extends RTCPeerConnection {
    @JSBody(script = "return webkitRTCPeerConnection.prototype")
    static webkitRTCPeerConnection prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "configuration", script = "return new webkitRTCPeerConnection(configuration)")
    static webkitRTCPeerConnection create(RTCConfiguration configuration) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
