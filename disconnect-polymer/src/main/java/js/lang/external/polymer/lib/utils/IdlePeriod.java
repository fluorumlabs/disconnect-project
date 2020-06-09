package js.lang.external.polymer.lib.utils;

import java.lang.FunctionalInterface;
import js.lang.Any;
import js.lang.external.polymer.IdleDeadline;
import org.teavm.jso.JSFunctor;

public interface IdlePeriod extends Any {
  /**
   * Enqueues a function called at <code>requestIdleCallback</code> timing.
   *
   * @return Handle used for canceling task
   *
   */
  int run(Async.IdlePeriod.RunFn fn);

  /**
   * Cancels a previously enqueued <code>idlePeriod</code> callback.
   *
   */
  void cancel(int handle);

  @FunctionalInterface
  @JSFunctor
  interface RunFn extends Any {
    void apply(IdleDeadline p0);
  }
}
