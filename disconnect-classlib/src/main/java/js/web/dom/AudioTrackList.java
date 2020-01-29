package js.web.dom;


import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Used to represent a list of the audio tracks contained within a given HTML media element, with each track represented by a separate AudioTrack object in the list.
 */
public interface AudioTrackList extends ArrayLike<AudioTrack>, EventTarget {
    @JSBody(script = "return AudioTrackList.prototype")
    static AudioTrackList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioTrackList()")
    static AudioTrackList create() {
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

    @Nullable
    AudioTrack getTrackById(String id);

    AudioTrack item(int index);
}
