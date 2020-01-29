package js.web.mse;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video. */
        public interface VideoPlaybackQuality extends Any {
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

        @JSBody(script = "return VideoPlaybackQuality.prototype")
        static VideoPlaybackQuality prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new VideoPlaybackQuality()")
        static VideoPlaybackQuality create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
