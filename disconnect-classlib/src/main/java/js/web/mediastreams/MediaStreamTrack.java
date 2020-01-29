package js.web.mediastreams;

import js.lang.VoidPromise;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A single media track within a stream; typically, these are audio or video tracks, but other track types may exist as well.
 */
public interface MediaStreamTrack extends EventTarget {
    @JSBody(script = "return MediaStreamTrack.prototype")
    static MediaStreamTrack prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaStreamTrack()")
    static MediaStreamTrack create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isEnabled();

    @JSProperty
    void setEnabled(boolean enabled);

    @JSProperty
    String getId();

    @JSProperty
    boolean isIsolated();

    @JSProperty
    String getKind();

    @JSProperty
    String getLabel();

    @JSProperty
    boolean isMuted();

    @JSProperty
    @Nullable
    EventListener<Event> getOnended();

    @JSProperty
    void setOnended(EventListener<Event> onended);

    default void addEndedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("ended", listener, options);
    }

    default void addEndedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("ended", listener, options);
    }

    default void addEndedEventListener(EventListener<Event> listener) {
        addEventListener("ended", listener);
    }

    default void removeEndedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("ended", listener, options);
    }

    default void removeEndedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("ended", listener, options);
    }

    default void removeEndedEventListener(EventListener<Event> listener) {
        removeEventListener("ended", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnisolationchange();

    @JSProperty
    void setOnisolationchange(EventListener<Event> onisolationchange);

    default void addIsolationChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("isolationchange", listener, options);
    }

    default void addIsolationChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("isolationchange", listener, options);
    }

    default void addIsolationChangeEventListener(EventListener<Event> listener) {
        addEventListener("isolationchange", listener);
    }

    default void removeIsolationChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("isolationchange", listener, options);
    }

    default void removeIsolationChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("isolationchange", listener, options);
    }

    default void removeIsolationChangeEventListener(EventListener<Event> listener) {
        removeEventListener("isolationchange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmute();

    @JSProperty
    void setOnmute(EventListener<Event> onmute);

    default void addMuteEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mute", listener, options);
    }

    default void addMuteEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mute", listener, options);
    }

    default void addMuteEventListener(EventListener<Event> listener) {
        addEventListener("mute", listener);
    }

    default void removeMuteEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mute", listener, options);
    }

    default void removeMuteEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mute", listener, options);
    }

    default void removeMuteEventListener(EventListener<Event> listener) {
        removeEventListener("mute", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnunmute();

    @JSProperty
    void setOnunmute(EventListener<Event> onunmute);

    default void addUnmuteEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("unmute", listener, options);
    }

    default void addUnmuteEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("unmute", listener, options);
    }

    default void addUnmuteEventListener(EventListener<Event> listener) {
        addEventListener("unmute", listener);
    }

    default void removeUnmuteEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("unmute", listener, options);
    }

    default void removeUnmuteEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("unmute", listener, options);
    }

    default void removeUnmuteEventListener(EventListener<Event> listener) {
        removeEventListener("unmute", listener);
    }

    @JSProperty
    MediaStreamTrackState getReadyState();

    VoidPromise applyConstraints(MediaTrackConstraints constraints);

    VoidPromise applyConstraints();

    MediaStreamTrack clone();

    MediaTrackCapabilities getCapabilities();

    MediaTrackConstraints getConstraints();

    MediaTrackSettings getSettings();

    void stop();

}
