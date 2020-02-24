package js.lang;


import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


/**
 * The type Promise like.
 *
 * @param <T> the type parameter
 */
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
	 * @param <R>         the type parameter
	 * @param onfulfilled The callback to execute when the Promise is resolved.
	 * @param onrejected  The callback to execute when the Promise is rejected.
	 *
	 * @return A Promise for the completion of which ever callback is executed.
	 */
	public native <R extends Any> PromiseLike<R> then(FullfilledValueCallback<T, R> onfulfilled, RejectedValueCallback<R> onrejected);

	/**
	 * Then promise like.
	 *
	 * @param <R>         the type parameter
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the promise like
	 */
	public native <R extends Any> PromiseLike<R> then(FullfilledValueCallback<T, R> onfulfilled);

	/**
	 * Then void promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the void promise like
	 */
	public native VoidPromiseLike then(FullfilledValueVoidCallback<T> onfulfilled, RejectedValueVoidCallback onrejected);

	/**
	 * Then void promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the void promise like
	 */
	public native VoidPromiseLike then(FullfilledValueVoidCallback<T> onfulfilled);

	/**
	 * Then boolean promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the boolean promise like
	 */
	public native BooleanPromiseLike then(FullfilledValueBooleanCallback<T> onfulfilled, RejectedValueBooleanCallback onrejected);

	/**
	 * Then boolean promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the boolean promise like
	 */
	public native BooleanPromiseLike then(FullfilledValueBooleanCallback<T> onfulfilled);

	/**
	 * Then string promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the string promise like
	 */
	public native StringPromiseLike then(FullfilledValueStringCallback<T> onfulfilled, RejectedValueStringCallback onrejected);

	/**
	 * Then string promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the string promise like
	 */
	public native StringPromiseLike then(FullfilledValueStringCallback<T> onfulfilled);

	/**
	 * Then int promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the int promise like
	 */
	public native IntPromiseLike then(FullfilledValueIntCallback<T> onfulfilled, RejectedValueIntCallback onrejected);

	/**
	 * Then int promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the int promise like
	 */
	public native IntPromiseLike then(FullfilledValueIntCallback<T> onfulfilled);

	/**
	 * Then double promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the double promise like
	 */
	public native DoublePromiseLike then(FullfilledValueDoubleCallback<T> onfulfilled, RejectedValueDoubleCallback onrejected);

	/**
	 * Then double promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the double promise like
	 */
	public native DoublePromiseLike then(FullfilledValueDoubleCallback<T> onfulfilled);

	/**
	 * Await t.
	 *
	 * @return the t
	 *
	 * @throws PromiseRejectionException the promise rejection exception
	 */
	public T await() throws PromiseRejectionException {
        return PromiseLike.await(this);
    }

	/**
	 * The interface Fullfilled value callback.
	 *
	 * @param <T> the type parameter
	 * @param <R> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueCallback<T extends Any, R extends Any> extends JSObject {
		/**
		 * Fullfilled r.
		 *
		 * @param value the value
		 *
		 * @return the r
		 */
		@Nullable
        R fullfilled(T value);
    }

	/**
	 * The interface Rejected value callback.
	 *
	 * @param <R> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    public interface RejectedValueCallback<R extends Any> extends JSObject {
		/**
		 * Rejected r.
		 *
		 * @param reason the reason
		 *
		 * @return the r
		 */
		@Nullable
        R rejected(Unknown reason);
    }

	/**
	 * The interface Fullfilled value void callback.
	 *
	 * @param <T> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueVoidCallback<T extends Any> extends JSObject {
		/**
		 * Fullfilled.
		 *
		 * @param value the value
		 */
		void fullfilled(T value);
    }

	/**
	 * The interface Rejected value void callback.
	 */
	@JSFunctor
    @FunctionalInterface
    public interface RejectedValueVoidCallback extends JSObject {
		/**
		 * Rejected.
		 *
		 * @param reason the reason
		 */
		void rejected(Unknown reason);
    }

	/**
	 * The interface Fullfilled value boolean callback.
	 *
	 * @param <T> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueBooleanCallback<T extends Any> extends JSObject {
		/**
		 * Fullfilled boolean.
		 *
		 * @param value the value
		 *
		 * @return the boolean
		 */
		boolean fullfilled(T value);
    }

	/**
	 * The interface Rejected value boolean callback.
	 */
	@JSFunctor
    @FunctionalInterface
    public interface RejectedValueBooleanCallback extends JSObject {
		/**
		 * Rejected boolean.
		 *
		 * @param reason the reason
		 *
		 * @return the boolean
		 */
		boolean rejected(Unknown reason);
    }

	/**
	 * The interface Fullfilled value string callback.
	 *
	 * @param <T> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueStringCallback<T extends Any> extends JSObject {
		/**
		 * Fullfilled string.
		 *
		 * @param value the value
		 *
		 * @return the string
		 */
		String fullfilled(T value);
    }

	/**
	 * The interface Rejected value string callback.
	 */
	@JSFunctor
    @FunctionalInterface
    public interface RejectedValueStringCallback extends JSObject {
		/**
		 * Rejected string.
		 *
		 * @param reason the reason
		 *
		 * @return the string
		 */
		String rejected(Unknown reason);
    }

	/**
	 * The interface Fullfilled value int callback.
	 *
	 * @param <T> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueIntCallback<T extends Any> extends JSObject {
		/**
		 * Fullfilled int.
		 *
		 * @param value the value
		 *
		 * @return the int
		 */
		int fullfilled(T value);
    }

	/**
	 * The interface Rejected value int callback.
	 */
	@JSFunctor
    @FunctionalInterface
    public interface RejectedValueIntCallback extends JSObject {
		/**
		 * Rejected int.
		 *
		 * @param reason the reason
		 *
		 * @return the int
		 */
		int rejected(Unknown reason);
    }

	/**
	 * The interface Fullfilled value double callback.
	 *
	 * @param <T> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueDoubleCallback<T extends Any> extends JSObject {
		/**
		 * Fullfilled double.
		 *
		 * @param value the value
		 *
		 * @return the double
		 */
		double fullfilled(T value);
    }

	/**
	 * The interface Rejected value double callback.
	 */
	@JSFunctor
    @FunctionalInterface
    public interface RejectedValueDoubleCallback extends JSObject {
		/**
		 * Rejected double.
		 *
		 * @param reason the reason
		 *
		 * @return the double
		 */
		double rejected(Unknown reason);
    }

}
