package js.web.mediastreams;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.Event;

/** Events which indicate that a MediaStream has had tracks added to or removed from the stream through calls to Media Stream API methods. These events are sent to the stream when these changes occur. */
        public interface MediaStreamTrackEvent extends Event {
        @JSProperty
        MediaStreamTrack getTrack();

        @JSBody(script = "return MediaStreamTrackEvent.prototype")
        static MediaStreamTrackEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new MediaStreamTrackEvent(type, eventInitDict)")
        static MediaStreamTrackEvent create(String type, MediaStreamTrackEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new MediaStreamTrackEvent(type)")
        static MediaStreamTrackEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        interface MediaStreamTrackEventInit extends EventInit {
            @JSProperty
            MediaStreamTrack getTrack();

            @JSProperty
            void setTrack(MediaStreamTrack track);

        }
}
