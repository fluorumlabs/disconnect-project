package js.web.touchevents;

import js.util.collections.Array;
import js.web.dom.EventModifierInit;
import js.web.dom.UIEvent;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * An event sent when the state of contacts with a touch-sensitive surface changes. This surface can be a touch screen or trackpad, for example. The event can describe one or more points of contact with the screen and includes support for detecting movement, addition and removal of contact points, and so forth.
 */
public interface TouchEvent extends UIEvent {
    @JSBody(script = "return TouchEvent.prototype")
    static TouchEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new TouchEvent(type, eventInitDict)")
    static TouchEvent create(String type, TouchEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new TouchEvent(type)")
    static TouchEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isAltKey();

    @JSProperty
    TouchList getChangedTouches();

    @JSProperty
    boolean isCtrlKey();

    @JSProperty
    boolean isMetaKey();

    @JSProperty
    boolean isShiftKey();

    @JSProperty
    TouchList getTargetTouches();

    @JSProperty
    TouchList getTouches();


    interface TouchEventInit extends EventModifierInit {
        @JSProperty
        @Nullable
        Array<Touch> getChangedTouches();

        @JSProperty
        void setChangedTouches(Touch... changedTouches);

        @JSProperty
        void setChangedTouches(Array<Touch> changedTouches);

        @JSProperty
        @Nullable
        Array<Touch> getTargetTouches();

        @JSProperty
        void setTargetTouches(Touch... targetTouches);

        @JSProperty
        void setTargetTouches(Array<Touch> targetTouches);

        @JSProperty
        @Nullable
        Array<Touch> getTouches();

        @JSProperty
        void setTouches(Touch... touches);

        @JSProperty
        void setTouches(Array<Touch> touches);

    }
}
