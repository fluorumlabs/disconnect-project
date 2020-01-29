package js.web.gamepad;

import js.lang.Any;
import js.util.collections.ReadonlyArray;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id.
 */
public interface Gamepad extends Any {
    @JSBody(script = "return Gamepad.prototype")
    static Gamepad prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Gamepad()")
    static Gamepad create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double[] getAxes();

    @JSProperty
    ReadonlyArray<GamepadButton> getButtons();

    @JSProperty
    boolean isConnected();

    @JSProperty
    GamepadHand getHand();

    @JSProperty
    ReadonlyArray<GamepadHapticActuator> getHapticActuators();

    @JSProperty
    String getId();

    @JSProperty
    int getIndex();

    @JSProperty
    GamepadMappingType getMapping();

    @JSProperty
    @Nullable
    GamepadPose getPose();

    @JSProperty
    double getTimestamp();

}
