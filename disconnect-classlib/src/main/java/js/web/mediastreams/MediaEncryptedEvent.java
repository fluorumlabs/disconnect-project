package js.web.mediastreams;


import js.util.buffers.ArrayBuffer;
import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaEncryptedEvent extends Event {
    @JSBody(script = "return MediaEncryptedEvent.prototype")
    static MediaEncryptedEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new MediaEncryptedEvent(type, eventInitDict)")
    static MediaEncryptedEvent create(String type, MediaEncryptedEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new MediaEncryptedEvent(type)")
    static MediaEncryptedEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    ArrayBuffer getInitData();

    @JSProperty
    String getInitDataType();


    interface MediaEncryptedEventInit extends EventInit {
        @JSProperty
        @Nullable
        ArrayBuffer getInitData();

        @JSProperty
        void setInitData(ArrayBuffer initData);

        @JSProperty
        @Nullable
        String getInitDataType();

        @JSProperty
        void setInitDataType(String initDataType);

    }
}
