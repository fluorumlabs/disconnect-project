package js.web.webvr;

import js.util.buffers.Float32Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** This WebVR API interface represents all the information required to correctly render a scene for a given eye, including field of view information. */
        public interface VREyeParameters extends Any {
        @Deprecated
        @JSProperty
        VRFieldOfView getFieldOfView();

        @JSProperty
        Float32Array getOffset();

        @JSProperty
        double getRenderHeight();

        @JSProperty
        double getRenderWidth();

        @JSBody(script = "return VREyeParameters.prototype")
        static VREyeParameters prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new VREyeParameters()")
        static VREyeParameters create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
