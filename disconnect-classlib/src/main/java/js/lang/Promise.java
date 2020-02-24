package js.lang;

import js.util.collections.Array;
import js.util.function.JsConsumer;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;

/**
 * Represents the completion of an asynchronous operation
 *
 * @param <T> the type parameter
 */
public abstract class Promise<T extends Any> extends PromiseLike<T> {
	/**
	 * Prototype promise.
	 *
	 * @return the promise
	 */
	@JSBody(script = "return Promise.prototype")
    public static Promise prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Creates a new Promise.
	 *
	 * @param <T>      the type parameter
	 * @param executor A callback used to initialize the promise. This callback is passed two arguments:
	 *                 a resolve callback used to resolve the promise with a value or the result of another promise,
	 *                 and a reject callback used to reject the promise with a provided reason or error.
	 *
	 * @return the promise
	 */
	@JSBody(params = "executor", script = "return new Promise(executor)")
    public static <T extends Any> Promise<T> create(JsConsumer<PromiseExecutor<T>> executor) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Creates a Promise that is resolved with an array of results when all of the provided Promises
	 * resolve, or rejected when any Promise is rejected.
	 *
	 * @param <T>    the type parameter
	 * @param values An array of Promises.
	 *
	 * @return A new Promise.
	 */
	@JSBody(params = "values", script = "return Promise.all(values)")
    public static <T extends Any> Promise<Array<T>> all(PromiseLike<T>... values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * All promise.
	 *
	 * @param <T>    the type parameter
	 * @param values the values
	 *
	 * @return the promise
	 */
	@JSBody(params = "values", script = "return Promise.all(values)")
    public static <T extends Any> Promise<Array<T>> all(Array<PromiseLike<T>> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * All promise.
	 *
	 * @param <T>    the type parameter
	 * @param values the values
	 *
	 * @return the promise
	 */
	@JSBody(params = "values", script = "return Promise.all(values)")
    public static <T extends Any> Promise<Array<T>> all(JsIterable<PromiseLike<T>> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
	 * or rejected.
	 *
	 * @param <T>    the type parameter
	 * @param values An array of Promises.
	 *
	 * @return A new Promise.
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
     * @return A Promise for the completion of which ever callback is executed.
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
	 * @param <R>        the type parameter
	 * @param onrejected The callback to execute when the Promise is rejected.
	 *
	 * @return A Promise for the completion of the callback.
	 */
	@JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native <R extends Any> Promise<R> catchError(RejectedValueCallback<R> onrejected);

	/**
	 * Catch error void promise.
	 *
	 * @param onrejected the onrejected
	 *
	 * @return the void promise
	 */
	@JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native VoidPromise catchError(RejectedValueVoidCallback onrejected);

	/**
	 * Catch error boolean promise.
	 *
	 * @param onrejected the onrejected
	 *
	 * @return the boolean promise
	 */
	@JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native BooleanPromise catchError(RejectedValueBooleanCallback onrejected);

	/**
	 * Catch error string promise.
	 *
	 * @param onrejected the onrejected
	 *
	 * @return the string promise
	 */
	@JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native StringPromise catchError(RejectedValueStringCallback onrejected);

	/**
	 * Catch error int promise.
	 *
	 * @param onrejected the onrejected
	 *
	 * @return the int promise
	 */
	@JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native IntPromise catchError(RejectedValueIntCallback onrejected);

	/**
	 * Catch error double promise.
	 *
	 * @param onrejected the onrejected
	 *
	 * @return the double promise
	 */
	@JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native DoublePromise catchError(RejectedValueDoubleCallback onrejected);

	/**
	 * The interface Promise executor.
	 *
	 * @param <T> the type parameter
	 */
	public interface PromiseExecutor<T extends Any> extends Any {
		/**
		 * Resolve.
		 *
		 * @param value the value
		 */
		void resolve(T value);

		/**
		 * Resolve.
		 *
		 * @param value the value
		 */
		void resolve(PromiseLike<T> value);

		/**
		 * Resolve.
		 */
		void resolve();

		/**
		 * Reject.
		 *
		 * @param reason the reason
		 */
		void reject(Any reason);

		/**
		 * Reject.
		 */
		void reject();
    }
}
