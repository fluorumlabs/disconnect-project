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
@Import(
		symbols = {"incrementInstanceCount", "dumpRegistrations"},
		module = "@polymer/polymer/lib/utils/telemetry.js"
)
public interface Telemetry extends Any {
	@JSBody(
			script = "incrementInstanceCount()"
	)
	static void incrementInstanceCount() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Logs all elements registered with an `is` to the console.
	 */
	@JSBody(
			script = "dumpRegistrations()"
	)
	static void dumpRegistrations() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
