package js.web.gamepad;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * An individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device.
 */
public interface GamepadButton extends Any {
    @JSBody(script = "return GamepadButton.prototype")
    static GamepadButton prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new GamepadButton()")
    static GamepadButton create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isPressed();

    @JSProperty
    boolean isTouched();

    @JSProperty
    double getValue();


}
