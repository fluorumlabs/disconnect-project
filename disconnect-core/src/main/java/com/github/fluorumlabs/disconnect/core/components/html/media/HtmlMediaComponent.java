package com.github.fluorumlabs.disconnect.core.components.html.media;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import js.lang.VoidPromise;
import js.web.dom.*;
import js.web.mediastreams.MediaEncryptedEvent;
import js.web.mediastreams.MediaKeys;

import javax.annotation.Nullable;
import java.util.Optional;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class HtmlMediaComponent<X extends HTMLMediaElement> extends HtmlComponent<X> {
    protected HtmlMediaComponent() {}

    /**
     * Returns an AudioTrackList object with the audio tracks for a given video element.
     */
    public AudioTrackList getAudioTracks() {
        return getElement().getAudioTracks();
    }

    /**
     * Gets or sets a value that indicates whether to start playing the media automatically.
     */
    public boolean isAutoplay() {
        return getElement().isAutoplay();
    }

    public void setAutoplay(boolean autoplay) {
        getElement().setAutoplay(autoplay);
    }

    /**
     * Gets a collection of buffered time ranges.
     */
    public TimeRanges getBuffered() {
        return getElement().getBuffered();
    }

    /**
     * Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player).
     */
    public boolean isControls() {
        return getElement().isControls();
    }

    public void setControls(boolean controls) {
        getElement().setControls(controls);
    }

    public Optional<String> getCrossOrigin() {
        return Optional.ofNullable(getElement().getCrossOrigin());
    }

    public void setCrossOrigin(@Nullable String crossOrigin) {
        getElement().setCrossOrigin(crossOrigin);
    }

    /**
     * Gets the address or URL of the current media resource that is selected by IHTMLMediaElement.
     */
    public String getCurrentSrc() {
        return getElement().getCurrentSrc();
    }

    /**
     * Gets or sets the current playback position, in seconds.
     */
    public double getCurrentTime() {
        return getElement().getCurrentTime();
    }

    public void setCurrentTime(double currentTime) {
        getElement().setCurrentTime(currentTime);
    }

    public boolean isDefaultMuted() {
        return getElement().isDefaultMuted();
    }

    public void setDefaultMuted(boolean defaultMuted) {
        getElement().setDefaultMuted(defaultMuted);
    }

    /**
     * Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource.
     */
    public double getDefaultPlaybackRate() {
        return getElement().getDefaultPlaybackRate();
    }

    public void setDefaultPlaybackRate(double defaultPlaybackRate) {
        getElement().setDefaultPlaybackRate(defaultPlaybackRate);
    }

    /**
     * Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming.
     */
    public double getDuration() {
        return getElement().getDuration();
    }

    /**
     * Gets information about whether the playback has ended or not.
     */
    public boolean isEnded() {
        return getElement().isEnded();
    }

    /**
     * Returns an object representing the current error state of the audio or video element.
     */
    public Optional<MediaError> getError() {
        return Optional.ofNullable(getElement().getError());
    }

    /**
     * Gets or sets a flag to specify whether playback should restart after it completes.
     */
    public boolean isLoop() {
        return getElement().isLoop();
    }

    public void setLoop(boolean loop) {
        getElement().setLoop(loop);
    }

    public Optional<MediaKeys> getMediaKeys() {
        return Optional.ofNullable(getElement().getMediaKeys());
    }

    /**
     * Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted.
     */
    public boolean isMuted() {
        return getElement().isMuted();
    }

    public void setMuted(boolean muted) {
        getElement().setMuted(muted);
    }

    /**
     * FIXME Gets the current network activity for the element.
     */
    public double getNetworkState() {
        return getElement().getNetworkState();
    }

    public ObservableEvent<MediaEncryptedEvent> encryptedEvent() {
        return createEvent(HTMLMediaElement::addEncryptedEventListener);
    }

    public ObservableEvent<Event> waitingForKeyEvent() {
        return createEvent(HTMLMediaElement::addWaitingForKeyEventListener);
    }

    /**
     * Gets a flag that specifies whether playback is paused.
     */
    public boolean isPaused() {
        return getElement().isPaused();
    }

    /**
     * Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource.
     */
    public double getPlaybackRate() {
        return getElement().getPlaybackRate();
    }

    public void setPlaybackRate(double playbackRate) {
        getElement().setPlaybackRate(playbackRate);
    }

    /**
     * Gets TimeRanges for the current media resource that has been played.
     */
    public TimeRanges getPlayed() {
        return getElement().getPlayed();
    }

    /**
     * Gets or sets the current playback position, in seconds.
     */
    public String getPreload() {
        return getElement().getPreload();
    }

    public void setPreload(String preload) {
        getElement().setPreload(preload);
    }

    public HTMLMediaElement.ReadyState getReadyState() {
        return getElement().getReadyState();
    }

    /**
     * Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked.
     */
    public TimeRanges getSeekable() {
        return getElement().getSeekable();
    }

    /**
     * Gets a flag that indicates whether the client is currently moving to a new playback position in the media resource.
     */
    public boolean isSeeking() {
        return getElement().isSeeking();
    }

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    public String getSrc() {
        return getElement().getSrc();
    }

    public void setSrc(String src) {
        getElement().setSrc(src);
    }

    public TextTrackList getTextTracks() {
        return getElement().getTextTracks();
    }

    public VideoTrackList getVideoTracks() {
        return getElement().getVideoTracks();
    }

    /**
     * Gets or sets the volume level for audio portions of the media element.
     */
    public double getVolume() {
        return getElement().getVolume();
    }

    public void setVolume(double volume) {
        getElement().setVolume(volume);
    }

    public TextTrack addTextTrack(TextTrackKind kind, String label, String language) {
        return getElement().addTextTrack(kind, label, language);
    }

    public TextTrack addTextTrack(TextTrackKind kind, String label) {
        return getElement().addTextTrack(kind, label);
    }

    public TextTrack addTextTrack(TextTrackKind kind) {
        return getElement().addTextTrack(kind);
    }

    /**
     * Returns a string that specifies whether the client can play a given media resource type.
     * @param type
     */
    public CanPlayTypeResult canPlayType(String type) {
        return getElement().canPlayType(type);
    }

    /**
     * Resets the audio or video object and loads a new media resource.
     */
    public void load() {
        getElement().load();
    }

    /**
     * Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not.
     */
    public void pause() {
        getElement().pause();
    }

    /**
     * Loads and starts playback of a media resource.
     */
    public VoidPromise play() {
        return getElement().play();
    }

    public VoidPromise setMediaKeys(@Nullable MediaKeys mediaKeys) {
        return getElement().setMediaKeys(mediaKeys);
    }
}
