package js.web.webaudio;

import js.web.mediastreams.MediaStream;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface MediaStreamAudioDestinationNode extends AudioNode {
    @JSBody(script = "return MediaStreamAudioDestinationNode.prototype")
    static MediaStreamAudioDestinationNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"context", "options"}, script = "return new MediaStreamAudioDestinationNode(context, options)")
    static MediaStreamAudioDestinationNode create(AudioContext context, AudioNodeOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "context", script = "return new MediaStreamAudioDestinationNode(context)")
    static MediaStreamAudioDestinationNode create(AudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    MediaStream getStream();

}
