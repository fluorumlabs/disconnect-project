package js.web.webvr;

import js.lang.Any;
import js.util.buffers.Float32Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This WebVR API interface represents the state of a VR sensor at a given timestamp (which includes orientation, position, velocity, and acceleration information.)
 */
public interface VRPose extends Any {
    @JSBody(script = "return VRPose.prototype")
    static VRPose prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new VRPose()")
    static VRPose create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    Float32Array getAngularAcceleration();

    @JSProperty
    @Nullable
    Float32Array getAngularVelocity();

    @JSProperty
    @Nullable
    Float32Array getLinearAcceleration();

    @JSProperty
    @Nullable
    Float32Array getLinearVelocity();

    @JSProperty
    @Nullable
    Float32Array getOrientation();

    @JSProperty
    @Nullable
    Float32Array getPosition();

    @JSProperty
    double getTimestamp();

}
