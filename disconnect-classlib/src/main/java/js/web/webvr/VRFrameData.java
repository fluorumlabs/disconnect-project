package js.web.webvr;

import js.lang.Any;
import js.util.buffers.Float32Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This WebVR API interface represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData().
 */
public interface VRFrameData extends Any {
    @JSBody(script = "return VRFrameData.prototype")
    static VRFrameData prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new VRFrameData()")
    static VRFrameData create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Float32Array getLeftProjectionMatrix();

    @JSProperty
    Float32Array getLeftViewMatrix();

    @JSProperty
    VRPose getPose();

    @JSProperty
    Float32Array getRightProjectionMatrix();

    @JSProperty
    Float32Array getRightViewMatrix();

    @JSProperty
    double getTimestamp();


}
