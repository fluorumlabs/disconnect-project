package js.lang.external.vaadin.vaadin_element_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-element-mixin",
    version = "^2.4.1"
)
@Import(
    symbols = {"ElementMixinConstructor as ElementMixinConstructor_ElementMixinConstructor"},
    module = "@vaadin/vaadin-element-mixin/vaadin-element-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-element-mixin/vaadin-element-mixin.js"
)
public interface ElementMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ElementMixinConstructor_ElementMixinConstructor.apply(null, args)"
  )
  static ElementMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  void finalize();
}
