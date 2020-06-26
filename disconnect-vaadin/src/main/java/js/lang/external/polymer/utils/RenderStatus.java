package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"flush as RenderStatus_flush", "beforeNextRender as RenderStatus_beforeNextRender", "afterNextRender as RenderStatus_afterNextRender"},
    module = "@polymer/polymer/lib/utils/render-status.js"
)
@Import(
    module = "@polymer/polymer/lib/utils/render-status.js"
)
public interface RenderStatus extends Any {
  /**
   * Flushes all <code>beforeNextRender</code> tasks, followed by all <code>afterNextRender</code>
   * tasks.
   *
   */
  @JSBody(
      script = "RenderStatus_flush()"
  )
  static void flush() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Enqueues a callback which will be run before the next render, at
   * <code>requestAnimationFrame</code> timing.
   *
   * This method is useful for enqueuing work that requires DOM measurement,
   * since measurement may not be reliable in custom element callbacks before
   * the first render, as well as for batching measurement tasks in general.
   *
   * Tasks in this queue may be flushed by calling <code>flush()</code>.
   *
   */
  @JSBody(
      params = {"context", "callback", "args"},
      script = "RenderStatus_beforeNextRender(context, callback, args)"
  )
  static void beforeNextRender(Any context, BeforeNextRenderCallbackFunction callback, Any[] args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Enqueues a callback which will be run before the next render, at
   * <code>requestAnimationFrame</code> timing.
   *
   * This method is useful for enqueuing work that requires DOM measurement,
   * since measurement may not be reliable in custom element callbacks before
   * the first render, as well as for batching measurement tasks in general.
   *
   * Tasks in this queue may be flushed by calling <code>flush()</code>.
   *
   */
  @JSBody(
      params = {"context", "callback"},
      script = "RenderStatus_beforeNextRender(context, callback)"
  )
  static void beforeNextRender(Any context, BeforeNextRenderCallbackFunction callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Enqueues a callback which will be run after the next render, equivalent
   * to one task (<code>setTimeout</code>) after the next <code>requestAnimationFrame</code>.
   *
   * This method is useful for tuning the first-render performance of an
   * element or application by deferring non-critical work until after the
   * first paint.  Typical non-render-critical work may include adding UI
   * event listeners and aria attributes.
   *
   */
  @JSBody(
      params = {"context", "callback", "args"},
      script = "RenderStatus_afterNextRender(context, callback, args)"
  )
  static void afterNextRender(Any context, AfterNextRenderCallbackFunction callback, Any[] args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Enqueues a callback which will be run after the next render, equivalent
   * to one task (<code>setTimeout</code>) after the next <code>requestAnimationFrame</code>.
   *
   * This method is useful for tuning the first-render performance of an
   * element or application by deferring non-critical work until after the
   * first paint.  Typical non-render-critical work may include adding UI
   * event listeners and aria attributes.
   *
   */
  @JSBody(
      params = {"context", "callback"},
      script = "RenderStatus_afterNextRender(context, callback)"
  )
  static void afterNextRender(Any context, AfterNextRenderCallbackFunction callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface BeforeNextRenderCallbackFunction extends Any {
    @JSBody(
        params = {"p0"},
        script = "this.apply.apply(this, p0)"
    )
    void apply(Any... p0);
  }

  @FunctionalInterface
  @JSFunctor
  interface AfterNextRenderCallbackFunction extends Any {
    @JSBody(
        params = {"p0"},
        script = "this.apply.apply(this, p0)"
    )
    void apply(Any... p0);
  }
}
