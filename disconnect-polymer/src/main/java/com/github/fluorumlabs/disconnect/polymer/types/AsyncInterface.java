package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.util.function.JsRunnable;

public interface AsyncInterface extends Any {
	/**
	 * Enqueues a function.
	 *
	 * @param callback Callback to run
	 *
	 * @return Handle used for canceling task
	 */
	Handle run(JsRunnable callback, double delay);

	Handle run(JsRunnable callback);

	/**
	 * Cancels a previously enqueued callback.
	 *
	 * @param handle Handle returned from `run` of callback to cancel
	 */
	void cancel(Handle handle);

	abstract class Handle extends js.extras.Handle {
	}
}
