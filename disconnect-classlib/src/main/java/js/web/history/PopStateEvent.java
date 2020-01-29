package js.web.history;

import js.lang.Any;
import js.lang.Unknown;
import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * PopStateEvent is an event handler for the popstate event on the window.
 */
public interface PopStateEvent extends Event {
    @JSBody(script = "return PopStateEvent.prototype")
    static PopStateEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new PopStateEvent(type, eventInitDict)")
    static PopStateEvent create(String type, PopStateEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new PopStateEvent(type)")
    static PopStateEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Unknown getState();


    interface PopStateEventInit extends EventInit {
        @JSProperty
        @Nullable
        Any getState();

        @JSProperty
        void setState(Any state);

    }
}
