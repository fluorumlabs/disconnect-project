package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.util.function.JsRunnable;
import org.teavm.jso.JSBody;

@Import(symbols = "idlePeriod", module = "@polymer/polymer/lib/utils/async.js")
public interface IdlePeriod extends Polymer {
    /**
     * Enqueues a function called at `requestIdleCallback` timing.
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
     * Cancels a previously enqueued `idlePeriod` callback.
     *
     * @param handle Handle returned from `run` of callback to cancel
     */
    @JSBody(params = "handle", script = "idlePeriod.cancel(handle)")
    static void cancel(Handle handle) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    abstract class Handle extends js.extras.Handle {
    }
}
