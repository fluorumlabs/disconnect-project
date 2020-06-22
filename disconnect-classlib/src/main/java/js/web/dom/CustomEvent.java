package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface CustomEvent<T extends Any> extends Event {
    @JSBody(script = "return CustomEvent.prototype")
    static CustomEvent<?> prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new CustomEvent(type, eventInitDict)")
    static <T extends Any, E extends CustomEvent<T>> E create(String type, CustomEventInit<T> eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new CustomEvent(type)")
    static <T extends Any, E extends CustomEvent<T>> E create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns any custom data event was created with. Typically used for synthetic events.
     */
    @JSProperty
    T getDetail();

    void initCustomEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, T detailArg);


    interface CustomEventInit<T extends Any> extends EventInit {
        @JSProperty
        @Nullable
        T getDetail();

        @JSProperty
        void setDetail(T detail);

    }
}
