package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Focus-related events like focus, blur, focusin, or focusout. */
public interface FocusEvent extends UIEvent {
    @JSProperty
    @Nullable
    EventTarget getRelatedTarget();

    @JSBody(script = "return FocusEvent.prototype")
    static FocusEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"type","eventInitDict"}, script = "return new FocusEvent(type, eventInitDict)")
    static FocusEvent create(String type, FocusEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="type", script = "return new FocusEvent(type)")
    static FocusEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }



    interface FocusEventInit extends UIEventInit {
        @JSProperty
        @Nullable
        EventTarget getRelatedTarget();

        @JSProperty
        void setRelatedTarget(EventTarget relatedTarget);

    }
}
