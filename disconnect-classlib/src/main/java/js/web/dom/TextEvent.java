package js.web.dom;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface TextEvent extends UIEvent {
    @JSBody(script = "return TextEvent.prototype")
    static TextEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new TextEvent()")
    static TextEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getData();

    void initTextEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, String dataArg, InputMethod inputMethod, String locale);

    abstract class InputMethod extends JsEnum {
        public static final InputMethod DOM_INPUT_METHOD_DROP = JsEnum.from("TextEvent.DOM_INPUT_METHOD_DROP");


        public static final InputMethod DOM_INPUT_METHOD_HANDWRITING = JsEnum.from("TextEvent.DOM_INPUT_METHOD_HANDWRITING");


        public static final InputMethod DOM_INPUT_METHOD_IME = JsEnum.from("TextEvent.DOM_INPUT_METHOD_IME");


        public static final InputMethod DOM_INPUT_METHOD_KEYBOARD = JsEnum.from("TextEvent.DOM_INPUT_METHOD_KEYBOARD");


        public static final InputMethod DOM_INPUT_METHOD_MULTIMODAL = JsEnum.from("TextEvent.DOM_INPUT_METHOD_MULTIMODAL");


        public static final InputMethod DOM_INPUT_METHOD_OPTION = JsEnum.from("TextEvent.DOM_INPUT_METHOD_OPTION");


        public static final InputMethod DOM_INPUT_METHOD_PASTE = JsEnum.from("TextEvent.DOM_INPUT_METHOD_PASTE");


        public static final InputMethod DOM_INPUT_METHOD_SCRIPT = JsEnum.from("TextEvent.DOM_INPUT_METHOD_SCRIPT");


        public static final InputMethod DOM_INPUT_METHOD_UNKNOWN = JsEnum.from("TextEvent.DOM_INPUT_METHOD_UNKNOWN");


        public static final InputMethod DOM_INPUT_METHOD_VOICE = JsEnum.from("TextEvent.DOM_INPUT_METHOD_VOICE");
    }

}
