package js.web.dom;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/23/2020.
 */
public interface TextTrackList extends ArrayLike<TextTrack>, EventTarget {

    @JSBody(script = "return TextTrackList.prototype")
    static TextTrackList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new TextTrackList()")
    static TextTrackList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    EventListener<TrackEvent> getOnaddtrack();

    @JSProperty
    void setOnaddtrack(EventListener<TrackEvent> onaddtrack);

    default void addAddTrackEventListener(EventListener<TrackEvent> listener, AddEventListenerOptions options) {
        addEventListener("addtrack", listener, options);
    }

    default void addAddTrackEventListener(EventListener<TrackEvent> listener, boolean options) {
        addEventListener("addtrack", listener, options);
    }

    default void addAddTrackEventListener(EventListener<TrackEvent> listener) {
        addEventListener("addtrack", listener);
    }

    default void removeAddTrackEventListener(EventListener<TrackEvent> listener, EventListenerOptions options) {
        removeEventListener("addtrack", listener, options);
    }

    default void removeAddTrackEventListener(EventListener<TrackEvent> listener, boolean options) {
        removeEventListener("addtrack", listener, options);
    }

    default void removeAddTrackEventListener(EventListener<TrackEvent> listener) {
        removeEventListener("addtrack", listener);
    }

    TextTrack item(int index);

}
