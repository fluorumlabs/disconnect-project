package js.web.dom;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface OverflowEvent extends UIEvent {
        @JSProperty
        boolean isHorizontalOverflow();

        @JSProperty
        Orient getOrient();

        @JSProperty
        boolean isVerticalOverflow();

        abstract class Orient extends JsEnum {
        public static final Orient BOTH = JsEnum.from("return OverflowEvent.BOTH");

        public static final Orient HORIZONTAL = JsEnum.from("return OverflowEvent.HORIZONTAL");

        public static final Orient VERTICAL = JsEnum.from("return OverflowEvent.VERTICAL");}

        @JSBody(script = "return OverflowEvent.prototype")
        static OverflowEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new OverflowEvent()")
        static OverflowEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
