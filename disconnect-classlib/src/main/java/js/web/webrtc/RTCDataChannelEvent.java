package js.web.webrtc;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.Event;


public interface RTCDataChannelEvent extends Event {
        @JSProperty
        RTCDataChannel getChannel();

        @JSBody(script = "return RTCDataChannelEvent.prototype")
        static RTCDataChannelEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new RTCDataChannelEvent(type, eventInitDict)")
        static RTCDataChannelEvent create(String type, RTCDataChannelEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new RTCDataChannelEvent(type)")
        static RTCDataChannelEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


    interface RTCDataChannelEventInit extends EventInit {
        @JSProperty
        RTCDataChannel getChannel();

        @JSProperty
        void setChannel(RTCDataChannel channel);

    }
}
