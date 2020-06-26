package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.EventTarget;
import org.teavm.jso.JSProperty;

/**
 * @module lit-html
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/lib/render-options.js"
)
public interface RenderOptions extends Any {
  @JSProperty("templateFactory")
  TemplateFactory getTemplateFactory();

  @JSProperty("eventContext")
  @Nullable
  EventTarget getEventContext();

  class Builder {
    private final RenderOptions object = Any.empty();

    public RenderOptions build() {
      return object;
    }
  }
}
