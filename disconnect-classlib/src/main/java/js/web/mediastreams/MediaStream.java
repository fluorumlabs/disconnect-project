package js.web.mediastreams;

import js.util.collections.Array;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A stream of media content. A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of MediaStreamTrack.
 */
public interface MediaStream extends EventTarget {
    @JSBody(script = "return MediaStream.prototype")
    static MediaStream prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaStream()")
    static MediaStream create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "stream", script = "return new MediaStream(stream)")
    static MediaStream create(MediaStream stream) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "tracks", script = "return new MediaStream(tracks)")
    static MediaStream create(MediaStreamTrack... tracks) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "tracks", script = "return new MediaStream(tracks)")
    static MediaStream create(Array<MediaStreamTrack> tracks) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isActive();

    @JSProperty
    String getId();

    @JSProperty
    @Nullable
    EventListener<MediaStreamTrackEvent> getOnaddtrack();

    @JSProperty
    void setOnaddtrack(EventListener<MediaStreamTrackEvent> onaddtrack);

    default void addAddTrackEventListener(EventListener<MediaStreamTrackEvent> listener, AddEventListenerOptions options) {
        addEventListener("addtrack", listener, options);
    }

    default void addAddTrackEventListener(EventListener<MediaStreamTrackEvent> listener, boolean options) {
        addEventListener("addtrack", listener, options);
    }

    default void addAddTrackEventListener(EventListener<MediaStreamTrackEvent> listener) {
        addEventListener("addtrack", listener);
    }

    default void removeAddTrackEventListener(EventListener<MediaStreamTrackEvent> listener, EventListenerOptions options) {
        removeEventListener("addtrack", listener, options);
    }

    default void removeAddTrackEventListener(EventListener<MediaStreamTrackEvent> listener, boolean options) {
        removeEventListener("addtrack", listener, options);
    }

    default void removeAddTrackEventListener(EventListener<MediaStreamTrackEvent> listener) {
        removeEventListener("addtrack", listener);
    }

    @JSProperty
    @Nullable
    EventListener<MediaStreamTrackEvent> getOnremovetrack();

    @JSProperty
    void setOnremovetrack(EventListener<MediaStreamTrackEvent> onremovetrack);

    default void addRemoveTrackEventListener(EventListener<MediaStreamTrackEvent> listener, AddEventListenerOptions options) {
        addEventListener("removetrack", listener, options);
    }

    default void addRemoveTrackEventListener(EventListener<MediaStreamTrackEvent> listener, boolean options) {
        addEventListener("removetrack", listener, options);
    }

    default void addRemoveTrackEventListener(EventListener<MediaStreamTrackEvent> listener) {
        addEventListener("removetrack", listener);
    }

    default void removeRemoveTrackEventListener(EventListener<MediaStreamTrackEvent> listener, EventListenerOptions options) {
        removeEventListener("removetrack", listener, options);
    }

    default void removeRemoveTrackEventListener(EventListener<MediaStreamTrackEvent> listener, boolean options) {
        removeEventListener("removetrack", listener, options);
    }

    default void removeRemoveTrackEventListener(EventListener<MediaStreamTrackEvent> listener) {
        removeEventListener("removetrack", listener);
    }

    void addTrack(MediaStreamTrack track);

    MediaStream clone();

    Array<MediaStreamTrack> getAudioTracks();

    @Nullable
    MediaStreamTrack getTrackById(String trackId);

    Array<MediaStreamTrack> getTracks();

    Array<MediaStreamTrack> getVideoTracks();

    void removeTrack(MediaStreamTrack track);

}
