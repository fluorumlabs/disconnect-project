package js.web.webaudio;

import js.web.mediastreams.MediaStreamTrackAudioSourceOptions;
import org.teavm.jso.JSBody;


public interface MediaStreamTrackAudioSourceNode extends AudioNode {
    @JSBody(script = "return MediaStreamTrackAudioSourceNode.prototype")
    static MediaStreamTrackAudioSourceNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"context", "options"}, script = "return new MediaStreamTrackAudioSourceNode(context, options)")
    static MediaStreamTrackAudioSourceNode create(AudioContext context, MediaStreamTrackAudioSourceOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "context", script = "return new MediaStreamTrackAudioSourceNode(context)")
    static MediaStreamTrackAudioSourceNode create(AudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
