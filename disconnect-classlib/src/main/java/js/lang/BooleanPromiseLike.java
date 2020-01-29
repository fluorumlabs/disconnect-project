package js.lang;


import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


public abstract class BooleanPromiseLike implements Any {
    @Async
    private static native boolean await(BooleanPromiseLike promise) throws PromiseRejectionException;

    private static void await(BooleanPromiseLike promise, AsyncCallback<Boolean> callback) {
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
    public native <R extends Any> PromiseLike<R> then(FullfilledValueCallback<R> onfulfilled, RejectedValueCallback<R> onrejected);

    public native <R extends Any> PromiseLike<R> then(FullfilledValueCallback<R> onfulfilled);

    public native VoidPromiseLike then(FullfilledValueVoidCallback onfulfilled, RejectedValueVoidCallback onrejected);

    public native VoidPromiseLike then(FullfilledValueVoidCallback onfulfilled);

    public native BooleanPromiseLike then(FullfilledValueBooleanCallback onfulfilled, RejectedValueBooleanCallback onrejected);

    public native BooleanPromiseLike then(FullfilledValueBooleanCallback onfulfilled);

    public native StringPromiseLike then(FullfilledValueStringCallback onfulfilled, RejectedValueStringCallback onrejected);

    public native StringPromiseLike then(FullfilledValueStringCallback onfulfilled);

    public native IntPromiseLike then(FullfilledValueIntCallback onfulfilled, RejectedValueIntCallback onrejected);

    public native IntPromiseLike then(FullfilledValueIntCallback onfulfilled);

    public native DoublePromiseLike then(FullfilledValueDoubleCallback onfulfilled, RejectedValueDoubleCallback onrejected);

    public native DoublePromiseLike then(FullfilledValueDoubleCallback onfulfilled);

    public boolean await() throws PromiseRejectionException {
        return BooleanPromiseLike.await(this);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueCallback<R extends Any> extends JSObject {
        @Nullable
        R fullfilled(boolean value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueCallback<R extends Any> extends JSObject {
        @Nullable
        R rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueVoidCallback extends JSObject {
        void fullfilled(boolean value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueVoidCallback extends JSObject {
        void rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueBooleanCallback extends JSObject {
        boolean fullfilled(boolean value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueBooleanCallback extends JSObject {
        boolean rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueStringCallback extends JSObject {
        String fullfilled(boolean value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueStringCallback extends JSObject {
        String rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueIntCallback extends JSObject {
        int fullfilled(boolean value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueIntCallback extends JSObject {
        int rejected(Unknown reason);
    }

    @JSFunctor
    @FunctionalInterface
    public interface FullfilledValueDoubleCallback extends JSObject {
        double fullfilled(boolean value);
    }

    @JSFunctor
    @FunctionalInterface
    public interface RejectedValueDoubleCallback extends JSObject {
        double rejected(Unknown reason);
    }

}
