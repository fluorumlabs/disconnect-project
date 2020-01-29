package js.web.dom;


import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Used to represent a list of the video tracks contained within a <video> element, with each track represented by a separate VideoTrack object in the list.
 */
public interface VideoTrackList extends ArrayLike<VideoTrack>, EventTarget {

    @JSBody(script = "return VideoTrackList.prototype")
    static VideoTrackList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new VideoTrackList()")
    static VideoTrackList create() {
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

    @JSProperty
    @Nullable
    EventListener<Event> getOnchange();

    @JSProperty
    void setOnchange(EventListener<Event> onchange);

    default void addChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("change", listener, options);
    }

    default void addChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("change", listener, options);
    }

    default void addChangeEventListener(EventListener<Event> listener) {
        addEventListener("change", listener);
    }

    default void removeChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("change", listener, options);
    }

    default void removeChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("change", listener, options);
    }

    default void removeChangeEventListener(EventListener<Event> listener) {
        removeEventListener("change", listener);
    }

    @JSProperty
    @Nullable
    EventListener<TrackEvent> getOnremovetrack();

    @JSProperty
    void setOnremovetrack(EventListener<TrackEvent> onremovetrack);

    default void addRemoveTrackEventListener(EventListener<TrackEvent> listener, AddEventListenerOptions options) {
        addEventListener("removetrack", listener, options);
    }

    default void addRemoveTrackEventListener(EventListener<TrackEvent> listener, boolean options) {
        addEventListener("removetrack", listener, options);
    }

    default void addRemoveTrackEventListener(EventListener<TrackEvent> listener) {
        addEventListener("removetrack", listener);
    }

    default void removeRemoveTrackEventListener(EventListener<TrackEvent> listener, EventListenerOptions options) {
        removeEventListener("removetrack", listener, options);
    }

    default void removeRemoveTrackEventListener(EventListener<TrackEvent> listener, boolean options) {
        removeEventListener("removetrack", listener, options);
    }

    default void removeRemoveTrackEventListener(EventListener<TrackEvent> listener) {
        removeEventListener("removetrack", listener);
    }

    @JSProperty
    int getSelectedIndex();

    @Nullable
    VideoTrack getTrackById(String id);

    VideoTrack item(int index);

}
