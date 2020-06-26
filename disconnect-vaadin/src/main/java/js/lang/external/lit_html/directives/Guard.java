package js.lang.external.lit_html.directives;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* unknown */;
import js.lang.external.lit_html.Part;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"guard as Guard_guard"},
    module = "lit-html/directives/guard.js"
)
@Import(
    module = "lit-html/directives/guard.js"
)
public interface Guard extends Any {
  /**
   * Prevents re-render of a template function until a single value or an array of
   * values changes.
   *
   * Example:
   *
   * <pre><code class="language-js">html`
   *   &lt;div&gt;
   *     ${guard([user.id, company.id], () =&gt; html`...`)}
   *   &lt;/div&gt;
   * </code></pre>
   * In this case, the template only renders if either <code>user.id</code> or <code>company.id</code>
   * changes.
   *
   * guard() is useful with immutable data patterns, by preventing expensive work
   * until data updates.
   *
   * Example:
   *
   * <pre><code class="language-js">html`
   *   &lt;div&gt;
   *     ${guard([immutableItems], () =&gt; immutableItems.map(i =&gt; html`${i}`))}
   *   &lt;/div&gt;
   * </code></pre>
   * In this case, items are mapped over only when the array reference changes.
   *
   * @param value the value to check before re-rendering
   * @param f the template function
   *
   */
  @JSBody(
      params = {"value", "f"},
      script = "return Guard_guard(value, f)"
  )
  static GuardResultFunction guard(Unknown /* unknown */ value, GuardFFunction f) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface GuardResultFunction extends Any {
    void apply(Part part);
  }

  @FunctionalInterface
  @JSFunctor
  interface GuardFFunction extends Any {
    Unknown /* unknown */ apply();
  }
}
