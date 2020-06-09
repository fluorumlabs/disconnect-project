package js.lang.external.polymer.lib.utils;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

public interface AnimationFrame extends Any {
  /**
   * Enqueues a function called at <code>requestAnimationFrame</code> timing.
   *
   * @return Handle used for canceling task
   *
   */
  int run(Async.AnimationFrame.RunFn fn);

  /**
   * Cancels a previously enqueued <code>animationFrame</code> callback.
   *
   */
  void cancel(int handle);

  @FunctionalInterface
  @JSFunctor
  interface RunFn extends Any {
    void apply(int p0);
  }
}
