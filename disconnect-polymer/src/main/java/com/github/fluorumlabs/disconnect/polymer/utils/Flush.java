package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import org.teavm.jso.JSBody;

@Import(symbols = "flush", module = "@polymer/polymer/lib/utils/flush.js")
public interface Flush extends Polymer {
    /**
     * Forces several classes of asynchronously queued tasks to flush:
     * - Debouncers added via `enqueueDebouncer`
     * - ShadyDOM distribution
     */
    @JSBody(
            script = "flush()"
    )
    static void flush() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
