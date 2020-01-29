package js.web.mse;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video.
 */
public interface VideoPlaybackQuality extends Any {
    @JSBody(script = "return VideoPlaybackQuality.prototype")
    static VideoPlaybackQuality prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new VideoPlaybackQuality()")
    static VideoPlaybackQuality create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getCorruptedVideoFrames();

    @JSProperty
    double getCreationTime();

    @JSProperty
    int getDroppedVideoFrames();

    @JSProperty
    double getTotalFrameDelay();

    @JSProperty
    int getTotalVideoFrames();

}
