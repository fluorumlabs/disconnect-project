package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.util.function.JsRunnable;
import org.teavm.jso.JSBody;

@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = {"flush", "beforeNextRender", "afterNextRender"},
		module = "@polymer/polymer/lib/utils/render-status.js"
)
public interface RenderStatus extends Any {
	/**
	 * Flushes all `beforeNextRender` tasks, followed by all `afterNextRender`
	 * tasks.
	 */
	@JSBody(
			script = "flush()"
	)
	static void flush() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Enqueues a callback which will be run before the next render, at
	 * `requestAnimationFrame` timing.
	 * <p>
	 * This method is useful for enqueuing work that requires DOM measurement,
	 * since measurement may not be reliable in custom element callbacks before
	 * the first render, as well as for batching measurement tasks in general.
	 * <p>
	 * Tasks in this queue may be flushed by calling `flush()`.
	 *
	 * @param callback Callback function
	 **/
	@JSBody(params = "callback", script = "beforeNextRender(window, callback)")
	static void beforeNextRender(JsRunnable callback) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Enqueues a callback which will be run after the next render, equivalent
	 * to one task (`setTimeout`) after the next `requestAnimationFrame`.
	 * <p>
	 * This method is useful for tuning the first-render performance of an
	 * element or application by deferring non-critical work until after the
	 * first paint.  Typical non-render-critical work may include adding UI
	 * event listeners and aria attributes.
	 *
	 * @param callback Callback function
	 */
	@JSBody(params = "callback", script = "afterNextRender(null, callback)")
	static void afterNextRender(JsRunnable callback) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
