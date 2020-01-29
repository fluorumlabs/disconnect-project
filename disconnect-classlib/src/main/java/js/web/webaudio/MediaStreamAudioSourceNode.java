package js.web.webaudio;

import js.web.mediastreams.MediaStreamAudioSourceOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.mediastreams.MediaStream;

/** A type of AudioNode which operates as an audio source whose media is received from a MediaStream obtained using the WebRTC or Media Capture and Streams APIs. */
        public interface MediaStreamAudioSourceNode extends AudioNode {
        @JSProperty
        MediaStream getMediaStream();

        @JSBody(script = "return MediaStreamAudioSourceNode.prototype")
        static MediaStreamAudioSourceNode prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"context","options"}, script = "return new MediaStreamAudioSourceNode(context, options)")
        static MediaStreamAudioSourceNode create(AudioContext context, MediaStreamAudioSourceOptions options) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="context", script = "return new MediaStreamAudioSourceNode(context)")
        static MediaStreamAudioSourceNode create(AudioContext context) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
