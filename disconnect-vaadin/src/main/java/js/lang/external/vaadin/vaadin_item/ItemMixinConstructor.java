package js.lang.external.vaadin.vaadin_item;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-item",
    version = "^2.3.0-alpha1"
)
@Import(
    symbols = {"ItemMixinConstructor as ItemMixinConstructor_ItemMixinConstructor"},
    module = "@vaadin/vaadin-item/src/vaadin-item-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-item/src/vaadin-item-mixin.js"
)
public interface ItemMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ItemMixinConstructor_ItemMixinConstructor.apply(null, args)"
  )
  static ItemMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
