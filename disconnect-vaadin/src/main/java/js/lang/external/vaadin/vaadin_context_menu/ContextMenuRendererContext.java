package js.lang.external.vaadin.vaadin_context_menu;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-context-menu",
    version = "^4.5.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-context-menu/vaadin-context-menu.js"
)
public interface ContextMenuRendererContext extends Any {
  @JSProperty("target")
  HTMLElement getTarget();

  @JSProperty("target")
  void setTarget(HTMLElement value);

  @JSProperty("detail")
  @Nullable
  Any getDetail();

  @JSProperty("detail")
  void setDetail(@Nullable Any value);

  class Builder {
    private final ContextMenuRendererContext object = Any.empty();

    public ContextMenuRendererContext build() {
      return object;
    }

    public Builder target(HTMLElement value) {
      object.setTarget(value);
      return this;
    }

    public Builder detail(@Nullable Any value) {
      object.setDetail(value);
      return this;
    }
  }
}
