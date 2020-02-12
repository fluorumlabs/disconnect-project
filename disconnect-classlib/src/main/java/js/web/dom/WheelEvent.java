package js.web.dom;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Events that occur due to the user moving a mouse wheel or similar input device.
 */
public interface WheelEvent extends MouseEvent {
    @JSBody(script = "return WheelEvent.prototype")
    static WheelEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new WheelEvent(type, eventInitDict)")
    static WheelEvent create(String type, WheelEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new WheelEvent(type)")
    static WheelEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    DeltaMode getDeltaMode();

    @JSProperty
    double getDeltaX();

    @JSProperty
    double getDeltaY();

    @JSProperty
    double getDeltaZ();

    interface WheelEventInit extends MouseEventInit {
        @JSProperty
        int getDeltaMode();

        @JSProperty
        void setDeltaMode(int deltaMode);

        @JSProperty
        double getDeltaX();

        @JSProperty
        void setDeltaX(double deltaX);

        @JSProperty
        double getDeltaY();

        @JSProperty
        void setDeltaY(double deltaY);

        @JSProperty
        double getDeltaZ();

        @JSProperty
        void setDeltaZ(double deltaZ);

    }

    abstract class DeltaMode extends JsEnum {
        public static final DeltaMode DOM_DELTA_LINE = JsEnum.from("WheelEvent.DOM_DELTA_LINE");

        public static final DeltaMode DOM_DELTA_PAGE = JsEnum.from("WheelEvent.DOM_DELTA_PAGE");

        public static final DeltaMode DOM_DELTA_PIXEL = JsEnum.from("WheelEvent.DOM_DELTA_PIXEL");
    }
}
