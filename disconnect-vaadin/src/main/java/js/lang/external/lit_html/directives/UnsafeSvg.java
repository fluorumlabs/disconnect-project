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
    symbols = {"unsafeSVG as UnsafeSvg_unsafeSVG"},
    module = "lit-html/directives/unsafe-svg.js"
)
@Import(
    module = "lit-html/directives/unsafe-svg.js"
)
public interface UnsafeSvg extends Any {
  /**
   * Renders the result as SVG, rather than text.
   *
   * Note, this is unsafe to use with any user-provided input that hasn't been
   * sanitized or escaped, as it may lead to cross-site-scripting
   * vulnerabilities.
   *
   */
  @JSBody(
      params = {"value"},
      script = "return UnsafeSvg_unsafeSVG(value)"
  )
  static UnsafeSVGResultFunction unsafeSVG(Unknown /* unknown */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface UnsafeSVGResultFunction extends Any {
    void apply(Part part);
  }
}
