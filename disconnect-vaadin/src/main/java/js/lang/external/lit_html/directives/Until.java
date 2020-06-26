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
    symbols = {"until as Until_until"},
    module = "lit-html/directives/until.js"
)
@Import(
    module = "lit-html/directives/until.js"
)
public interface Until extends Any {
  /**
   * Renders one of a series of values, including Promises, to a Part.
   *
   * Values are rendered in priority order, with the first argument having the
   * highest priority and the last argument having the lowest priority. If a
   * value is a Promise, low-priority values will be rendered until it resolves.
   *
   * The priority of values can be used to create placeholder content for async
   * data. For example, a Promise with pending content can be the first,
   * highest-priority, argument, and a non_promise loading indicator template can
   * be used as the second, lower-priority, argument. The loading indicator will
   * render immediately, and the primary content will render when the Promise
   * resolves.
   *
   * Example:
   *
   * <pre><code> const content = fetch('./content.txt').then(r =&gt; r.text());
   *  html`${until(content, html`&lt;span&gt;Loading...&lt;/span&gt;`)}`
   * </code></pre>
   */
  @JSBody(
      params = {"args"},
      script = "return Until_until.apply(null, args)"
  )
  static UntilResultFunction until(Unknown /* unknown */... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface UntilResultFunction extends Any {
    void apply(Part part);
  }
}
