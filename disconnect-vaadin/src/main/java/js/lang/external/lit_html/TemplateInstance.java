package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * An instance of a <code>Template</code> that can be attached to the DOM and updated
 * with new values.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"TemplateInstance as TemplateInstance_TemplateInstance"},
    module = "lit-html/lib/template-instance.js"
)
@Import(
    module = "lit-html/lib/template-instance.js"
)
public interface TemplateInstance extends Any {
  @JSProperty("processor")
  TemplateProcessor getProcessor();

  @JSProperty("options")
  RenderOptions getOptions();

  @JSProperty("template")
  Template getTemplate();

  @JSBody(
      params = {"template", "processor", "options"},
      script = "return new TemplateInstance_TemplateInstance(template, processor, options)"
  )
  static TemplateInstance create(Template template, TemplateProcessor processor,
      RenderOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  void update(Unknown /* unknown */[] values);
}
