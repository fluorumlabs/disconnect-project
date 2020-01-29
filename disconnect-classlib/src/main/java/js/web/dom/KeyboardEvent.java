package js.web.dom;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * KeyboardEvent objects describe a user interaction with the keyboard; each event describes a single interaction between the user and a key (or combination of a key with modifier keys) on the keyboard.
 */
public interface KeyboardEvent extends UIEvent {
    @JSBody(script = "return KeyboardEvent.prototype")
    static KeyboardEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new KeyboardEvent(type, eventInitDict)")
    static KeyboardEvent create(String type, KeyboardEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new KeyboardEvent(type)")
    static KeyboardEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isAltKey();

    @Deprecated
    @JSProperty
    String getChar();

    @JSProperty
    void setChar(String charValue);

    @Deprecated
    @JSProperty
    int getCharCode();

    @JSProperty
    String getCode();

    @JSProperty
    boolean isCtrlKey();

    @JSProperty
    boolean isIsComposing();

    @JSProperty
    String getKey();

    @Deprecated
    @JSProperty
    int getKeyCode();

    @JSProperty
    Location getLocation();

    @JSProperty
    boolean isMetaKey();

    @JSProperty
    boolean isRepeat();

    @JSProperty
    boolean isShiftKey();

    boolean getModifierState(String keyArg);

    interface KeyboardEventInit extends EventModifierInit {
        @JSProperty
        @Nullable
        String getCode();

        @JSProperty
        void setCode(String code);

        @JSProperty
        boolean isIsComposing();

        @JSProperty
        void setIsComposing(boolean isComposing);

        @JSProperty
        @Nullable
        String getKey();

        @JSProperty
        void setKey(String key);

        @JSProperty
        int getLocation();

        @JSProperty
        void setLocation(int location);

        @JSProperty
        boolean isRepeat();

        @JSProperty
        void setRepeat(boolean repeat);

    }

    abstract class Location extends JsEnum {
        public static final Location DOM_KEY_LOCATION_LEFT = JsEnum.from("return KeyboardEvent.DOM_KEY_LOCATION_LEFT");

        public static final Location DOM_KEY_LOCATION_NUMPAD = JsEnum.from("return KeyboardEvent.DOM_KEY_LOCATION_NUMPAD");

        public static final Location DOM_KEY_LOCATION_RIGHT = JsEnum.from("return KeyboardEvent.DOM_KEY_LOCATION_RIGHT");

        public static final Location DOM_KEY_LOCATION_STANDARD = JsEnum.from("return KeyboardEvent.DOM_KEY_LOCATION_STANDARD");
    }
}
