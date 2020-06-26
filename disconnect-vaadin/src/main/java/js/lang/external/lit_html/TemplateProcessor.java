package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Element;

/**
 * @module lit-html
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/lib/template-processor.js"
)
public interface TemplateProcessor extends Any {
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
   * @param partOptions
   *
   */
  NodePart handleTextExpression(RenderOptions options);
}
