package js.lang.external.polymer.lib.utils;

import js.lang.Any;
import js.lang.JsFunction;
import js.lang.external.polymer.AsyncInterface;

public interface TimeOut extends Any {
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
}
