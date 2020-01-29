package js.web.webaudio;

import js.util.buffers.Float32Array;
import org.teavm.jso.JSBody;

/** The IIRFilterNode interface of the Web Audio API is a AudioNode processor which implements a general infinite impulse response (IIR)  filter; this type of filter can be used to implement tone control devices and graphic equalizers as well. It lets the parameters of the filter response be specified, so that it can be tuned as needed. */
        public interface IIRFilterNode extends AudioNode {
        void getFrequencyResponse(Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse);

        @JSBody(script = "return IIRFilterNode.prototype")
        static IIRFilterNode prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"context","options"}, script = "return new IIRFilterNode(context, options)")
        static IIRFilterNode create(BaseAudioContext context, IIRFilterOptions options) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="context", script = "return new IIRFilterNode(context)")
        static IIRFilterNode create(BaseAudioContext context) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
