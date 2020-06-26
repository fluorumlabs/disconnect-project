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
    symbols = {"InteractionsMixinConstructor as InteractionsMixinConstructor_InteractionsMixinConstructor"},
    module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-interactions-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-interactions-mixin.js"
)
public interface InteractionsMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return InteractionsMixinConstructor_InteractionsMixinConstructor.apply(null, args)"
  )
  static InteractionsMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
