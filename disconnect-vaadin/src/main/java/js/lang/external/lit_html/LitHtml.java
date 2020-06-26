package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.TemplateStringsArray;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"svg as LitHtml_svg", "html as LitHtml_html"},
    module = "lit-html/lit-html.js"
)
@Import(
    module = "lit-html/lit-html.js"
)
public interface LitHtml extends Any {
  /**
   * Interprets a template literal as an HTML template that can efficiently
   * render to and update a container.
   *
   */
  @JSBody(
      params = {"strings", "values"},
      script = "return LitHtml_html.apply(null, [strings].concat(values))"
  )
  static TemplateResult html(TemplateStringsArray strings, Unknown /* unknown */... values) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Interprets a template literal as an SVG template that can efficiently
   * render to and update a container.
   *
   */
  @JSBody(
      params = {"strings", "values"},
      script = "return LitHtml_svg.apply(null, [strings].concat(values))"
  )
  static SVGTemplateResult svg(TemplateStringsArray strings, Unknown /* unknown */... values) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
