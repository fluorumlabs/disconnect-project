package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.util.function.JsRunnable;

/**
 * The interface Async interface.
 */
public interface AsyncInterface extends Any {
	/**
	 * Enqueues a function.
	 *
	 * @param callback Callback to run
	 * @param delay    the delay
	 *
	 * @return Handle used for canceling task
	 */
	Handle run(JsRunnable callback, double delay);

	/**
	 * Run handle.
	 *
	 * @param callback the callback
	 *
	 * @return the handle
	 */
	Handle run(JsRunnable callback);

	/**
	 * Cancels a previously enqueued callback.
	 *
	 * @param handle Handle returned from `run` of callback to cancel
	 */
	void cancel(Handle handle);

	/**
	 * The type Handle.
	 */
	abstract class Handle extends js.extras.Handle {
	}
}
