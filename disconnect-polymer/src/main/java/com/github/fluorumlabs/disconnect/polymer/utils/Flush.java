package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(symbols = "flush", module = "@polymer/polymer/lib/utils/flush.js")
public interface Flush extends Any {
	/**
	 * Forces several classes of asynchronously queued tasks to flush:
	 *
	 * <ul>
	 * <li>Debouncers added via <code>enqueueDebouncer</code></li>
	 * <li>ShadyDOM distribution</li>
	 * </ul>
	 */
	@JSBody(
			script = "flush()"
	)
	static void flush() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
