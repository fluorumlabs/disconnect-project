package js.web.webrtc;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCPeerConnectionIceErrorEvent extends Event {
    @JSBody(script = "return RTCPeerConnectionIceErrorEvent.prototype")
    static RTCPeerConnectionIceErrorEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new RTCPeerConnectionIceErrorEvent(type, eventInitDict)")
    static RTCPeerConnectionIceErrorEvent create(String type, RTCPeerConnectionIceErrorEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new RTCPeerConnectionIceErrorEvent(type)")
    static RTCPeerConnectionIceErrorEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getErrorCode();

    @JSProperty
    String getErrorText();

    @JSProperty
    String getHostCandidate();

    @JSProperty
    String getUrl();


    interface RTCPeerConnectionIceErrorEventInit extends EventInit {
        @JSProperty
        int getErrorCode();

        @JSProperty
        void setErrorCode(int errorCode);

        @JSProperty
        @Nullable
        String getHostCandidate();

        @JSProperty
        void setHostCandidate(String hostCandidate);

        @JSProperty
        @Nullable
        String getStatusText();

        @JSProperty
        void setStatusText(String statusText);

        @JSProperty
        @Nullable
        String getUrl();

        @JSProperty
        void setUrl(String url);

    }
}
