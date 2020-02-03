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
@Import(symbols = "microTask", module = "@polymer/polymer/lib/utils/async.js")
public interface MicroTask extends Any {
    /**
     * Enqueues a function called at microtask timing.
     *
     * @param callback Callback to run
     *
     * @return Handle used for canceling task
     */
    @JSBody(params = "callback", script = "return microTask.run(callback)")
    static Handle run(JsRunnable callback) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Cancels a previously enqueued `microTask` callback.
     *
     * @param handle Handle returned from `run` of callback to cancel
     */
    @JSBody(params = "handle", script = "microTask.cancel(handle)")
    static void cancel(Handle handle) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    abstract class Handle extends js.extras.Handle {
    }
}
