package js.lang.external.vaadin.vaadin_context_menu;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-context-menu",
    version = "^4.5.0-alpha2"
)
@Import(
    symbols = {"ItemsMixinConstructor as ItemsMixinConstructor_ItemsMixinConstructor"},
    module = "@vaadin/vaadin-context-menu/src/vaadin-contextmenu-items-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-context-menu/src/vaadin-contextmenu-items-mixin.js"
)
public interface ItemsMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ItemsMixinConstructor_ItemsMixinConstructor.apply(null, args)"
  )
  static ItemsMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
