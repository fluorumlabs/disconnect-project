package js.web.dom;

import js.web.mse.VideoPlaybackQuality;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Unknown;
import js.web.canvas.CanvasImageSource;
import js.web.webgl.TexImageSource;

/** Provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement. */
public interface HTMLVideoElement extends HTMLMediaElement, CanvasImageSource, TexImageSource {
    /**
     * Gets or sets the height of the video element.
     */
    @JSProperty
    double getHeight();

    @JSProperty
    void setHeight(double height);

    @JSProperty
    boolean isMsHorizontalMirror();

    @JSProperty
    void setMsHorizontalMirror(boolean msHorizontalMirror);

    @JSProperty
    boolean isMsIsLayoutOptimalForPlayback();

    @JSProperty
    boolean isMsIsStereo3D();

    @JSProperty
    String getMsStereo3DPackingMode();

    @JSProperty
    void setMsStereo3DPackingMode(String msStereo3DPackingMode);

    @JSProperty
    String getMsStereo3DRenderMode();

    @JSProperty
    void setMsStereo3DRenderMode(String msStereo3DRenderMode);

    @JSProperty
    boolean isMsZoom();

    @JSProperty
    void setMsZoom(boolean msZoom);

    @JSProperty
    @Nullable
    EventListener<Event> getOnMSVideoFormatChanged();

    @JSProperty
    void setOnMSVideoFormatChanged(EventListener<Event> onMSVideoFormatChanged);

    default void addMSVideoFormatChangedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("MSVideoFormatChanged", listener, options);
    }
    default void addMSVideoFormatChangedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("MSVideoFormatChanged", listener, options);
    }
    default void addMSVideoFormatChangedEventListener(EventListener<Event> listener) {
        addEventListener("MSVideoFormatChanged", listener);
    }

    default void removeMSVideoFormatChangedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("MSVideoFormatChanged", listener, options);
    }
    default void removeMSVideoFormatChangedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("MSVideoFormatChanged", listener, options);
    }
    default void removeMSVideoFormatChangedEventListener(EventListener<Event> listener) {
        removeEventListener("MSVideoFormatChanged", listener);
    }
    @JSProperty
    @Nullable
    EventListener<Event> getOnMSVideoFrameStepCompleted();

    @JSProperty
    void setOnMSVideoFrameStepCompleted(EventListener<Event> onMSVideoFrameStepCompleted);

    default void addMSVideoFrameStepCompletedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("MSVideoFrameStepCompleted", listener, options);
    }
    default void addMSVideoFrameStepCompletedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("MSVideoFrameStepCompleted", listener, options);
    }
    default void addMSVideoFrameStepCompletedEventListener(EventListener<Event> listener) {
        addEventListener("MSVideoFrameStepCompleted", listener);
    }

    default void removeMSVideoFrameStepCompletedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("MSVideoFrameStepCompleted", listener, options);
    }
    default void removeMSVideoFrameStepCompletedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("MSVideoFrameStepCompleted", listener, options);
    }
    default void removeMSVideoFrameStepCompletedEventListener(EventListener<Event> listener) {
        removeEventListener("MSVideoFrameStepCompleted", listener);
    }
    @JSProperty
    @Nullable
    EventListener<Event> getOnMSVideoOptimalLayoutChanged();

    @JSProperty
    void setOnMSVideoOptimalLayoutChanged(EventListener<Event> onMSVideoOptimalLayoutChanged);

    default void addMSVideoOptimalLayoutChangedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("MSVideoOptimalLayoutChanged", listener, options);
    }
    default void addMSVideoOptimalLayoutChangedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("MSVideoOptimalLayoutChanged", listener, options);
    }
    default void addMSVideoOptimalLayoutChangedEventListener(EventListener<Event> listener) {
        addEventListener("MSVideoOptimalLayoutChanged", listener);
    }

    default void removeMSVideoOptimalLayoutChangedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("MSVideoOptimalLayoutChanged", listener, options);
    }
    default void removeMSVideoOptimalLayoutChangedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("MSVideoOptimalLayoutChanged", listener, options);
    }
    default void removeMSVideoOptimalLayoutChangedEventListener(EventListener<Event> listener) {
        removeEventListener("MSVideoOptimalLayoutChanged", listener);
    }
    /**
     * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
     */
    @JSProperty
    String getPoster();

    @JSProperty
    void setPoster(String poster);

    /**
     * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
     */
    @JSProperty
    double getVideoHeight();

    /**
     * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
     */
    @JSProperty
    double getVideoWidth();

    @JSProperty
    boolean isWebkitDisplayingFullscreen();

    @JSProperty
    boolean isWebkitSupportsFullscreen();

    /**
     * Gets or sets the width of the video element.
     */
    @JSProperty
    double getWidth();

    @JSProperty
    void setWidth(double width);

    VideoPlaybackQuality getVideoPlaybackQuality();
    void msFrameStep(boolean forward);
    void msInsertVideoEffect(String activatableClassId, boolean effectRequired, Unknown config);
    void msInsertVideoEffect(String activatableClassId, boolean effectRequired);
    void msSetVideoRectangle(double left, double top, double right, double bottom);
    void webkitEnterFullScreen();
    void webkitEnterFullscreen();
    void webkitExitFullScreen();
    void webkitExitFullscreen();

    @JSBody(script = "return HTMLVideoElement.prototype")
    static HTMLVideoElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLVideoElement()")
    static HTMLVideoElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
