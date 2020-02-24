package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.util.function.JsRunnable;
import org.teavm.jso.JSBody;

/**
 * The interface Idle period.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(symbols = "idlePeriod", module = "@polymer/polymer/lib/utils/async.js")
public interface IdlePeriod extends Any {
	/**
	 * Enqueues a function called at <code>requestIdleCallback</code> timing.
	 *
	 * @param fn Callback to run
	 *
	 * @return Handle used for canceling task
	 */
	@JSBody(params = "fn", script = "return idlePeriod.run(fn)")
	static Handle run(JsRunnable fn) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Cancels a previously enqueued <code>idlePeriod</code> callback.
	 *
	 * @param handle Handle returned from <code>run</code> of callback to cancel
	 */
	@JSBody(params = "handle", script = "idlePeriod.cancel(handle)")
	static void cancel(Handle handle) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * The type Handle.
	 */
	abstract class Handle extends js.extras.Handle {
	}
}
