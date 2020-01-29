package js.web.mediastreams;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Events that occurs in relation to a MediaStream. Two events of this type can be addstream and removestream thrown.
 */
public interface MediaStreamEvent extends Event {
    @JSBody(script = "return MediaStreamEvent.prototype")
    static MediaStreamEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new MediaStreamEvent(type, eventInitDict)")
    static MediaStreamEvent create(String type, MediaStreamEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new MediaStreamEvent(type)")
    static MediaStreamEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    MediaStream getStream();


    interface MediaStreamEventInit extends EventInit {
        @JSProperty
        @Nullable
        MediaStream getStream();

        @JSProperty
        void setStream(MediaStream stream);

    }
}
