package js.lang.external.lit_html.directives;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.external.lit_html.Part;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"templateContent as TemplateContent_templateContent"},
    module = "lit-html/directives/template-content.js"
)
@Import(
    module = "lit-html/directives/template-content.js"
)
public interface TemplateContent extends Any {
  /**
   * Renders the content of a template element as HTML.
   *
   * Note, the template should be developer controlled and not user controlled.
   * Rendering a user-controlled template with this directive
   * could lead to cross-site-scripting vulnerabilities.
   *
   */
  @JSBody(
      params = {"template"},
      script = "return TemplateContent_templateContent(template)"
  )
  static TemplateContentResultFunction templateContent(HTMLTemplateElement template) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface TemplateContentResultFunction extends Any {
    void apply(Part part);
  }
}
