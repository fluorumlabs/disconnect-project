package js.lang.external.lit_html.polyfills;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"initTemplatePolyfill as Template_polyfill_initTemplatePolyfill"},
    module = "lit-html/polyfills/template_polyfill.js"
)
@Import(
    module = "lit-html/polyfills/template_polyfill.js"
)
public interface Template_polyfill extends Any {
  /**
   * A lightweight <template> polyfill that supports minimum features to cover
   * lit-html use cases. It provides an alternate route in case <template> is not
   * natively supported.
   * Please note that nested template, cloning template node and innerHTML getter
   * do NOT work with this polyfill.
   * If it can not fulfill your requirement, please consider using the full
   * polyfill: <a href="https://github.com/webcomponents/template">https://github.com/webcomponents/template</a>
   *
   */
  @JSBody(
      params = {"forced"},
      script = "Template_polyfill_initTemplatePolyfill(forced)"
  )
  static void initTemplatePolyfill(boolean forced) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A lightweight <template> polyfill that supports minimum features to cover
   * lit-html use cases. It provides an alternate route in case <template> is not
   * natively supported.
   * Please note that nested template, cloning template node and innerHTML getter
   * do NOT work with this polyfill.
   * If it can not fulfill your requirement, please consider using the full
   * polyfill: <a href="https://github.com/webcomponents/template">https://github.com/webcomponents/template</a>
   *
   */
  @JSBody(
      params = {},
      script = "Template_polyfill_initTemplatePolyfill()"
  )
  static void initTemplatePolyfill() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
