package js.lang.external.lit_html.directives;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"live as Live_live"},
    module = "lit-html/directives/live.js"
)
@Import(
    module = "lit-html/directives/live.js"
)
public interface Live extends Any {
  /**
   * Checks binding values against live DOM values, instead of previously bound
   * values, when determining whether to update the value.
   *
   * This is useful for cases where the DOM value may change from outside of
   * lit-html, such as with a binding to an <code>&lt;input&gt;</code> element's <code>value</code> property,
   * a content editable elements text, or to a custom element that changes it's
   * own properties or attributes.
   *
   * In these cases if the DOM value changes, but the value set through lit-html
   * bindings hasn't, lit-html won't know to update the DOM value and will leave
   * it alone. If this is not what you want—if you want to overwrite the DOM
   * value with the bound value no matter what—use the <code>live()</code> directive:
   *
   * <pre><code> html`&lt;input .value=${live(x)}&gt;`
   * </code></pre>
   * <code>live()</code> performs a strict equality check agains the live DOM value, and if
   * the new value is equal to the live value, does nothing. This means that
   * <code>live()</code> should not be used when the binding will cause a type conversion. If
   * you use <code>live()</code> with an attribute binding, make sure that only strings are
   * passed in, or the binding will update every render.
   *
   */
  @JSBody(
      params = {"value"},
      script = "return Live_live(value)"
  )
  static LiveResultFunction live(Unknown /* unknown */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface LiveResultFunction extends Any {
    void apply(Any part);
  }
}
