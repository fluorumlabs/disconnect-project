package js.lang.external.polymer.lib.utils;

import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;

public interface MicroTask extends Any {
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
}
