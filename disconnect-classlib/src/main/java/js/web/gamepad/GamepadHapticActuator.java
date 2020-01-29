package js.web.gamepad;

import js.lang.Any;
import js.lang.BooleanPromise;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware. */
public interface GamepadHapticActuator extends Any {
    @JSProperty
    GamepadHapticActuatorType getType();

    BooleanPromise pulse(double value, double duration);

    @JSBody(script = "return GamepadHapticActuator.prototype")
    static GamepadHapticActuator prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new GamepadHapticActuator()")
    static GamepadHapticActuator create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
