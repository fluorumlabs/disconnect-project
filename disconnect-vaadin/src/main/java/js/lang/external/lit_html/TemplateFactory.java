package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.JsMap;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"templateFactory as TemplateFactory_templateFactory", "templateCaches as TemplateFactory_templateCaches"},
    module = "lit-html/lib/template-factory.js"
)
@Import(
    module = "lit-html/lib/template-factory.js"
)
public interface TemplateFactory extends Any {
  Template apply(TemplateResult result);

  /**
   * The default TemplateFactory which caches Templates keyed on
   * result.type and result.strings.
   *
   */
  @JSBody(
      params = {"result"},
      script = "return TemplateFactory_templateFactory(result)"
  )
  static Template templateFactory(TemplateResult result) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return TemplateFactory_templateCaches"
  )
  static JsMap<Unknown /* string */, TemplateCache> templateCaches() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
