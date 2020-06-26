package js.lang.external.vaadin.vaadin_menu_bar;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-menu-bar",
    version = "^1.2.0-alpha1"
)
@Import(
    symbols = {"ButtonsMixinConstructor as ButtonsMixinConstructor_ButtonsMixinConstructor"},
    module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-buttons-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-buttons-mixin.js"
)
public interface ButtonsMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ButtonsMixinConstructor_ButtonsMixinConstructor.apply(null, args)"
  )
  static ButtonsMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
