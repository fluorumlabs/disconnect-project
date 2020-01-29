package js.web.gamepad;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.util.buffers.Float32Array;

/** This Gamepad API interface represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
public interface GamepadPose extends Any {
    @JSProperty
    @Nullable
    Float32Array getAngularAcceleration();

    @JSProperty
    @Nullable
    Float32Array  getAngularVelocity();

    @JSProperty
    boolean isHasOrientation();

    @JSProperty
    boolean isHasPosition();

    @JSProperty
    @Nullable
    Float32Array  getLinearAcceleration();

    @JSProperty
    @Nullable
    Float32Array  getLinearVelocity();

    @JSProperty
    @Nullable
    Float32Array  getOrientation();

    @JSProperty
    @Nullable
    Float32Array  getPosition();

    @JSBody(script = "return GamepadPose.prototype")
    static GamepadPose prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new GamepadPose()")
    static GamepadPose create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
