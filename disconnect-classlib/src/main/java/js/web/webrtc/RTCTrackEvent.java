package js.web.webrtc;

import js.util.collections.Array;
import js.util.collections.ReadonlyArray;
import js.web.dom.Event;
import js.web.mediastreams.MediaStream;
import js.web.mediastreams.MediaStreamTrack;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCTrackEvent extends Event {
    @JSBody(script = "return RTCTrackEvent.prototype")
    static RTCTrackEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new RTCTrackEvent(type, eventInitDict)")
    static RTCTrackEvent create(String type, RTCTrackEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new RTCTrackEvent(type)")
    static RTCTrackEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    RTCRtpReceiver getReceiver();

    @JSProperty
    ReadonlyArray<MediaStream> getStreams();

    @JSProperty
    MediaStreamTrack getTrack();

    @JSProperty
    RTCRtpTransceiver getTransceiver();


    interface RTCTrackEventInit extends EventInit {
        @JSProperty
        RTCRtpReceiver getReceiver();

        @JSProperty
        void setReceiver(RTCRtpReceiver receiver);

        @JSProperty
        @Nullable
        Array<MediaStream> getStreams();

        @JSProperty
        void setStreams(@JSByRef MediaStream... streams);

        @JSProperty
        void setStreams(Array<MediaStream> streams);

        @JSProperty
        MediaStreamTrack getTrack();

        @JSProperty
        void setTrack(MediaStreamTrack track);

        @JSProperty
        RTCRtpTransceiver getTransceiver();

        @JSProperty
        void setTransceiver(RTCRtpTransceiver transceiver);

    }
}
