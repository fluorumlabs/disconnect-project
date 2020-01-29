package js.web.dom;

import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The TrackEvent interface, part of the HTML DOM specification, is used for events which represent changes to the set of available tracks on an HTML media element; these events are addtrack and removetrack.
 */
public interface TrackEvent extends Event {
    @JSBody(script = "return TrackEvent.prototype")
    static TrackEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new TrackEvent(type, eventInitDict)")
    static TrackEvent create(String type, TrackEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new TrackEvent(type)")
    static TrackEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    Unknown getTrack();


    interface TrackEventInit extends EventInit {
        @JSProperty
        @Nullable
        Unknown getTrack();

        @JSProperty
        void setTrack(VideoTrack track);

        @JSProperty
        void setTrack(AudioTrack track);

        @JSProperty
        void setTrack(TextTrack track);

    }
}
