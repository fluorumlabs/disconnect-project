package js.lang.external.polymer.lib.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.external.polymer.AsyncInterface;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"Debouncer as Debouncer_Debouncer"},
    module = "@polymer/polymer/lib/utils/debounce.js"
)
public interface Debouncer extends Any {
  @JSBody(
      script = "return new Debouncer_Debouncer()"
  )
  static Debouncer create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Creates a debouncer if no debouncer is passed as a parameter
   * or it cancels an active debouncer otherwise. The following
   * example shows how a debouncer can be called multiple times within a
   * microtask and &quot;debounced&quot; such that the provided callback function is
   * called once. Add this method to a custom element:
   *
   * <pre><code class="language-js">import {microTask} from '@polymer/polymer/lib/utils/async.js';
   * import {Debouncer} from '@polymer/polymer/lib/utils/debounce.js';
   *    *
   * _debounceWork() {
   *   this._debounceJob = Debouncer.debounce(this._debounceJob,
   *       microTask, () =&gt; this._doWork());
   * }
   * </code></pre>
   * If the <code>_debounceWork</code> method is called multiple times within the same
   * microtask, the <code>_doWork</code> function will be called only once at the next
   * microtask checkpoint.
   *
   * Note: In testing it is often convenient to avoid asynchrony. To accomplish
   * this with a debouncer, you can use <code>enqueueDebouncer</code> and
   * <code>flush</code>. For example, extend the above example by adding
   * <code>enqueueDebouncer(this._debounceJob)</code> at the end of the
   * <code>_debounceWork</code> method. Then in a test, call <code>flush</code> to ensure
   * the debouncer has completed.
   *
   * @param debouncer Debouncer object.
   * @param asyncModule Object with Async interface
   * @param callback Callback to run.
   * @return Returns a debouncer object.
   *
   */
  @JSBody(
      params = {"debouncer", "asyncModule", "callback"},
      script = "return Debouncer_Debouncer.debounce(debouncer, asyncModule, callback)"
  )
  static Debouncer debounce(@Nullable Debouncer debouncer, AsyncInterface asyncModule,
      DebounceCallback callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets the scheduler; that is, a module with the Async interface,
   * a callback and optional arguments to be passed to the run function
   * from the async module.
   *
   * @param asyncModule Object with Async interface.
   * @param callback Callback to run.
   *
   */
  void setConfig(AsyncInterface asyncModule, SetConfigCallback callback);

  /**
   * Cancels an active debouncer and returns a reference to itself.
   *
   */
  void cancel();

  /**
   * Flushes an active debouncer and returns a reference to itself.
   *
   */
  void flush();

  /**
   * Returns true if the debouncer is active.
   *
   * @return True if active.
   *
   */
  boolean isActive();

  @FunctionalInterface
  @JSFunctor
  interface DebounceCallback extends Any {
    Any apply();
  }

  @FunctionalInterface
  @JSFunctor
  interface SetConfigCallback extends Any {
    Any apply();
  }
}
