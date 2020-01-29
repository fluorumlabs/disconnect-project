package js.lang;

import js.util.collections.Array;
import js.util.function.JsConsumer;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;

/**
 * Represents the completion of an asynchronous operation
 */
public abstract class Promise<T extends Any> extends PromiseLike<T> {
    @JSBody(script = "return Promise.prototype")
    public static Promise prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Creates a new Promise.
     *
     * @param executor A callback used to initialize the promise. This callback is passed two arguments:
     *                 a resolve callback used to resolve the promise with a value or the result of another promise,
     *                 and a reject callback used to reject the promise with a provided reason or error.
     */
    @JSBody(params = "executor", script = "return new Promise(executor)")
    public static <T extends Any> Promise<T> create(JsConsumer<PromiseExecutor<T>> executor) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Creates a Promise that is resolved with an array of results when all of the provided Promises
     * resolve, or rejected when any Promise is rejected.
     *
     * @param values An array of Promises.
     *
     * @returns A new Promise.
     */
    @JSBody(params = "values", script = "return Promise.all(values)")
    public static <T extends Any> Promise<Array<T>> all(@JSByRef PromiseLike<T>... values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "values", script = "return Promise.all(values)")
    public static <T extends Any> Promise<Array<T>> all(Array<PromiseLike<T>> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "values", script = "return Promise.all(values)")
    public static <T extends Any> Promise<Array<T>> all(JsIterable<PromiseLike<T>> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
     * or rejected.
     *
     * @param values An array of Promises.
     *
     * @returns A new Promise.
     */
    @JSBody(params = "values", script = "return Promise.race(values)")
    public static <T extends Any> Promise<T> race(JsIterable<PromiseLike<T>> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Attaches callbacks for the resolution and/or rejection of the Promise.
     *
     * @param onfulfilled The callback to execute when the Promise is resolved.
     * @param onrejected  The callback to execute when the Promise is rejected.
     *
     * @returns A Promise for the completion of which ever callback is executed.
     */
    public native <R extends Any> Promise<R> then(FullfilledValueCallback<T, R> onfulfilled, RejectedValueCallback<R> onrejected);

    public native <R extends Any> Promise<R> then(FullfilledValueCallback<T, R> onfulfilled);

    public native VoidPromise then(FullfilledValueVoidCallback<T> onfulfilled, RejectedValueVoidCallback onrejected);

    public native VoidPromise then(FullfilledValueVoidCallback<T> onfulfilled);

    public native BooleanPromise then(FullfilledValueBooleanCallback<T> onfulfilled, RejectedValueBooleanCallback onrejected);

    public native BooleanPromise then(FullfilledValueBooleanCallback<T> onfulfilled);

    public native StringPromise then(FullfilledValueStringCallback<T> onfulfilled, RejectedValueStringCallback onrejected);

    public native StringPromise then(FullfilledValueStringCallback<T> onfulfilled);

    public native IntPromise then(FullfilledValueIntCallback<T> onfulfilled, RejectedValueIntCallback onrejected);

    public native IntPromise then(FullfilledValueIntCallback<T> onfulfilled);

    public native DoublePromise then(FullfilledValueDoubleCallback<T> onfulfilled, RejectedValueDoubleCallback onrejected);

    public native DoublePromise then(FullfilledValueDoubleCallback<T> onfulfilled);

    /**
     * Attaches a callback for only the rejection of the Promise.
     *
     * @param onrejected The callback to execute when the Promise is rejected.
     *
     * @returns A Promise for the completion of the callback.
     */
    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native <R extends Any> Promise<R> catchError(RejectedValueCallback<R> onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native VoidPromise catchError(RejectedValueVoidCallback onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native BooleanPromise catchError(RejectedValueBooleanCallback onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native StringPromise catchError(RejectedValueStringCallback onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native IntPromise catchError(RejectedValueIntCallback onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native DoublePromise catchError(RejectedValueDoubleCallback onrejected);

    public interface PromiseExecutor<T extends Any> extends Any {
        void resolve(T value);

        void resolve(PromiseLike<T> value);

        void resolve();

        void reject(Any reason);

        void reject();
    }
}
