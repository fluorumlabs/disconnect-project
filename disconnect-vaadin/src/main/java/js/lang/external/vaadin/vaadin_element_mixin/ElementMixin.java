package js.lang.external.vaadin.vaadin_element_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

@NpmPackage(
    name = "@vaadin/vaadin-element-mixin",
    version = "^2.4.1"
)
@Import(
    module = "@vaadin/vaadin-element-mixin/vaadin-element-mixin.js"
)
public interface ElementMixin extends DirMixin {
  class Builder {
    private final ElementMixin object = Any.empty();

    public ElementMixin build() {
      return object;
    }
  }
}
