package js.web.mediastreams;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaStreamErrorEvent extends Event {
        @JSProperty
        @Nullable
        MediaStreamError getError();

        @JSBody(script = "return MediaStreamErrorEvent.prototype")
        static MediaStreamErrorEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new MediaStreamErrorEvent(type, eventInitDict)")
        static MediaStreamErrorEvent create(String type, MediaStreamErrorEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new MediaStreamErrorEvent(type)")
        static MediaStreamErrorEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        interface MediaStreamErrorEventInit extends EventInit {
            @JSProperty
            @Nullable
            MediaStreamError getError();

            @JSProperty
            void setError(MediaStreamError error);

        }
}
