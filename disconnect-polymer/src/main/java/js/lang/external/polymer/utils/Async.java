package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.external.polymer.AsyncInterface;
import js.lang.external.polymer.IdleDeadline;
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
  AsyncInterface after(int delay);

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
  int run(JsFunction fn, int delay);

  /**
   * Enqueues a function called in the next task.
   *
   * @return Handle used for canceling task
   *
   */
  int run(JsFunction fn);

  /**
   * Cancels a previously enqueued <code>timeOut</code> callback.
   *
   */
  void cancel(int handle);

  /**
   * Enqueues a function called at <code>requestAnimationFrame</code> timing.
   *
   * @return Handle used for canceling task
   *
   */
  int run(RunFnFn fn);

  /**
   * Cancels a previously enqueued <code>animationFrame</code> callback.
   *
   */
  void cancel(int handle);

  /**
   * Enqueues a function called at <code>requestIdleCallback</code> timing.
   *
   * @return Handle used for canceling task
   *
   */
  int run(RunFnFn fn);

  /**
   * Cancels a previously enqueued <code>idlePeriod</code> callback.
   *
   */
  void cancel(int handle);

  /**
   * Enqueues a function called at microtask timing.
   *
   * @return Handle used for canceling task
   *
   */
  int run(@Nullable JsFunction callback);

  /**
   * Enqueues a function called at microtask timing.
   *
   * @return Handle used for canceling task
   *
   */
  int run();

  /**
   * Cancels a previously enqueued <code>microTask</code> callback.
   *
   */
  void cancel(int handle);

  @FunctionalInterface
  @JSFunctor
  interface RunFnFn extends Any {
    void apply(int p0);
  }

  @FunctionalInterface
  @JSFunctor
  interface RunFnFn extends Any {
    void apply(IdleDeadline p0);
  }
}
