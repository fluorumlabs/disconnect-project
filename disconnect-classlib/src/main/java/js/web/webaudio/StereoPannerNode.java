package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** The pan property takes a unitless value between -1 (full left pan) and 1 (full right pan). This interface was introduced as a much simpler way to apply a simple panning effect than having to use a full PannerNode. */
        public interface StereoPannerNode extends AudioNode {
        @JSProperty
        AudioParam getPan();

        @JSBody(script = "return StereoPannerNode.prototype")
        static StereoPannerNode prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"context","options"}, script = "return new StereoPannerNode(context, options)")
        static StereoPannerNode create(BaseAudioContext context, StereoPannerOptions options) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="context", script = "return new StereoPannerNode(context)")
        static StereoPannerNode create(BaseAudioContext context) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
