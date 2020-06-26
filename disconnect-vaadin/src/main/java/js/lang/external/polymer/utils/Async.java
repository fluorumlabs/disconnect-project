package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.external.polymer.AsyncInterface;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/utils/async.js"
)
public interface Async extends Any {
  /**
   * Returns a sub-module with the async interface providing the provided
   * delay.
   *
   * @return An async timeout interface
   *
   */
  AsyncInterface after(double delay);

  /**
   * Returns a sub-module with the async interface providing the provided
   * delay.
   *
   * @return An async timeout interface
   *
   */
  AsyncInterface after();

  /**
   * Enqueues a function called in the next task.
   *
   * @return Handle used for canceling task
   *
   */
  double run(JsFunction fn, double delay);

  /**
   * Enqueues a function called in the next task.
   *
   * @return Handle used for canceling task
   *
   */
  double run(JsFunction fn);

  /**
   * Cancels a previously enqueued <code>timeOut</code> callback.
   *
   */
  void cancel(double handle);

  /**
   * Enqueues a function called at <code>requestAnimationFrame</code> timing.
   *
   * @return Handle used for canceling task
   *
   */
  double run(RunFnFunction fn);

  /**
   * Enqueues a function called at microtask timing.
   *
   * @return Handle used for canceling task
   *
   */
  double run();

  @FunctionalInterface
  @JSFunctor
  interface RunFnFunction extends Any {
    void apply(double p0);
  }
}
