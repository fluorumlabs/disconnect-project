package js.web.webaudio;


import js.util.buffers.Float32Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** A WaveShaperNode always has exactly one input and one output. */
        public interface WaveShaperNode extends AudioNode {
        @JSProperty
        @Nullable
        Float32Array getCurve();

        @JSProperty
        void setCurve(Float32Array curve);

        @JSProperty
        OverSampleType getOversample();

        @JSProperty
        void setOversample(OverSampleType oversample);

        @JSBody(script = "return WaveShaperNode.prototype")
        static WaveShaperNode prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"context","options"}, script = "return new WaveShaperNode(context, options)")
        static WaveShaperNode create(BaseAudioContext context, WaveShaperOptions options) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="context", script = "return new WaveShaperNode(context)")
        static WaveShaperNode create(BaseAudioContext context) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
