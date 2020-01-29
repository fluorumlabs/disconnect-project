package js.web.mediastreams;

import js.util.buffers.ArrayBuffer;
import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** This EncryptedMediaExtensions API interface contains the content and related data when the content decryption module generates a message for the session. */
        public interface MediaKeyMessageEvent extends Event {
        @JSProperty
        ArrayBuffer getMessage();

        @JSProperty
        MediaKeyMessageType getMessageType();

        @JSBody(script = "return MediaKeyMessageEvent.prototype")
        static MediaKeyMessageEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new MediaKeyMessageEvent(type, eventInitDict)")
        static MediaKeyMessageEvent create(String type, MediaKeyMessageEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new MediaKeyMessageEvent(type)")
        static MediaKeyMessageEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


    interface MediaKeyMessageEventInit extends EventInit {
        @JSProperty
        ArrayBuffer getMessage();

        @JSProperty
        void setMessage(ArrayBuffer message);

        @JSProperty
        MediaKeyMessageType getMessageType();

        @JSProperty
        void setMessageType(MediaKeyMessageType messageType);

    }
}
