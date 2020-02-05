package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.util.function.JsDoubleConsumer;
import org.teavm.jso.JSBody;

@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(symbols = "animationFrame", module = "@polymer/polymer/lib/utils/async.js")
public interface AnimationFrame extends Any {
	/**
	 * Enqueues a function called at `requestAnimationFrame` timing.
	 * FIXME param fn: function (number): void
	 *
	 * @param fn Callback to run
	 *
	 * @return Handle used for canceling task
	 */
	@JSBody(params = "fn", script = "return animationFrame.run(fn)")
	static Handle run(JsDoubleConsumer fn) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Cancels a previously enqueued <code>animationFrame</code> callback.
	 *
	 * @param handle Handle returned from <code>run</code> of callback to cancel
	 */
	@JSBody(params = "handle", script = "animationFrame.cancel(handle)")
	static void cancel(Handle handle) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	abstract class Handle extends js.extras.Handle {
	}
}
