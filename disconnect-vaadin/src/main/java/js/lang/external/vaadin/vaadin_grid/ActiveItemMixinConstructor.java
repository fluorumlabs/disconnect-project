package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    symbols = {"ActiveItemMixinConstructor as ActiveItemMixinConstructor_ActiveItemMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-active-item-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-active-item-mixin.js"
)
public interface ActiveItemMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ActiveItemMixinConstructor_ActiveItemMixinConstructor.apply(null, args)"
  )
  static ActiveItemMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
