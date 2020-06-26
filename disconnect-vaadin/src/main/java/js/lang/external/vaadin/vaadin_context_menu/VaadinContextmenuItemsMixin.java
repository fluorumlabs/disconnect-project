package js.lang.external.vaadin.vaadin_context_menu;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-context-menu",
    version = "^4.5.0-alpha2"
)
@Import(
    symbols = {"ItemsMixin as VaadinContextmenuItemsMixin_ItemsMixin"},
    module = "@vaadin/vaadin-context-menu/src/vaadin-contextmenu-items-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-context-menu/src/vaadin-contextmenu-items-mixin.js"
)
public interface VaadinContextmenuItemsMixin extends Any {
  @JSBody(
      params = {"base"},
      script = "return VaadinContextmenuItemsMixin_ItemsMixin(base)"
  )
  static <T extends JsFunction> Any ItemsMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
