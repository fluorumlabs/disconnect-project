package js.web.webrtc;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session.
 */
public interface RTCSessionDescription extends Any {
    @JSBody(script = "return RTCSessionDescription.prototype")
    static RTCSessionDescription prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "descriptionInitDict", script = "return new RTCSessionDescription(descriptionInitDict)")
    static RTCSessionDescription create(RTCSessionDescriptionInit descriptionInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getSdp();

    @JSProperty
    RTCSdpType getType();

    Unknown toJSON();

}
