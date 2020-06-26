package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSBody;

/**
 * Creates Parts when a template is instantiated.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"defaultTemplateProcessor as DefaultTemplateProcessor_defaultTemplateProcessor"},
    module = "lit-html/lib/default-template-processor.js"
)
@Import(
    module = "lit-html/lib/default-template-processor.js"
)
public interface DefaultTemplateProcessor extends TemplateProcessor {
  /**
   * Create parts for an attribute-position binding, given the event, attribute
   * name, and string literals.
   *
   * @param element The element containing the binding
   * @param name  The attribute name
   * @param strings The string literals. There are always at least two strings,
   * event for fully-controlled bindings with a single expression.
   *
   */
  Array<Part> handleAttributeExpressions(Element element, String name, String[] strings,
      RenderOptions options);

  /**
   * Create parts for a text-position binding.
   * @param templateFactory
   *
   */
  NodePart handleTextExpression(RenderOptions options);

  @JSBody(
      script = "return DefaultTemplateProcessor_defaultTemplateProcessor"
  )
  static DefaultTemplateProcessor defaultTemplateProcessor() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
