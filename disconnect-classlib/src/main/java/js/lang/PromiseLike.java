package js.lang;


import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


public abstract class PromiseLike<T extends Any> implements Any {
    @Async
    private static native <T extends Any> T await(PromiseLike<T> promise) throws PromiseRejectionException;

    private static <T extends Any> void await(PromiseLike<T> promise, AsyncCallback<T> callback) {
        promise.then(callback::complete, reason -> {
            callback.error(new PromiseRejectionException(reason.<JsObject>cast().toString()));
        });
    }

    /**
     * Attaches callbacks for the resolution and/or rejection of the Promise.
     *
     * @param onfulfilled The callback to execute when the Promise is resolved.
     * @param onrejected  The callback to execute when the Promise is rejected.
     *
     * @returns A Promise for the completion of which ever callback is executed.
     */
    public native <R extends Any> PromiseLike<R> then(FullfilledValueCallback<T, R> onfulfilled, RejectedValueCallback<R> onrejected);

    public native <R extends Any> PromiseLike<R> then(FullfilledValueCallback<T, R> onfulfilled);

    public native VoidPromiseLike then(FullfilledValueVoidCallback<T> onfulfilled, RejectedValueVoidCallback onrejected);

    public native VoidPromiseLike then(FullfilledValueVoidCallback<T> onfulfilled);

    public native BooleanPromiseLike then(FullfilledValueBooleanCallback<T> onfulfilled, RejectedValueBooleanCallback onrejected);

    public native BooleanPromiseLike then(FullfilledValueBooleanCallback<T> onfulfilled);

    public native StringPromiseLike then(FullfilledValueStringCallback<T> onfulfilled, RejectedValueStringCallback onrejected);

    public native StringPromiseLike then(FullfilledValueStringCallback<T> onfulfilled);

    public native IntPromiseLike then(FullfilledValueIntCallback<T> onfulfilled, RejectedValueIntCallback onrejected);

    public native IntPromiseLike then(FullfilledValueIntCallback<T> onfulfilled);

    public native DoublePromiseLike then(FullfilledValueDoubleCallback<T> onfulfilled, RejectedValueDoubleCallback onrejected);

    public native DoublePromiseLike then(FullfilledValueDoubleCallback<T> onfulfilled);

    public T await() throws PromiseRejectionException {
        return PromiseLike.await(this);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueCallback<T extends Any, R extends Any> extends JSObject {
        @Nullable
        R fullfilled(T value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueCallback<R extends Any> extends JSObject {
        @Nullable
        R rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueVoidCallback<T extends Any> extends JSObject {
        void fullfilled(T value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueVoidCallback extends JSObject {
        void rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueBooleanCallback<T extends Any> extends JSObject {
        boolean fullfilled(T value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueBooleanCallback extends JSObject {
        boolean rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueStringCallback<T extends Any> extends JSObject {
        String fullfilled(T value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueStringCallback extends JSObject {
        String rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueIntCallback<T extends Any> extends JSObject {
        int fullfilled(T value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueIntCallback extends JSObject {
        int rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueDoubleCallback<T extends Any> extends JSObject {
        double fullfilled(T value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueDoubleCallback extends JSObject {
        double rejected(Unknown reason);
    }

}
