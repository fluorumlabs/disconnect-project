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
    symbols = {"unsafeHTML as UnsafeHtml_unsafeHTML"},
    module = "lit-html/directives/unsafe-html.js"
)
@Import(
    module = "lit-html/directives/unsafe-html.js"
)
public interface UnsafeHtml extends Any {
  /**
   * Renders the result as HTML, rather than text.
   *
   * Note, this is unsafe to use with any user-provided input that hasn't been
   * sanitized or escaped, as it may lead to cross-site-scripting
   * vulnerabilities.
   *
   */
  @JSBody(
      params = {"value"},
      script = "return UnsafeHtml_unsafeHTML(value)"
  )
  static UnsafeHTMLResultFunction unsafeHTML(Unknown /* unknown */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface UnsafeHTMLResultFunction extends Any {
    void apply(Part part);
  }
}
