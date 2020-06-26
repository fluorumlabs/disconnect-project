package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.TemplateStringsArray;
import js.lang.Unknown /* unknown */;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The return type of <code>html</code>, which holds a Template and the values from
 * interpolated expressions.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"TemplateResult as TemplateResult_TemplateResult"},
    module = "lit-html/lib/template-result.js"
)
@Import(
    module = "lit-html/lib/template-result.js"
)
public interface TemplateResult extends Any {
  @JSProperty("strings")
  TemplateStringsArray getStrings();

  @JSProperty("values")
  Unknown /* unknown */[] getValues();

  @JSProperty("type")
  String getType();

  @JSProperty("processor")
  TemplateProcessor getProcessor();

  @JSBody(
      params = {"strings", "values", "type", "processor"},
      script = "return new TemplateResult_TemplateResult(strings, values, type, processor)"
  )
  static TemplateResult create(TemplateStringsArray strings, Unknown /* unknown */[] values,
      String type, TemplateProcessor processor) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns a string of HTML used to create a <code>&lt;template&gt;</code> element.
   *
   */
  String getHTML();

  HTMLTemplateElement getTemplateElement();
}
