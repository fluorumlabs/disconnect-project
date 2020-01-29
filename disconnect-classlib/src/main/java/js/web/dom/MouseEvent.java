package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Events that occur due to the user interacting with a pointing device (such as a mouse). Common events using this interface include click, dblclick, mouseup, mousedown.
 */
public interface MouseEvent extends UIEvent {
    @JSBody(script = "return MouseEvent.prototype")
    static MouseEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new MouseEvent(type, eventInitDict)")
    static MouseEvent create(String type, MouseEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new MouseEvent(type)")
    static MouseEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isAltKey();

    @JSProperty
    int getButton();

    @JSProperty
    int getButtons();

    @JSProperty
    double getClientX();

    @JSProperty
    double getClientY();

    @JSProperty
    boolean isCtrlKey();

    @JSProperty
    boolean isMetaKey();

    @JSProperty
    double getMovementX();

    @JSProperty
    double getMovementY();

    @JSProperty
    double getOffsetX();

    @JSProperty
    double getOffsetY();

    @JSProperty
    double getPageX();

    @JSProperty
    double getPageY();

    @JSProperty
    @Nullable
    EventTarget getRelatedTarget();

    @JSProperty
    double getScreenX();

    @JSProperty
    double getScreenY();

    @JSProperty
    boolean isShiftKey();

    @JSProperty
    double getX();

    @JSProperty
    double getY();

    boolean getModifierState(String keyArg);

    void initMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, double detailArg, double screenXArg, double screenYArg, double clientXArg, double clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, int buttonArg, @Nullable EventTarget relatedTargetArg);


    interface MouseEventInit extends EventModifierInit {
        @JSProperty
        int getButton();

        @JSProperty
        void setButton(int button);

        @JSProperty
        int getButtons();

        @JSProperty
        void setButtons(int buttons);

        @JSProperty
        double getClientX();

        @JSProperty
        void setClientX(double clientX);

        @JSProperty
        double getClientY();

        @JSProperty
        void setClientY(double clientY);

        @JSProperty
        double getMovementX();

        @JSProperty
        void setMovementX(double movementX);

        @JSProperty
        double getMovementY();

        @JSProperty
        void setMovementY(double movementY);

        @JSProperty
        @Nullable
        EventTarget getRelatedTarget();

        @JSProperty
        void setRelatedTarget(EventTarget relatedTarget);

        @JSProperty
        double getScreenX();

        @JSProperty
        void setScreenX(double screenX);

        @JSProperty
        double getScreenY();

        @JSProperty
        void setScreenY(double screenY);

    }
}
