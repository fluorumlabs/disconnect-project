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
    symbols = {"cache as Cache_cache"},
    module = "lit-html/directives/cache.js"
)
@Import(
    module = "lit-html/directives/cache.js"
)
public interface Cache extends Any {
  /**
   * Enables fast switching between multiple templates by caching the DOM nodes
   * and TemplateInstances produced by the templates.
   *
   * Example:
   *
   * <pre><code>let checked = false;
   *
   * html`
   *   ${cache(checked ? html`input is checked` : html`input is not checked`)}
   * `
   * </code></pre>
   */
  @JSBody(
      params = {"value"},
      script = "return Cache_cache(value)"
  )
  static CacheResultFunction cache(Unknown /* unknown */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface CacheResultFunction extends Any {
    void apply(Part part);
  }
}
