package js.web.gamepad;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This Gamepad API interface contains references to gamepads connected to the system, which is what the gamepad events Window.gamepadconnected and Window.gamepaddisconnected are fired in response to.
 */
public interface GamepadEvent extends Event {
    @JSBody(script = "return GamepadEvent.prototype")
    static GamepadEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new GamepadEvent(type, eventInitDict)")
    static GamepadEvent create(String type, GamepadEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new GamepadEvent(type)")
    static GamepadEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Gamepad getGamepad();


    interface GamepadEventInit extends EventInit {
        @JSProperty
        Gamepad getGamepad();

        @JSProperty
        void setGamepad(Gamepad gamepad);

    }
}
