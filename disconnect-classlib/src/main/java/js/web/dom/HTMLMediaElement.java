package js.web.dom;

import js.extras.JsEnum;
import js.lang.Unknown;
import js.lang.VoidPromise;
import js.web.mediastreams.MediaEncryptedEvent;
import js.web.mediastreams.MediaKeys;
import js.web.mediastreams.MediaStream;
import js.web.mse.MediaSource;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Adds to HTMLElement the properties and methods needed to support basic media-related capabilities that are common to audio and video. */
public interface HTMLMediaElement extends HTMLElement {
    /**
     * Returns an AudioTrackList object with the audio tracks for a given video element.
     */
    @JSProperty
    AudioTrackList getAudioTracks();

    /**
     * Gets or sets a value that indicates whether to start playing the media automatically.
     */
    @JSProperty
    boolean isAutoplay();

    @JSProperty
    void setAutoplay(boolean autoplay);

    /**
     * Gets a collection of buffered time ranges.
     */
    @JSProperty
    TimeRanges getBuffered();

    /**
     * Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player).
     */
    @JSProperty
    boolean isControls();

    @JSProperty
    void setControls(boolean controls);

    @JSProperty
    @Nullable
    String  getCrossOrigin();

    @JSProperty
    void setCrossOrigin(String crossOrigin);

    /**
     * Gets the address or URL of the current media resource that is selected by IHTMLMediaElement.
     */
    @JSProperty
    String getCurrentSrc();

    /**
     * Gets or sets the current playback position, in seconds.
     */
    @JSProperty
    double getCurrentTime();

    @JSProperty
    void setCurrentTime(double currentTime);

    @JSProperty
    boolean isDefaultMuted();

    @JSProperty
    void setDefaultMuted(boolean defaultMuted);

    /**
     * Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource.
     */
    @JSProperty
    double getDefaultPlaybackRate();

    @JSProperty
    void setDefaultPlaybackRate(double defaultPlaybackRate);

    /**
     * Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming.
     */
    @JSProperty
    double getDuration();

    /**
     * Gets information about whether the playback has ended or not.
     */
    @JSProperty
    boolean isEnded();

    /**
     * Returns an object representing the current error state of the audio or video element.
     */
    @JSProperty
    @Nullable
    MediaError getError();

    /**
     * Gets or sets a flag to specify whether playback should restart after it completes.
     */
    @JSProperty
    boolean isLoop();

    @JSProperty
    void setLoop(boolean loop);

    @JSProperty
    @Nullable
    MediaKeys getMediaKeys();

    /**
     * Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted.
     */
    @JSProperty
    boolean isMuted();

    @JSProperty
    void setMuted(boolean muted);

    /**
     * Gets the current network activity for the element.
     */
    @JSProperty
    double getNetworkState();

    @JSProperty
    @Nullable
    EventListener<MediaEncryptedEvent> getOnencrypted();

    @JSProperty
    void setOnencrypted(EventListener<MediaEncryptedEvent> onencrypted);

    default void addEncryptedEventListener(EventListener<MediaEncryptedEvent> listener, AddEventListenerOptions options) {
        addEventListener("encrypted", listener, options);
    }
    default void addEncryptedEventListener(EventListener<MediaEncryptedEvent> listener, boolean options) {
        addEventListener("encrypted", listener, options);
    }
    default void addEncryptedEventListener(EventListener<MediaEncryptedEvent> listener) {
        addEventListener("encrypted", listener);
    }

    default void removeEncryptedEventListener(EventListener<MediaEncryptedEvent> listener, EventListenerOptions options) {
        removeEventListener("encrypted", listener, options);
    }
    default void removeEncryptedEventListener(EventListener<MediaEncryptedEvent> listener, boolean options) {
        removeEventListener("encrypted", listener, options);
    }
    default void removeEncryptedEventListener(EventListener<MediaEncryptedEvent> listener) {
        removeEventListener("encrypted", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnmsneedkey();

    @Deprecated
    @JSProperty
    void setOnmsneedkey(EventListener<Event> onmsneedkey);

    @Deprecated
    default void addMSNeedKeyEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("msneedkey", listener, options);
    }
    @Deprecated
    default void addMSNeedKeyEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("msneedkey", listener, options);
    }
    @Deprecated
    default void addMSNeedKeyEventListener(EventListener<Event> listener) {
        addEventListener("msneedkey", listener);
    }

    @Deprecated
    default void removeMSNeedKeyEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("msneedkey", listener, options);
    }
    @Deprecated
    default void removeMSNeedKeyEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("msneedkey", listener, options);
    }
    @Deprecated
    default void removeMSNeedKeyEventListener(EventListener<Event> listener) {
        removeEventListener("msneedkey", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnwaitingforkey();

    @JSProperty
    void setOnwaitingforkey(EventListener<Event> onwaitingforkey);

    default void addWaitingForKeyEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("waitingforkey", listener, options);
    }
    default void addWaitingForKeyEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("waitingforkey", listener, options);
    }
    default void addWaitingForKeyEventListener(EventListener<Event> listener) {
        addEventListener("waitingforkey", listener);
    }

    default void removeWaitingForKeyEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("waitingforkey", listener, options);
    }
    default void removeWaitingForKeyEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("waitingforkey", listener, options);
    }
    default void removeWaitingForKeyEventListener(EventListener<Event> listener) {
        removeEventListener("waitingforkey", listener);
    }
    /**
     * Gets a flag that specifies whether playback is paused.
     */
    @JSProperty
    boolean isPaused();

    /**
     * Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource.
     */
    @JSProperty
    double getPlaybackRate();

    @JSProperty
    void setPlaybackRate(double playbackRate);

    /**
     * Gets TimeRanges for the current media resource that has been played.
     */
    @JSProperty
    TimeRanges getPlayed();

    /**
     * Gets or sets the current playback position, in seconds.
     */
    @JSProperty
    String getPreload();

    @JSProperty
    void setPreload(String preload);

    @JSProperty
    ReadyState getReadyState();

    /**
     * Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked.
     */
    @JSProperty
    TimeRanges getSeekable();

    /**
     * Gets a flag that indicates whether the client is currently moving to a new playback position in the media resource.
     */
    @JSProperty
    boolean isSeeking();

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    @JSProperty
    String getSrc();

    @JSProperty
    void setSrc(String src);

    @JSProperty
    @Nullable
    Unknown getSrcObject();

    @JSProperty
    void setSrcObject(MediaStream srcObject);
    @JSProperty
    void setSrcObject(MediaSource srcObject);
    @JSProperty
    void setSrcObject(Blob srcObject);

    @JSProperty
    TextTrackList getTextTracks();

    @JSProperty
    VideoTrackList getVideoTracks();

    /**
     * Gets or sets the volume level for audio portions of the media element.
     */
    @JSProperty
    double getVolume();

    @JSProperty
    void setVolume(double volume);

    TextTrack addTextTrack(TextTrackKind kind, String label, String language);
    TextTrack addTextTrack(TextTrackKind kind, String label);
    TextTrack addTextTrack(TextTrackKind kind);
    /**
     * Returns a string that specifies whether the client can play a given media resource type.
     */
    CanPlayTypeResult canPlayType(String type);
    /**
     * Resets the audio or video object and loads a new media resource.
     */
    void load();
    /**
     * Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not.
     */
    void pause();
    /**
     * Loads and starts playback of a media resource.
     */
    VoidPromise play();
    VoidPromise setMediaKeys(@Nullable MediaKeys mediaKeys);

    abstract class ReadyState extends JsEnum {

    public static final ReadyState HAVE_CURRENT_DATA = JsEnum.from("return HTMLMediaElement.HAVE_CURRENT_DATA");

    public static final ReadyState HAVE_ENOUGH_DATA = JsEnum.from("return HTMLMediaElement.HAVE_ENOUGH_DATA");

    public static final ReadyState HAVE_FUTURE_DATA = JsEnum.from("return HTMLMediaElement.HAVE_FUTURE_DATA");

    public static final ReadyState HAVE_METADATA = JsEnum.from("return HTMLMediaElement.HAVE_METADATA");

    public static final ReadyState HAVE_NOTHING = JsEnum.from("return HTMLMediaElement.HAVE_NOTHING");

    public static final ReadyState NETWORK_EMPTY = JsEnum.from("return HTMLMediaElement.NETWORK_EMPTY");

    public static final ReadyState NETWORK_IDLE = JsEnum.from("return HTMLMediaElement.NETWORK_IDLE");

    public static final ReadyState NETWORK_LOADING = JsEnum.from("return HTMLMediaElement.NETWORK_LOADING");

    public static final ReadyState NETWORK_NO_SOURCE = JsEnum.from("return HTMLMediaElement.NETWORK_NO_SOURCE");}

    @JSBody(script = "return HTMLMediaElement.prototype")
    static HTMLMediaElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLMediaElement()")
    static HTMLMediaElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
