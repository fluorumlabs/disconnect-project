package js.web.webaudio;

import js.web.dom.HTMLMediaElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** A MediaElementSourceNode has no inputs and exactly one output, and is created using the AudioContext.createMediaElementSource method. The amount of channels in the output equals the number of channels of the audio referenced by the HTMLMediaElement used in the creation of the node, or is 1 if the HTMLMediaElement has no audio. */
        public interface MediaElementAudioSourceNode extends AudioNode {
        @JSProperty
        HTMLMediaElement getMediaElement();

        @JSBody(script = "return MediaElementAudioSourceNode.prototype")
        static MediaElementAudioSourceNode prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"context","options"}, script = "return new MediaElementAudioSourceNode(context, options)")
        static MediaElementAudioSourceNode create(BaseAudioContext context, MediaElementAudioSourceOptions options) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="context", script = "return new MediaElementAudioSourceNode(context)")
        static MediaElementAudioSourceNode create(BaseAudioContext context) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
