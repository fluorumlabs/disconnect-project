package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import com.github.fluorumlabs.disconnect.polymer.types.AsyncInterface;
import js.lang.Any;
import js.util.function.JsRunnable;
import org.teavm.jso.JSBody;

@NpmPackage(
        name = "@polymer/polymer",
        version = Polymer.VERSION
)
@Import(symbols = "timeOut", module = "@polymer/polymer/lib/utils/async.js")
public interface TimeOut extends Any {
    /**
     * Returns a sub-module with the async interface providing the provided
     * delay.
     *
     * @param delay Time to wait before calling callbacks in ms
     *
     * @return An async timeout interface
     */
    @JSBody(params = "delay", script = "return timeOut.after(delay)")
    static AsyncInterface after(double delay) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Enqueues a function called in the next task.
     *
     * @param fn    Callback to run
     * @param delay Delay in milliseconds
     *
     * @return Handle used for canceling task
     */
    @JSBody(
            params = {"fn", "delay"},
            script = "return timeOut.run(fn, delay)"
    )
    static Handle run(JsRunnable fn, double delay) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Cancels a previously enqueued `timeOut` callback.
     *
     * @param handle Handle returned from `run` of callback to cancel
     */
    @JSBody(params = "handle", script = "timeOut.cancel(handle)")
    static void cancel(Handle handle) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    abstract class Handle extends js.extras.Handle {
    }
}
