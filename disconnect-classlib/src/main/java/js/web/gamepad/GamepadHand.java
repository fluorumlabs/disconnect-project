package js.web.gamepad;

import js.extras.JsEnum;


public abstract class GamepadHand extends JsEnum {
    public static final GamepadHand NONE = JsEnum.of("");

    public static final GamepadHand LEFT = JsEnum.of("left");

    public static final GamepadHand RIGHT = JsEnum.of("right");

}
