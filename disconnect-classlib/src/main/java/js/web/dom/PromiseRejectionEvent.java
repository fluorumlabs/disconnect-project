package js.web.dom;

import js.lang.Any;
import js.lang.Promise;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PromiseRejectionEvent extends Event {
    @JSBody(script = "return PromiseRejectionEvent.prototype")
    static PromiseRejectionEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new PromiseRejectionEvent(type, eventInitDict)")
    static PromiseRejectionEvent create(String type, PromiseRejectionEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new PromiseRejectionEvent(type)")
    static PromiseRejectionEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Promise<Unknown> getPromise();

    @JSProperty
    Unknown getReason();


    interface PromiseRejectionEventInit extends EventInit {
        @JSProperty
        Promise<Any> getPromise();

        @JSProperty
        void setPromise(Promise<Any> promise);

        @JSProperty
        @Nullable
        Any getReason();

        @JSProperty
        void setReason(Any reason);

    }
}
