package js.lang;


import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


/**
 * The type Int promise like.
 */
public abstract class IntPromiseLike implements Any {
    @Async
    private static native int await(IntPromiseLike promise) throws PromiseRejectionException;

    private static void await(IntPromiseLike promise, AsyncCallback<Boolean> callback) {
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
	public native <R extends Any> PromiseLike<R> then(FullfilledValueCallback<R> onfulfilled, RejectedValueCallback<R> onrejected);

	/**
	 * Then promise like.
	 *
	 * @param <R>         the type parameter
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the promise like
	 */
	public native <R extends Any> PromiseLike<R> then(FullfilledValueCallback<R> onfulfilled);

	/**
	 * Then void promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the void promise like
	 */
	public native VoidPromiseLike then(FullfilledValueVoidCallback onfulfilled, RejectedValueVoidCallback onrejected);

	/**
	 * Then void promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the void promise like
	 */
	public native VoidPromiseLike then(FullfilledValueVoidCallback onfulfilled);

	/**
	 * Then boolean promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the boolean promise like
	 */
	public native BooleanPromiseLike then(FullfilledValueBooleanCallback onfulfilled, RejectedValueBooleanCallback onrejected);

	/**
	 * Then boolean promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the boolean promise like
	 */
	public native BooleanPromiseLike then(FullfilledValueBooleanCallback onfulfilled);

	/**
	 * Then string promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the string promise like
	 */
	public native StringPromiseLike then(FullfilledValueStringCallback onfulfilled, RejectedValueStringCallback onrejected);

	/**
	 * Then string promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the string promise like
	 */
	public native StringPromiseLike then(FullfilledValueStringCallback onfulfilled);

	/**
	 * Then int promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the int promise like
	 */
	public native IntPromiseLike then(FullfilledValueIntCallback onfulfilled, RejectedValueIntCallback onrejected);

	/**
	 * Then int promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the int promise like
	 */
	public native IntPromiseLike then(FullfilledValueIntCallback onfulfilled);

	/**
	 * Then double promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 * @param onrejected  the onrejected
	 *
	 * @return the double promise like
	 */
	public native DoublePromiseLike then(FullfilledValueDoubleCallback onfulfilled, RejectedValueDoubleCallback onrejected);

	/**
	 * Then double promise like.
	 *
	 * @param onfulfilled the onfulfilled
	 *
	 * @return the double promise like
	 */
	public native DoublePromiseLike then(FullfilledValueDoubleCallback onfulfilled);

	/**
	 * Await int.
	 *
	 * @return the int
	 *
	 * @throws PromiseRejectionException the promise rejection exception
	 */
	public int await() throws PromiseRejectionException {
        return IntPromiseLike.await(this);
    }

	/**
	 * The interface Fullfilled value callback.
	 *
	 * @param <R> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueCallback<R extends Any> extends JSObject {
		/**
		 * Fullfilled r.
		 *
		 * @param value the value
		 *
		 * @return the r
		 */
		@Nullable
        R fullfilled(boolean value);
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
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueVoidCallback extends JSObject {
		/**
		 * Fullfilled.
		 *
		 * @param value the value
		 */
		void fullfilled(boolean value);
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
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueBooleanCallback extends JSObject {
		/**
		 * Fullfilled boolean.
		 *
		 * @param value the value
		 *
		 * @return the boolean
		 */
		boolean fullfilled(boolean value);
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
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueStringCallback extends JSObject {
		/**
		 * Fullfilled string.
		 *
		 * @param value the value
		 *
		 * @return the string
		 */
		String fullfilled(boolean value);
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
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueIntCallback extends JSObject {
		/**
		 * Fullfilled int.
		 *
		 * @param value the value
		 *
		 * @return the int
		 */
		int fullfilled(boolean value);
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
	 */
	@JSFunctor
    @FunctionalInterface
    public interface FullfilledValueDoubleCallback extends JSObject {
		/**
		 * Fullfilled double.
		 *
		 * @param value the value
		 *
		 * @return the double
		 */
		double fullfilled(boolean value);
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
