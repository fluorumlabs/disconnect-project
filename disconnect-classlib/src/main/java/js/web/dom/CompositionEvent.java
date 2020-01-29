package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** The DOM CompositionEvent represents events that occur due to the user indirectly entering text. */
public interface CompositionEvent extends UIEvent {
    @JSProperty
    String getData();

    @JSBody(script = "return CompositionEvent.prototype")
    static CompositionEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"type","eventInitDict"}, script = "return new CompositionEvent(type, eventInitDict)")
    static CompositionEvent create(String type, CompositionEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="type", script = "return new CompositionEvent(type)")
    static CompositionEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


    interface CompositionEventInit extends UIEventInit {
        @JSProperty
        @Nullable
        String getData();

        @JSProperty
        void setData(String data);

    }
}
